/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlatok;

/**
 *
 * @author Tomi
 */
public class SzoFordito extends GyakorlatokMain{
    
    private String SzoForditasa(String kapottSzo)
    {
        String ujSzo = "";
        
        for(int i = kapottSzo.length()-1; i>=0; i--)
        {
            ujSzo+=kapottSzo.charAt(i);
        }
        
        return ujSzo;
    }
    
    String SzoForditoHivo(String kapottSzo)
    {
        return SzoForditasa(kapottSzo);
    }
    
    private String SzavankentFordito(String kapottSzoveg)
    {
        String ujSzoveg = "";
        String keszSzoveg = "";
        
        for(int i = 0; i<=kapottSzoveg.length()-1; i++)
        {
            //ujSzoveg += kapottSzoveg.charAt(i);
            if(kapottSzoveg.charAt(i) != ' ')
            {
            ujSzoveg += kapottSzoveg.charAt(i);
            }
            else if(kapottSzoveg.charAt(i) == ' ')
            {
                keszSzoveg += SzoForditoHivo(ujSzoveg) + " ";
                ujSzoveg = "";
            }
            else if(kapottSzoveg.charAt(i) == '.')
            {
                keszSzoveg += SzoForditoHivo(ujSzoveg) + " ";
                ujSzoveg = "";
            }
            else if(kapottSzoveg.charAt(i) == '!')
            {
                keszSzoveg += SzoForditoHivo(ujSzoveg) + " ";
                ujSzoveg = "";
            }
            else if(kapottSzoveg.charAt(i) == '?')
            {
                keszSzoveg += SzoForditoHivo(ujSzoveg) + " ";
                ujSzoveg = "";
            }
            else
            {
                keszSzoveg += SzoForditoHivo(ujSzoveg) + " ";
                ujSzoveg = "";
            }
            
            /*if(kapottSzoveg.length()-1 == i)
            {
                keszSzoveg += SzoForditoHivo(ujSzoveg) + " ";
                ujSzoveg = "";
            }*/
        }
        keszSzoveg += SzoForditoHivo(ujSzoveg) + " ";
        ujSzoveg = "";
        
        return keszSzoveg;
    }
    
    String SzavankentForditoHivo(String kapottSzoveg)
    {
        return SzavankentFordito(kapottSzoveg);
    }
    
}
