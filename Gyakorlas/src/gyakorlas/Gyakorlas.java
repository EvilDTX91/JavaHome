package gyakorlas;
/*
A program el dönti egy megadott szóról hogy palidróm-e
*/
import java.io.*;
import java.util.*;

public class Gyakorlas {
    public boolean Palidrom(String megadottSzo){
        String szo = megadottSzo;
        String forditottSzo = "";
        int szoHossz = megadottSzo.length();
        
        for(int i=(szoHossz-1); i>=0; i--)
        {
            forditottSzo = forditottSzo + szo.charAt(i);
        }
        System.out.println(forditottSzo);
        if(megadottSzo.equals(forditottSzo))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public boolean PalidromSzoveg(String megadottSzoveg)
    {
    String szoveg = megadottSzoveg;
    String forditottSzoveg = "";
    
    //String palindrome = "Dot saw I was Tod";
    int len = szoveg.length();
    StringBuilder dest = new StringBuilder(len);
    
    for (int i = (len - 1); i >= 0; i--) {
    dest.append(szoveg.charAt(i));
    }
    //System.out.println(dest.toString());
    forditottSzoveg = dest.toString();
    System.out.println(forditottSzoveg);
    if(megadottSzoveg.equals(dest.toString()))
    {
        return true;    
    }
    else
    {
        return false;
    }
    }
    
    public boolean PalidromTomb(String megadottSzoveg){
        int len = megadottSzoveg.length()-1;
        String szovegek="";
        for(int i=len; i>=0; i--)
        {
            char szoveg = (char)megadottSzoveg.charAt(i);
            //char[] szovegtomb = {szoveg};
            szovegek += szoveg;
            
        }
        System.out.println(szovegek);
        if(megadottSzoveg.equals(szovegek))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public String SzoCsere(String megadottSzoveg)
    {   int len = megadottSzoveg.length()-1;
    
        String forditottSzo = "";
        int szoHossz = megadottSzoveg.length();
        
        for(int i=len; i>=0; i--)
        {
            forditottSzo += megadottSzoveg.charAt(i);
        }
        //System.out.println(forditottSzo);
        return forditottSzo;
        
        
    }
    public boolean PalidromSzoFordito(String megadottSzoveg){
        int len = megadottSzoveg.length()-1;
        String ujSzoveg = "";
        String keszSzoveg = "";
        
        for(int i = 0; i<=len; i++)
        {
            if(megadottSzoveg.charAt(i) != ' ')
            {
                ujSzoveg += megadottSzoveg.charAt(i);
                //System.out.print(megadottSzoveg.charAt(i));
            }
            else if(megadottSzoveg.charAt(i) == ' ')
            {
                //System.out.print("\n");
                keszSzoveg += SzoCsere(ujSzoveg) + " ";
                ujSzoveg = "";
            }
            else if (megadottSzoveg.charAt(i) == '!')
                    {
                        keszSzoveg += SzoCsere(ujSzoveg) + " ";
                        ujSzoveg = "";
                    }
            else if (megadottSzoveg.charAt(i) == '.')
                    {
                        keszSzoveg += SzoCsere(ujSzoveg) + " ";
                        ujSzoveg = "";
                    }
            else if (megadottSzoveg.charAt(i) == '?')
                    {
                        keszSzoveg += SzoCsere(ujSzoveg) + " ";
                        ujSzoveg = "";
                    }
            else
            {
                keszSzoveg += SzoCsere(ujSzoveg) + " ";
                ujSzoveg = "";
            }
        }
        keszSzoveg += SzoCsere(ujSzoveg) + " ";
        ujSzoveg = "";
                
        //System.out.println("\n" + ujSzoveg);
        System.out.println(megadottSzoveg);
        System.out.println(keszSzoveg);
        if(keszSzoveg.equalsIgnoreCase(megadottSzoveg))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String betukihagyo(char kihagyandobetu, String megadottSzoveg)
    {   String ujSzoveg = "";
        char kihagy = kihagyandobetu;
    
        for(int i=0; i<megadottSzoveg.length(); i++)
        {
            if(megadottSzoveg.charAt(i) != kihagy)
            {
            ujSzoveg += megadottSzoveg.charAt(i);    
            }    
        }
        return ujSzoveg;
    }
    
    private boolean PrimSzamEllenor(int kapottSzam){
        int szamlalo=0;
        
        for(int i=1; i<=kapottSzam; i++)
        {
            if(kapottSzam % i == 0)
            {
                szamlalo++;
            }
        }
        if(szamlalo <= 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Gyakorlas teszt = new Gyakorlas();
        //String bevittSzoveg="dot saw I was tod";
        String bevittSzoveg="ngézd mgár ag kugrvga agnyjgát!";
        
        int primszam = 1111;
        
        if(teszt.PrimSzamEllenor(primszam) == true)
        {
            System.out.println("A megadott szám (" + primszam + ") prímszám!\t");
        }
        else
        {
            System.out.println("A megadott szám (" + primszam + ") NEM prímszám!\t");
        }
        
        System.out.println(teszt.betukihagyo('g',bevittSzoveg) + "\n");
        
        if(teszt.Palidrom(bevittSzoveg))
        {
            System.out.println("A megadott szó Palidrom! 1" + "\n");
        }
        else
        {
            System.out.println("A megadott szó nem Palidrom! 1" + "\n");
        }
        
        if(teszt.PalidromSzoveg(bevittSzoveg))
        {
            System.out.println("A megadott szöveg Palidrom! 2" + "\n");
        }
        else
        {
            System.out.println("A megadott szöveg nem Palidrom! 2" + "\n");
        }
        
        if(teszt.PalidromTomb(bevittSzoveg))
        {
            System.out.println("A megadott tömb Palidrom! 3" + "\n");
        }
        else
        {
            System.out.println("A megadott tömb nem Palidrom! 3" + "\n");
        }
        
        if(teszt.PalidromSzoFordito(bevittSzoveg))
        {
            System.out.println("A megadott tömb Palidrom! 4" + "\n");
        }
        else
        {
            System.out.println("A megadott tömb nem Palidrom! 4" + "\n");
        }
        
        /* Az eredeti program, ez lett átírva egy objektumba
        String szoveg = "kék görög";
        String ujszoveg = "";   
        System.out.println(szoveg);
        
        for(int i=szoveg.length()-1; i>=0; i--)
        {
            //char betu = szoveg.charAt(i);
            //System.out.println(i);
            System.out.print(szoveg.charAt(i));
            ujszoveg = ujszoveg + szoveg.charAt(i);
        }
        System.out.print("\n");
        System.out.print(ujszoveg);
        System.out.print("\n");
        
        if(szoveg.equals(ujszoveg))
        {
            System.out.println("A meg adott szó Palidróm!");
        }*/
    }
    
}
