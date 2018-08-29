package bubblesort;

public class BubbleSort {
    
    public void sortBubbleMax(int[] numbers)
    {
        int a = 0;
        int b = 0;
        int max = numbers.length;
        //System.out.println(max);
        
        for(int i = 0; i < max; i++)
        {
            //System.out.print("a:" + a + ", ");
            for(int j = 0; j < max; j++)
            {
                a=numbers[i];
                b=numbers[j];
                //System.out.print("b:" + b + ", ");
                //System.out.print("\n");
                if(a<b)
                {
                    numbers[j]=a;
                    numbers[i]=b;
                    
                    for(int x : numbers)
                    {
                        System.out.print(x + ", ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();
        
        for(int i : numbers)
        {
            System.out.print(i + ", ");
        }
        
        System.out.println();
        
        for(int i = 0; i < max; i++)
        {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\n");
    }
    
    public void sortBubbleMin(int[] numbers)
    {
        int a=0;
        int max=numbers.length;
        
        for(int i=0; i < max; i++)
        {
            for(int j = 1; j < (max-i); j++)
            {
                if(numbers[j-1]<numbers[j])
                {
                    a=numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=a;
                    for(int x : numbers)
                    {
                        System.out.print(x + ", ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();
        
        for(int i : numbers)
        {
            System.out.print(i + ", ");
        }
        
        System.out.println();
        
        for(int i = 0; i < max; i++)
        {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        
        BubbleSort shortNumbers = new BubbleSort();
        
        int[] numbers1 = { 5, 32, 44, 55, 1};
        int[] numbers2 = { 5, 32, 44, 55, 1};
        
        for(int i : numbers1)
        {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
        
        shortNumbers.sortBubbleMax(numbers1);
        shortNumbers.sortBubbleMin(numbers2);
    }
    
}
