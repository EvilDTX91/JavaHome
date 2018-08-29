package largestinarray;
import java.util.*;

public class LargestInArray {

    public static int getLargestV1(int[] numbers)
    {
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i+1; j < numbers.length; j++)
            {
                if(numbers[i] > numbers[j])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers[numbers.length-1];
    }
    
    public static int getLargestV2(int[] numbers)
    {
        Arrays.sort(numbers);
        
        return numbers[numbers.length-1];
    }
    
    public static int getLargestV3(Integer[] numbers)
    {
        List<Integer> list = Arrays.asList(numbers);
        
        Collections.sort(list);
        
        int elements = list.get(numbers.length-1);
        
        return elements;
    }
    public static void main(String[] args) {
        
        LargestInArray largest = new LargestInArray();
        
        int[] a = {55,2,1,75,33,123,7,99,43,67,11};
        int[] b = {9,5,7,11,22,1,55,91,4};
        
        Integer[] x = {55,2,1,75,33,123,7,99,43,67,11};
        Integer[] y = {9,5,7,11,22,1,55,91,4};
        
        System.out.println("'A' numbers:");
        for(int z : a)
        {
            System.out.print(z + ", ");
        }
        System.out.println();
        System.out.println("'B' numbers:");
        for(int z : b)
        {
            System.out.print(z + ", ");
        }
        System.out.println();
        
        System.out.println("V1 the largest number in the array: " + largest.getLargestV1(a));
        System.out.println("V1 the largest number in the array: " + largest.getLargestV1(b));
        System.out.println();
        System.out.println("V2 the largest number in the array: " + largest.getLargestV2(a));
        System.out.println("V2 the largest number in the array: " + largest.getLargestV2(b));
        System.out.println();
        System.out.println("V3 the largest number in the array: " + largest.getLargestV3(x));
        System.out.println("V3 the largest number in the array: " + largest.getLargestV3(y));
        System.out.println();
    }
    
}
