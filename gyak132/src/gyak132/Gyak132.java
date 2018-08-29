package gyak132;
public class Gyak132 {
    public static void main(String[] args) {
        int szam = 13;
        int db = 0;
        int[] tomb = new int[400];
        
        for(int i=1;i<=400;i++)
        {
            if(i%szam==0)
            {
                System.out.print(i + ",");
                tomb[db] = i;
                db++;
            }
        }
        System.out.print("\n 13-al osztható számok száma:" + db + "\n");
        
        for(int i=0;i<=400;i++)
        {
            if(tomb[i]!=0)
            {
            System.out.print(i + ": " + tomb[i] + ",");
            }
            else
                break;
        }
        System.out.print("\n");
    }
    
}
