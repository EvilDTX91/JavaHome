package tanulok;
public class Tanulok {
    public static void main(String[] args) {
       /* int[][] tanulok = new int[5][3]; //5 tanulo 3 érdemjegy (3/fő) saját verzió
        tanulok[0][0] = 5;
        tanulok[0][1] = 4;
        tanulok[0][2] = 4;
        tanulok[1][0] = 3;
        tanulok[1][1] = 3;
        tanulok[1][2] = 3;
        tanulok[2][0] = 2;
        tanulok[2][1] = 1;
        tanulok[2][2] = 1;
        tanulok[3][0] = 1;
        tanulok[3][1] = 4;
        tanulok[3][2] = 3;
        tanulok[4][0] = 2;
        tanulok[4][1] = 2;
        tanulok[4][2] = 5;*/
       
        int[][] tanulok = new int[6][6]; //a könyves verzió
        int[] A = {2,3,5,5,1,2};
        int[] B = {2,1,1,3,5,5};
        int[] C = {5,5,5,3,4,4};
        int[] D = {1,1,2,1,2,2};
        int[] E = {3,4,3,3,5,2};
        int[] F = {2,1,5,3,4,4};
        
        tanulok[0] = A;
        tanulok[1] = B;
        tanulok[2] = C;
        tanulok[3] = D;
        tanulok[4] = E;
        tanulok[5] = F;
        
        
        int tanulokszama = 0;
        int jegyekszama = 0;
        float osztalyatlag = 0;
        float tanuloatlag = 0;
        float jegyosszeg = 0;
        
        for(int i=0;i<tanulok.length;i++)
        {
            System.out.print("A(z)" + i + " sorszámú tanuló érdemjegyei: ");
            for(int j=0;j<tanulok[0].length;j++)
            {
                tanuloatlag+=tanulok[i][j];
                System.out.print(tanulok[i][j]+",");
                jegyekszama++;
            }
            jegyosszeg+=tanuloatlag;
            System.out.println("\tA tanuló átlaga:" + tanuloatlag/tanulok[0].length);
            tanuloatlag=0;
            tanulokszama++;
        }
        osztalyatlag = jegyosszeg/jegyekszama;
        System.out.println("A tanulók száma:" + tanulokszama  + " fő\nAz osztály átlaga:" + osztalyatlag);
        //System.out.println("Jegyekszama:"+jegyekszama);
        //System.out.println("Jegyekösszeadva:"+jegyosszeg);
    }
    
}
