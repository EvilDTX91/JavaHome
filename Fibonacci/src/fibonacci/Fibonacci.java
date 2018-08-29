/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.*;

/**
 *
 * @author Tomi
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public void fibo(int x){
        int a=0;
        int b=1;
        int c=0;
        
        if(x>0)
            {
            for(int i = 0; i<=x; i++)
                {
                    System.out.print(a + " + " + b + " = ");
                    c = a+b;
                    a = b;
                    b = c;
                    System.out.print(c + "\n ");
                }            
            }
        
        System.out.print("\n");
    }
    
    public String beolvas(){
        
         String input = null;
         Scanner inputReader = new Scanner(System.in);
         System.out.println("Kérlek add meg a Fibonacci számsorozat hosszát: ");
         input = inputReader.nextLine();
         
         return input;
        
    }
    
    public int szovegbolSzam(String szoveg){
        
        return Integer.parseInt(szoveg);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fibonacci fibo = new Fibonacci();
         
        fibo.fibo(fibo.szovegbolSzam(fibo.beolvas()));
    }
    
}
