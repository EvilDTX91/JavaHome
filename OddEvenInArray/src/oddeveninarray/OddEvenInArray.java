/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddeveninarray;

/**
 *
 * @author Tomi
 */
public class OddEvenInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numbers = {1,2,5,6,3,2};
        
        System.out.print("Odd numbers:"); //páratlan
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] % 2 != 0)
            {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();
        
        System.out.print("Even numbers:"); //páros
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] % 2 == 0)
            {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();
    }
    
}
