/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyxy;

/**
 *
 * @author Tomi
 */
public class Gyxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=2;
        int y=5;
        
        System.out.println("Az 'x' értéke:\t" + x);
        int x2 = x*x;
        System.out.println("Az 'x' négyzete: " + x2);
        System.out.println("Az 'y' értéke:\t" + y);
        int y2 = y*y;
        System.out.println("Az 'y' négyzete: " + y2);
        int xy = x2+y2;
        System.out.println("Az 'x' és 'y' négyzetének összege: " + xy);
    }
    
}
