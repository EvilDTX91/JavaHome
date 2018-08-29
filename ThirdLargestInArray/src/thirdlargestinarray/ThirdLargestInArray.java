package thirdlargestinarray;
import java.util.*;

public class ThirdLargestInArray {
    
    public static int getThirdLargestV1(int numbers[])
    {
        int temp = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i+1; j < numbers.length; j++)
            {
                if(numbers[i]>numbers[j])
                {
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("\nSorted Array:");
        for(int x : numbers)
        {
            System.out.print(x + ",");
        }
        
        return numbers[numbers.length-3];
    }
    
    public static int getThirdLargestV2(int numbers[])
    {
        Arrays.sort(numbers);
        
        System.out.println("\nSorted Array:");
        for(int x : numbers)
        {
            System.out.print(x + ",");
        }
        
        return numbers[numbers.length-3];
    }
    
    public static int getThirdLargestV3(Integer[] numbers)
    {
        List<Integer> list = Arrays.asList(numbers);
        
        Collections.sort(list);
        
        int element = list.get(numbers.length-3);
        
        return element;
    }
            
    public static void main(String[] args) {
        
        ThirdLargestInArray thirdLargest = new ThirdLargestInArray();
        int[] a = {9,14,3,2,43,30,11,58,22};
        int[] b = {44,66,99,77,33,22,55};  
        
        System.out.println("'A' Original Array:");
        for(int x : a)
        {
            System.out.print(x + ",");
        }
        System.out.println("\n");
        System.out.println("'B' Original Array:");
        for(int x : b)
        {
            System.out.print(x + ",");
        }
        System.out.println("\n");
        
        System.out.println("\nV1: The third largest number in the array: " + thirdLargest.getThirdLargestV1(a));
        System.out.println("V1: The third largest number in the array: " + thirdLargest.getThirdLargestV1(b));
        
        System.out.println("\nV2: The third largest number in the array: " + thirdLargest.getThirdLargestV2(a));
        System.out.println("V2: The third largest number in the array: " + thirdLargest.getThirdLargestV2(b));
        
        Integer[] x = {9,14,3,2,43,30,11,58,22};
        Integer[] y = {44,66,99,77,33,22,55};  
        
        System.out.println("\nV3: The third largest number in the array: " + thirdLargest.getThirdLargestV3(x));
        System.out.println("V3: The third largest number in the array: " + thirdLargest.getThirdLargestV3(y));
    }
    
}
