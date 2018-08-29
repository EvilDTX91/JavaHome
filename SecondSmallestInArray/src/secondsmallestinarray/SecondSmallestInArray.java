package secondsmallestinarray;
import java.util.*;
public class SecondSmallestInArray {

    public static int getSecondSmallestV1(int[] numbers)
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
        return numbers[1];
    }
    
    public static int getSecondSmallestV2(int[] numbers)
    {
        Arrays.sort(numbers);
        
        return numbers[1];
    }
    
    public static int getSecondSmallestV3(Integer[] numbers)
    {
        List<Integer> list = Arrays.asList(numbers);
        
        Collections.sort(list);
        
        int element = list.get(1);
        
        return element;
    }
    
    public static void main(String[] args) {
        
        SecondSmallestInArray secondSmall = new SecondSmallestInArray();
        
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
        
        System.out.println();
        System.out.println("V1 the second smallest number in the array: " + secondSmall.getSecondSmallestV1(a));
        System.out.println("V1 the second smallest number in the array: " + secondSmall.getSecondSmallestV1(b));
        System.out.println();
        System.out.println("V2 the second smallest number in the array: " + secondSmall.getSecondSmallestV2(a));
        System.out.println("V2 the second smallest number in the array: " + secondSmall.getSecondSmallestV2(b));
        System.out.println();
        System.out.println("V3 the second smallest number in the array: " + secondSmall.getSecondSmallestV3(x));
        System.out.println("V3 the second smallest number in the array: " + secondSmall.getSecondSmallestV3(y));
        System.out.println();
    }
    
}
