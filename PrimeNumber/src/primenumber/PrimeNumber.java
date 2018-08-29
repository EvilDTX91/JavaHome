/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.*;

/**
 *
 * @author Tomi
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    
    public boolean primeCheck(int number){
        
        int counter = 0;
        
        for(int i=1;i<=number; i++){
            if(number%i==0)
            {
                counter++;
            }
        }
        
        if(counter<=2)
        {
            System.out.println(number + " is a Prime number!");
            return true;
        }
        else
        {
            System.out.println(number + " isn't a Prime number!");
            return false;
        }
    }
    
    public String scanNumb()
    {
        String input = null;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Kérlek adj meg egy számot: ");
        input = inputReader.nextLine();
        
        return input;
    }
    
    public int converToNumb(String szoveg){
        
        return Integer.parseInt(szoveg);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        PrimeNumber pnumb = new PrimeNumber();
        TextScanner numbScan = new TextScanner();
        
        pnumb.primeCheck(pnumb.converToNumb(pnumb.scanNumb()));
        
        pnumb.primeCheck(pnumb.converToNumb(numbScan.callScanString()));
    }
    
}
