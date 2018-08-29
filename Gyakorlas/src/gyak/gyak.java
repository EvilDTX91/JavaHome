package gyak;
public class gyak {
    
    public String SzovegFordito(String kapottszoveg){
        int kszhossz = kapottszoveg.length()-1;
        String ujszoveg = "";
        String atszoveg = "";
        
        for(int i=kszhossz; i>=0 ;i--){
            atszoveg = atszoveg + kapottszoveg.charAt(i);
           //System.out.println("TESZT");
        }
        ujszoveg = atszoveg;
        atszoveg = "";
        //System.out.println("Fordito Ujszoveg: " + ujszoveg);
            return ujszoveg;
    }
    public boolean SzovegEllenor(String kapottszoveg){
        int kszhossz = kapottszoveg.length()-1;
        String ujszoveg = "";
        String atszoveg = "";
        
        for(int i = 0; i <= kszhossz; i++){ 
            /*elejéről kezdi a szöveg be járását, majd át adja az aktuális szót a fordítónak
            ami meg fordítja majd vissza adja a már megfordított szót, maga a fordító már hátulról kezdi a szöveg be járást
            ezáltal meg fordítva azt.
        
            Abban az esetben ha az egész mondatot át akarjuk fordítani akkor hátulról kell kezdeni
            a be járást, abban az esetben az írásjel a szöveg elejére kerül majd így mindig FALSE értkékkel tér vissz
            Ez a megoldás működik! De a végére be kell szúrni egy ujszoveg += atszoveg;' hozzű fűzést különben le marad az utolsó
            szó!
            */
            //for(int i = kszhossz; i >= 0; i--){ 
            if(kapottszoveg.charAt(i) == ' '){
                atszoveg = SzovegFordito(atszoveg);
                atszoveg += kapottszoveg.charAt(i);
                ujszoveg += atszoveg;
                atszoveg = "";
            }
            else if(kapottszoveg.charAt(i) == '!'){
                atszoveg = SzovegFordito(atszoveg);
                atszoveg += kapottszoveg.charAt(i);
                ujszoveg += atszoveg;
                atszoveg = "";
            }
            else if(kapottszoveg.charAt(i) == '?'){
                atszoveg = SzovegFordito(atszoveg);
                atszoveg += kapottszoveg.charAt(i);
                ujszoveg += atszoveg;
                atszoveg = "";
            }
            else if(kapottszoveg.charAt(i) == '.'){
                atszoveg = SzovegFordito(atszoveg);
                atszoveg += kapottszoveg.charAt(i);
                ujszoveg += atszoveg;
                atszoveg = "";
            }
            else {
                atszoveg += kapottszoveg.charAt(i);
            }
            //System.out.println("WTF:" + atszoveg + "(" + i + ")");
            //ujszoveg += atszoveg;
            //atszoveg = "";
        }
        //ujszoveg += atszoveg;
        
        System.out.println("Kész Szoveg:" + ujszoveg);
        if(kapottszoveg.equals(ujszoveg)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean Palidrom(String kapottszo){
        String ujszo = SzovegFordito(kapottszo);
        
        if(ujszo.equals(kapottszo))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        gyak szovegfordito = new gyak();
        String szoveg = "kafa kék görög fa!";
        String szo = "Pöttöm!";
        
        System.out.println("Alap szoveg:" + szoveg);
        
        if(szovegfordito.SzovegEllenor(szoveg)==true){
            System.out.println("OK!");
        }
        else{
            System.out.println("NOK!");
        }
        
        System.out.println("Alap szo:" + szo);
        if(szovegfordito.Palidrom(szo)==true){
            System.out.println("A '" + szo + "' szo palidrom!");
        }
        else{
            System.out.println("A '" + szo + "' szo NEM palidrom!");
        }
    }
    
}
