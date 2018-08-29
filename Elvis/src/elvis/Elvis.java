/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elvis;

/**
 *
 * @author Tomi
 */
public class Elvis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int weight = 250;
        double tonns;
        System.out.println("Elvis weights: " + weight);
        System.out.println("Elvis visits all-you-can-eat rib joint.");
        System.out.println("Elvis throws Thanksgiving luau.");
        weight = weight + 10;
        System.out.println("Elvis now weights: " + weight);
        System.out.println("Elvis discover aerobics.");
        weight = weight - 15;
        System.out.println("Elvis now weights: " + weight);
        System.out.println("Elvis falls int washing machine during " + "shrink cycle.");
        weight = weight / 3;
        System.out.println("Elvis now weights: " + weight);
        System.out.println("Oops! Elvis clones himself 12 times.");
        weight = weight + (weight * 12);
        System.out.println("The 13 Elvis now wieght: " + weight);
        weight = weight/12;
        tonns = weight;
        System.out.println("Elvis 0. day weights: " + tonns);
        tonns = tonns + 0.45;
        System.out.println("Elvis 1. day weight: " + tonns);
        tonns = tonns + 0.45;
        System.out.println("Elvis 2. day weight: " + tonns);
        tonns = tonns + 0.45;
        System.out.println("Elvis 3. day weight: " + tonns);
    }
    
}
