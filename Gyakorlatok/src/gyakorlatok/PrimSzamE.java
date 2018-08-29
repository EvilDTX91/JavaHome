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
public class PrimSzamE extends GyakorlatokMain {


    /*Megvizsgálja a megadott számot, elindít egy cikulst, a ciklus elemeivel oszt és vizsgál
    majd a 'db' eredménye alapján vissza tér egy értékkel*/
    
    private boolean PrimSzamEldontoFor(int kapottSzam)
    {
     int  db = 0;
     
     System.out.print("Osztók: ");
     for(int i=1; i<=kapottSzam; i++)
     {
         if(kapottSzam%i == 0)
         {
             System.out.print(i + ",");
             db++;
         }
     }
     //System.out.println(db);
     
     if(db<=2)
     {
         return true;
     }
     else
         return false;
    }
    
    boolean PrimSzamEldontoHivo(int kapottSzam)
    {
        return PrimSzamEldontoFor(kapottSzam);
    }
    
    
    private void PrimSzamListazoFor(int kapottSzam)
    {
        int db=0;
        System.out.print("\n" + kapottSzam + "-ig a Prím számok: ");
        for(int i=1; i<=kapottSzam; i++)
        {
                //System.out.print("\n" + i + ": ");
                for(int j=1; j<=i; j++)
                {
                    if(i%j==0)
                    db++;
                    //System.out.print(db + "+");
                }
                   // System.out.print(db + ",");
            if(db <= 2)
            {
               System.out.print(i + ",");
                db=0;
            }
            else
            {
                db=0;
            }
        }
    }
    void PrimSzamListazoHivo(int kapottSzam)
    {
        if(PrimSzamEldontoHivo(kapottSzam) == true)
        {
        PrimSzamListazoFor(kapottSzam);
        }
        else
        {
            System.out.println("\tA megadott szám NEM Prímszám! (" + kapottSzam + ")");
        }
    }
    
}
