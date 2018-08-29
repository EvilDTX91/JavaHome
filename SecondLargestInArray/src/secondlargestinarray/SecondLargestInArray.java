package secondlargestinarray;

import java.util.*;

public class SecondLargestInArray {
    
    public static int getSecondLargestV1(int[] numbers)
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
        return numbers[numbers.length-2];
    }
    
    public static int getSecondLargestV2(int[] numbers)
    {
        Arrays.sort(numbers);
        
        return numbers[numbers.length-2];
    }
    
    public static int getSecondLargestV3(Integer[] numbers)
    {
        List<Integer> list = Arrays.asList(numbers);
        
        Collections.sort(list);
        
        int element = list.get(numbers.length-2);
        
        return element;
    }

    public static void main(String[] args) {
        
        SecondLargestInArray secondLargest = new SecondLargestInArray();
        
        int[] a = {9,14,3,2,43,30,11,58,22};
        int[] b = {44,66,99,77,33,22,55};
        
        System.out.println("'A' Numbers: ");
        for(int x : a)
        {
            System.out.print( x +", ");
        }
        System.out.println();
        
        System.out.println("'B' Numbers: ");
        for(int x : b)
        {
            System.out.print( x +", ");
        }
        System.out.println("\n");
        
        System.out.println("V1 the second largest number in the array: " + secondLargest.getSecondLargestV1(a));
        System.out.println("V1 the second largest number in the array: " + secondLargest.getSecondLargestV1(b));
        System.out.println();
        System.out.println("V2 the second largest number in the array: " + secondLargest.getSecondLargestV2(a));
        System.out.println("V2 the second largest number in the array: " + secondLargest.getSecondLargestV2(b));
        
        Integer[] x = {9,14,3,2,43,30,11,58,22};
        Integer[] y = {44,66,99,77,33,22,55}; 
        
        System.out.println();
        System.out.println("V3 the second largest number in the array: " + secondLargest.getSecondLargestV3(x));
        System.out.println("V3 the second largest number in the array: " + secondLargest.getSecondLargestV3(y));
    }
    
}
