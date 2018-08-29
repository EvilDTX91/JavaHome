package selectionsort;

public class SelectionSort {
    
    public void selectShort(int[] numbers)
    {
        int temp = 0;
        int max = numbers.length;
                
        for(int i = 0; i < max; i++)
        {
            int index = i;
            for(int j = i+1; j < max; j++)
            {
                if(numbers[j]<numbers[index])
                {
                    index=j;
                }
            }
            temp=numbers[i];
            numbers[i]=numbers[index];
            numbers[index]=temp;
            
            /*for(int x : numbers)
                    {
                        System.out.print(x + ", ");
                    }
                    System.out.println("\n");*/
        }
    }

    public static void main(String[] args) {
        
        SelectionSort selShortNumb = new SelectionSort();
        TextScanner arrayScan = new TextScanner();

        //*********** első megoldás ***********\\
        
        int[] numbers = {5,1,12,-5,16,2,12,14};
        
        System.out.println("Rendezés előtt:");
        for(int i : numbers)
        {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
        
        selShortNumb.selectShort(numbers);
        
        System.out.println("Rendezés után:");
        for(int i : numbers)
        {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
        
        //*********** második megoldás ***********\\
        
        arrayScan.setNumberArray();
        
        int[] scanNumbers = arrayScan.getNumberArray();
        
        
        System.out.println("Rendezés előtt:");
        for(int i : scanNumbers)
        {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
        
        arrayScan.callShortArray();
        //selShortNumb.selectShort(arrayScan.getNumberArray());
        
        
        System.out.println("Rendezés után:");
        for(int i : scanNumbers)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        arrayScan.printNumberArray();
    }
    
}
