package matrixaddition;
public class MatrixAddition {
    
    private static int[][] cMatrix = new int[3][3];
    
    public static int matrixSum(int[][] a, int[][] b, int n)
    {
        //int[][] c = new int[n][n];
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                cMatrix[i][j] = a[i][j]+b[i][j];
            }
        }
        return n;
    }
    
    public static void main(String[] args) {
        
        MatrixAddition matrixArrays = new MatrixAddition();
        
        int[][] a = {{1,3,4},{2,4,3},{3,4,5}};
        int[][] b = {{1,3,4},{2,4,3},{1,2,4}};
        
        int[][] c = new int[3][3];
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("---------------------------------------");
        
        matrixArrays.matrixSum(a,b,3);
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(cMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
