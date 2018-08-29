/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixtranspose;

/**
 *
 * @author Tomi
 */
public class MatrixTranspose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] original={{1,3,4},{2,4,3},{3,4,5}};
        
        int[][] transpose = new int[3][3];
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                transpose[i][j] = original[j][i];
            }
            System.out.println();
        }
        
        System.out.println("Printing the matrix before transpose:");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Printing the matrix after transpose:");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
