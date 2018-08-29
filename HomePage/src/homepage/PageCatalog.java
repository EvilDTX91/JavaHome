package homepage;
import java.net.*;
public class PageCatalog {
    public static void main(String[] args) {
        HomePage[] catalog = new HomePage[5]; //tömb létrehozása
        try{//kivétel kezelés kezdése pl érvényes URL objektummá átalakítható-e
            //a tömb feltöltése adatokkal
            catalog[0] = new HomePage("Mark Evanier", "http://www.newsfromme.com,", "comic books");
            catalog[1] = new HomePage("Todd Smith", "http://www.sharkbitten.com,", "music");
            catalog[2] = new HomePage("Rogers Cadenhead", "http://www.cadenhead.org/workbench,", "programing");
            catalog[3] = new HomePage("Juan Cole", "http://www.juancole.com,", "politics");
            catalog[4] = new HomePage("Rafe Coldurn", "www.rc4.org", "comic books");
            
        for(int i=0;i<catalog.length;i++){
            //a tömb be járása és az adatok ki írása
            System.out.println(catalog[i].owner + ": " + catalog[i].address + " -- "
            + catalog[i].category);
            }
        }
        catch (MalformedURLException e){
            //ha nem lehet érvényes URL obejktummá átalakítani kivételt vált ki és itt kezeli
                System.out.println("Error: " + e.getMessage());
                }
    }    
}
