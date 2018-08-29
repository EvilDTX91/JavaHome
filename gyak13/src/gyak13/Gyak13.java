/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak13;

/**
 *
 * @author Tomi
 */
public class Gyak13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int x = 13;
        
        for(int i=1;i<=400;i++)
        {
            System.out.print(x*i + ",");
            if(i%20==0)
                {
                System.out.print("\n");
                }
        }
    }
    
}
