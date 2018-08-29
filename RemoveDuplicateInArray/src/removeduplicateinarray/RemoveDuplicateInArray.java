package removeduplicateinarray;
import java.util.*;
public class RemoveDuplicateInArray {

    public static int removeDuplicateV1(int[] numbers, int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        
        int temp[] = new int[n];
        int j = 0;
        
        for(int i = 0; i < n-1; i++)
        {
            if(numbers[i] != numbers[i+1])
            {
                temp[j++]=numbers[i];
            }
        }
        temp[j++]=numbers[n-1];
        
        for(int i = 0; i < n; i++)
        {
            numbers[i] = temp[i];
        }
        
        return j;
        
    }
    
    public static int removeDuplicateV2(int[] numbers, int n)
    {
        if( n == 0 || n == 1)
        {
            return n;
        }
        
        int j = 0;
        for(int i = 0; i < n-1; i++)
        {
            if(numbers[i] != numbers[i+1])
            {
                numbers[j++]=numbers[i];
            }
        }
        numbers[j++]=numbers[n-1];
        
        return j;
    }
    
    public static int removeDuplicateV3(int[] numbers,int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        
        int[] temp = new int[n];
        int j = 0;
        
        for(int i = 0; i < n-1; i++)
        {
            if(numbers[i] != numbers[i+1])
            {
                temp[j++]=numbers[i];
            }
        }
        temp[j++] = numbers[n-1];
        
        for(int i = 0; i < j; i++)
        {
            numbers[i]=temp[i];
        }
        
        return j;
    }
    
    public static void main(String[] args) {
        
        RemoveDuplicateInArray removeDupli = new RemoveDuplicateInArray();
        
        int[] numbers1 = {10,20,20,30,30,40,50,50};
        int[] numbers2 = {10,20,20,30,30,40,50,50};
        int[] numbers3 = {10,70,30,90,20,20,30,40,70,50};
        int length1 = numbers1.length;
        int length2 = numbers2.length;
        int length3 = numbers3.length;
        
        removeDupli.removeDuplicateV1(numbers1,length1);
        
         for (int x : numbers1)// be járja az egész tömböt
         {
           System.out.print(x+", ");
         }
         System.out.println();
         
         
         
         length2 = removeDupli.removeDuplicateV2(numbers2,length2);
         for (int i=0; i < length2; i++) //csak a vissza kapott tömb hosszt járja be
         {
           System.out.print(numbers2[i]+", ");
         }
         System.out.println();
         
         
         Arrays.sort(numbers3);
         length3 = removeDupli.removeDuplicateV3(numbers3,length3);
         for (int i=0; i < length3; i++) //csak a vissza kapott tömb hosszt járja be
         {
           System.out.print(numbers3[i]+", ");
         }
         System.out.println();
    }
    
}
