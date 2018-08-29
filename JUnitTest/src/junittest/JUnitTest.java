/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import java.util.Scanner;

/**
 *
 * @author Tomi
 */
public class JUnitTest {
    
    private String StringReverse(String words)
    {
        String reverseWord = "";
        int wordLength = words.length()-1;
        
        for(int i = wordLength; i>=0; i--)
        {
            reverseWord += words.charAt(i);
        }
        return reverseWord;
    }
    public String CallStringReverse(String words)
    {
        return StringReverse(words);
    }
    
    
    private String StringEquals(String originalWords, String reverseWords)
    {
        if(originalWords.equals(reverseWords))
        {
            return "Palidrom!";
        }
        else
        {
            return "Not Palidrom!";
        }
    }
    
    private String InputString()
    {
         String words = null;
        
            Scanner inputReader = new Scanner(System.in);
            System.out.println("Please enter a word: ");
            words = inputReader.nextLine();
            
            return words;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JUnitTest teszt = new JUnitTest();
        
        System.out.println(teszt.CallStringReverse(teszt.InputString()));
        
        //String szo="fostartaly";
        //System.out.println(teszt.StringReverse(szo));
        
        
        /*
        int x=0;
        int number = 0;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = Integer.parseInt(inputReader.nextLine());
        
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                x++;
                if(x>2)
                {
                    System.out.println("A megadott szám (" + number + ") nem prím szám!");
                    x=0;
                    break;
                }
            }
        }
        if(x==2)
        {
            System.out.println("A megadott szám (" + number + ") prím szám!");
        }*/
        
        
        
        // TODO code application logic here
    }
    
}
