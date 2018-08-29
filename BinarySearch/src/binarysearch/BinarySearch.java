package binarysearch;

import java.util.Arrays;

/*
binaris keresés gyorsabb mint a lineáris keresés
az elemeknek rendezett növekvő sorrendben kell lenniük, ha nem úgy vannak rendezni kell az elemeket
pl.: Arrays.sort(arr) metódussal
addig felezi az elemeket még rá nem talál a keresett elemre
pl.: 
keresett: 7
1 2 3 4 5 6 7 8 9 10
6 7 8 9 10
6 7 8
7
*/

public class BinarySearch {
    
    public void binarySearch(int[] numbers, int first, int last, int key)
    {
        int mid = (first+last)/2;
        
        sortBinarySearch(numbers);
        
        while(first <= last)
        {
            if(numbers[mid] < key)
            {
                first=mid+1;
            }
            else if(numbers[mid] == key)
            {
                System.out.println("Max index: " + numbers.length);
                System.out.println("Element is found at index: " + mid);
                break;
            }
            else
            {
                last=mid-1;
            }
            
            mid = (first+last)/2;
        }
        if(first > last)
        {
            System.out.println("Element is not found!");
        }
        
    }
    
    public static int binarySearchV2(int[] numbers,int first, int last, int key)
    {
        Arrays.sort(numbers);
        
        if(last >= first)
        {
            int mid = first + (last-first)/2;
            
            if(numbers[mid] == key)
            {
                return mid;
            }
            if(numbers[mid] > key)
            {
                return binarySearchV2(numbers,first,mid-1,key);
            }
            else
            {
                return binarySearchV2(numbers,mid+1,last,key);
            }
        }
        return -1;
    }
    
    public void sortBinarySearch(int[] numbers)
    {
        int temp = 0;
        
        for(int i=0; i < numbers.length-1; i++)
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
        
        System.out.println("Sorted Numbers: ");
        for(int x : numbers)
        {
            System.out.print(x + ",");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        
        BinarySearch binSearch = new BinarySearch();
        
        //int[] numbers = {10,20,30,40,50};
        int[] numbers = {9,14,3,2,43,30,11,58,22};
        
        int key = 30;
        int last = numbers.length - 1;
        
        System.out.println("Numbers: ");
        for(int x : numbers)
        {
            System.out.print(x + ",");
        }
        System.out.println("\n");
    
        binSearch.binarySearch(numbers, 0, last, key);
        
        int result = binSearch.binarySearchV2(numbers, 0, last, key);
        
        if(result == -1)
        {
            System.out.println("ElementV2  is not found!");
        }
        else
        {
            System.out.println("ElementV2 is found at index: "+result);
        }
    }
    
}
