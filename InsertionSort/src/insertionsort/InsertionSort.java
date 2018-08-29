package insertionsort;

public class InsertionSort {
    
    public void insertionSort(int[] numbers)
    {
        int size = numbers.length;
        int temp;
        
        for(int i = 1; i < size; i++)
        {
            int index = numbers[i];
            int j = i-1;
            while((j>-1) && (numbers[j] > index))
            {
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1]=index;
            for(int x : numbers)
            {
                System.out.print(x + ",");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        
        InsertionSort insertSort = new InsertionSort();        
        int[] numbers = {9,14,3,2,43,11,58,22};
        
        System.out.println("Before sort:");
        for(int i : numbers)
        {
            System.out.print(i + ",");
        }
        System.out.println("\n");
        
        
        insertSort.insertionSort(numbers);
        
        
        System.out.println("After sort:");
        for(int i : numbers)
        {
            System.out.print(i + ",");
        }
        System.out.println("\n");
        
    }
    
}
