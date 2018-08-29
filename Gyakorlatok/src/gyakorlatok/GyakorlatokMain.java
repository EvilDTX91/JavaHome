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
public class GyakorlatokMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int plSzam = 23;
        String plSzo = "törög banyád tenger fenekén van!";
        
        PrimSzamE szamPelda = new PrimSzamE();
        SzoFordito szoPelda = new SzoFordito();
        
        try{
            if(szamPelda.PrimSzamEldontoHivo(plSzam) == true)
            {
                System.out.println("\nA megadott szám Prímszám!(" + plSzam +")");
            }
            else
            {
                System.out.println("\nA megadott szám NEM Prímszám!(" + plSzam +")");
            }
            }
        catch (NumberFormatException e){
                System.out.println("Számot kell megadni. (" + e + ")");
            }
        catch (ArithmeticException e) {
                System.out.println("A szám nem lehet nulla. (" + e + ")");
        }
        
        
        szamPelda.PrimSzamListazoHivo(plSzam);
        
        System.out.println("\n" + "Eredeti szöveg: " + plSzo);
        System.out.println(szoPelda.SzoForditoHivo(plSzo));
        System.out.println(szoPelda.SzavankentForditoHivo(plSzo));
    }
    
}
