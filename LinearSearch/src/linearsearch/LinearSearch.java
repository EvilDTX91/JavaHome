package linearsearch;
import java.util.Scanner;

public class LinearSearch {
    
    public static int linearSearch(int[] numbers,int key)
    {
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == key)
            {
                return i;
            }
        }
        return -1;        
    }

    public static void main(String[] args) {
        
        LinearSearch linearS = new LinearSearch();
        
        int[] numbers = {10,20,30,50,70,90};
        int key = 50;
        
        System.out.println(key + " is found at index: " + linearS.linearSearch(numbers,key));
        
        
        Scanner scanner = new Scanner(System.in);
        
        int c,n,search,array[];
        
        System.out.println("Enter size of the array: ");
        n=scanner.nextInt();
        array = new int[n];
        
        System.out.println("Enter those " + n + " elements:");
        for(c=0; c<n; c++)
        {
            array[c]=scanner.nextInt();
        }
        
        System.out.println("Enter value find:");
        search=scanner.nextInt();
        
        for(c = 0; c < n; c++)
        {
            if(array[c] == search)
            {
                System.out.println(search + " is present at location " + (c+1) + ".");
                break;
            }
        }
         if (c == n)  /* Element to search isn't present */  
            System.out.println(search + " isn't present in array.");  
    }
    
}
