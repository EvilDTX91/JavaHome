/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signalgenerator;

/**
 *
 * @author denve
 */
public class SignalGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int month = 12;
        int[] values = {11000,11500,12000,12500,13134,13669};
        int money = 0;
        
        for(int i = 0; i < values.length; i++)
        {
            money = money + (values[i]*month);
        }
            System.out.print(money + " HUF\n");
    }
    
}
