/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplication;

/**
 *
 * @author Tomi
 */
public class MatrixMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] a = {{1,1,1},{2,2,2},{3,3,3}};    
        int[][] b = {{1,1,1},{2,2,2},{3,3,3}};
        
        int[][] c = new int[3][3];
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                c[i][j] = 0;
                for(int k = 0; k < 3; k++)
                {
                c[i][j] += a[i][k] * b[k][j];                  
                }
                System.out.print(c[i][j] + " ");  
            }
            System.out.println();
        }
    }
    
}
