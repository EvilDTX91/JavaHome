package selectionsort;
import java.util.*;

public class TextScanner {
    
    private int[] numbers;
    
    private void NumberArray()
    {
        int size=0;
        
        Scanner arrayScan = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        size=arrayScan.nextInt();
        this.numbers = new int[size];
        
        System.out.println("Enter numbers:");
        for(int i = 0; i < size; i++)
        {
            this.numbers[i]=arrayScan.nextInt();
        }
    }
    
    private void sortNumberArray()
    {
        int temp = 0;
        int size = this.numbers.length;
        
        for(int i = 0; i < size; i++)
        {
            int index = i;
            for(int j = i+1; j < size; j++)
            {
                if(this.numbers[j]<this.numbers[index])
                {
                    index = j;
                }
            }
            temp = this.numbers[i];
            this.numbers[i] = this.numbers[index];
            this.numbers[index] = temp;
        }
    }
    
    public int[] getNumberArray()
    {
        return this.numbers;
    }
    
    public void setNumberArray()
    {
       NumberArray();
    }
    
    public void callShortArray()
    {
        sortNumberArray();
    }
    
    public void printNumberArray()
    {
        for(int i : this.numbers)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
