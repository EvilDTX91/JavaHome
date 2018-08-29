/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credits;
public class Credits {
    public static void main(String[] args) {
        // a film adatainak beállítása
        String title= "The Piano";
        int year = 1993;
        String director = "Jane Campion";
        String role1 = "Ada";
        String actor1 = "Holly Hunter";
        String role2 = "Baines";
        String actor2 = "Harvey Keitel";
        String role3 = "Stewart";
        String actor3 = "Sam Neill";
        String role4 = "Flora";
        String actor4 = "Anna Paquin";
        
        //az adatok megjelenítése
        System.out.println(title + " (" + year + ")\n" +
                "A " + director + " film.\n\n" + 
                role1.toUpperCase() + "\t" + actor1.toUpperCase() + "\n" +
                role2.toUpperCase() + "\t" + actor2.toUpperCase() + "\n" +
                role3.toUpperCase() + "\t" + actor3.toUpperCase() + "\n" +
                role4.toUpperCase() + "\t" + actor4.toUpperCase());
    }
    
}
