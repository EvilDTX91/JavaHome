package w3resource;

import java.util.*;
import java.lang.*;

public class Basic4 {
    
    
    public void howLongExecuteNanoSecIn91()
    {
        long startTime = System.nanoTime();
        
        System.out.println("The first 10 natural numbers are: ");
        for(int i = 1; i <=10; i++)
        {
            System.out.print(i + ",");
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("\b\nEstimated time (in nanoseconds) to get the first 10 natural numbers: " + estimatedTime);       
    }
    
    public void countEvenOrOddInArray92()
    {
        int[] numbers = {5,7,2,4,9};
        int odd = 0;
        int even = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]%2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
    }
    
    
    public void containsNexToNextTo93()
    {
        int[] numbers = {10,10,2,4,20,20};
        int n = numbers.length-1;
        boolean x1 = false, x2 = false;
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        for(int i = 0; i < n; i++)
        {
            if(numbers[i] == 10 && numbers[i+1] == 10)
            {
                    //System.out.println("10 next to 10");
                    x1=true;
            }
            else if(numbers[i] == 20 && numbers[i+1] == 20)
            {
                    //System.out.println("20 next to 20");
                    x2=true;
            }
        }
        
        System.out.println(String.valueOf(x1 != x2));
    }
    
    public void rearrangeArrayElements94()
    {
        int[] numbers1 = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        int[] numbers2 = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        int n1 = numbers1.length-1;        
        int n2 = numbers2.length-1;
        
        int tmp = 0;
        
        System.out.println("Original Array: " + Arrays.toString(numbers1));
        
        int i = 0;
        
        while(i < n1 && numbers1[i] % 2 == 0)
            i++;
        
        for(int j = i +1 ; j < n1; j++)
        {
            if(numbers1[j] % 2 != 0)
                    {
                    System.out.print(numbers1[i] + " <=> " + numbers1[j] + ", ");
                    tmp = numbers1[i];
                    numbers1[i] = numbers1[j];
                    numbers1[j] = tmp;
                    i++;
                    }
            
        }
        for(i = 0; i <= n2; i++)
        {
            if(numbers2[i] % 2 == 0)
            {
                for(int j = i; j <= n2; j++)
                {
                    if(numbers2[j] % 2 != 0)
                    {
                    tmp = numbers2[j];
                    numbers2[j] = numbers2[i];
                    numbers2[i] = tmp;
                    }
                }
            }
        }
        
        System.out.println("\nRearrage Array1: " + Arrays.toString(numbers1));
        System.out.println("Rearrage Array2: " + Arrays.toString(numbers2));
        
    }
    
    public void createArrayLengthStringValue95()
    {        
        int n = 5;
        
        String[] numbers = new String[n];
        
        for(int i = 0; i < n; i++)
        {
            numbers[i] = String.valueOf(i);
        }
        
        System.out.println("Array: " + Arrays.toString(numbers));
    }
    
    public void checkTherIsTenAndTwenty96()
    {
        int[] numbers = {10, 70, 80, 50, 20, 13, 50};
        int n = numbers.length;
        boolean findX=false, result = false;
        int x = 10;
        int y = 20;
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        for(int i = 0; i < n ; i++)
        {
            if(numbers[i] == x)
            {
                findX = true;
            }
            
            if(findX && numbers[i] == y)
            {
                result = true;
            }
        }
        System.out.println(result);
    }
    
    
    public void containsNextToOrSeparated97()
    {
        int[] numbers = {10, 20, 10, 50, 20, 13, 50};      
        int n = numbers.length;        
        int x = 10;
        boolean result = false;
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        for(int i = 0; i < n-1; i++)
        {
            if(numbers[i] == x && numbers[i+1] == x)
            {
                result = true;
            }
            else if(i<n-2 && numbers[i] == x && numbers[i+2] == x)
            {
                result=true;
            }
        }
        
        System.out.println(result);
    }
    
    
    public void checkNoNextEachOther98()
    {
        int[] numbers = {10, 20, 20, 20, 40, 13, 20};
        int n = numbers.length;
        int x = 20;
        int count = 0, result = 0;
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        if(n >= 1 && numbers[0] == x)
        {
            count++;
        }
        
        for(int i = 1; i < n; i++)
        {
            if(numbers[i] == x && numbers[i-1] == x)
            {
               System.out.println(String.valueOf(false));
               result = 1;
            }
            
            if(numbers[i] == x)
            {
                count++;
            }
        }
        if(result == 0)
        {
            System.out.println(String.valueOf(count == 3));
        }
    }
    
    public void checkEveryPairOfAdjecment99()
    {
        int[] numbers = {10, 20, 10, 20, 40, 20, 50};
        int n = numbers.length;
        int x = 20;
        int result = 0;
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        for(int i = 1; i < n ; i++)
        {
            if(numbers[i] != x && numbers[i-1] != x)
            {
                result=1;
            }
        }
        
            System.out.println((result == 0 ? true : false));
    }
    
    public void countTwoArrayDiffer100()
    {
        int[] numbers1 = {10, 11, 10, 20, 43, 20, 50};
        int[] numbers2 = {10, 13, 11, 20, 44, 30, 50};
        
        int n1 = numbers1.length, n2 = numbers2.length;
        int temp = 0, result = 0, count = 0;
        
        System.out.println("Original Array 1: " + Arrays.toString(numbers1));
        System.out.println("Original Array 2: " + Arrays.toString(numbers2));
        
        for(int i = 0; i < n1; i++)
        {
            temp = Math.abs(numbers1[i] - numbers2[i]);
            if(temp <= 1 && numbers1[i] != numbers2[i])
            {
                result = result + temp;
                count++;
            }
        }
        
        System.out.println("Result 1: " + result);
        System.out.println("Result 2: " + count);
    }
    
    public void checNumber10Greater20Than101()
    {
        int[] numbers = {10, 11, 10, 30, 45, 20, 33, 53};
        int n = numbers.length;
        int count10 = 0, count20 = 0, x1 = 10, x2 = 20;
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        for(int i = 0; i < n ; i++)
        {
            if(numbers[i] == x1)
            {
                count10++;
            }
            if(numbers[i] == x2)
            {
                count20++;
            }
        }
        
        System.out.println((count10>count20 ? true : false));
        System.out.println(String.valueOf(count10>count20));
    }
    
    public void checkContainsSpecified102()
    {
        int[] numbers = {11, 11, 13, 31, 45, 20, 33, 53};
        int n = numbers.length;
        int x1 = 10, x2=30, result = 1;
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        for(int i = 0; i < n ; i++)
        {
            if(numbers[i] == x1 || numbers[i] == x2)
            {
                result = 0;
            }
        }
        System.out.println((result==0 ? true : false));
    }
    
    public void createNewArrayAfter10Last103()
    {
        int[] numbers = {11, 10, 13, 10, 45, 20, 33, 53};
        int n = numbers.length;
        int x = 10;
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        int y = 0;
        for(int i = 0; i < n ; i++)
        {
            if(numbers[i] == 10)
            {
                y=i+1;
            }
        }        
        int z = n-1;
        while(numbers[z] != 10)
        {
            z--;
        }
        
        //int[] newNumbers = new int[n-z-1];
        int[] newNumbers = new int[n-y];
        int j = 0;
        
        for(int i = y; i < n; i++)
        {
            newNumbers[j] = numbers[i];
            j++;
        }
        
        System.out.println("New Array: " + Arrays.toString(newNumbers));
    }
    
    public void createNewArrayBefore10Last104()
    {
        int[] numbers = {11, 15, 13, 10, 45, 20, 33, 53};
        int n = numbers.length;
        int x = 10;
        
        int y = 0;
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        for(int i = 0; i < n; i++)
        {
            if(numbers[i] == x)
            {
                y = i;
            }
        }
        int[] newNumbers = new int[y];
        
        for(int i = 0; i < y; i++)
        {
            newNumbers[i] = numbers[i];
        }
        
        System.out.println("New Array: " + Arrays.toString(newNumbers));
    }
    
    public void checkGroupOfNumbersArray105()
    {
        int[] numbers = {11, 15, 13, 10, 45, 20, 11, 15};
        int n = numbers.length;
        int result = 0, l = 2, start = 0, end = n-l;
        
        System.out.println("Orignal Array: " + Arrays.toString(numbers));
       
                if(numbers[0] == numbers[n-2] && numbers[1] == numbers[n-1])
                {
                    System.out.println(String.valueOf(true));
                }
                else
                {
                    System.out.println(String.valueOf(false));
                }
                
        for(; l > 0; l--)
        {
            if(numbers[start] != numbers[end])
            {
                result = 1;
            }
            else
            {
                start++;
                end++;
            }
        }
        
        System.out.println((result == 1 ? false : true));
    }
    
    public void createNewArrayLeftShifterd106()
    {
        int[] numbers = {11, 15, 13, 10, 45, 20};
        int n = numbers.length;
        
        int[] shiftNumbers = new int[n];
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        for(int i=1; i < n; i++)
        {
            shiftNumbers[i-1] = numbers[i];
        }
        
        shiftNumbers[n-1] = numbers[0];
        
        System.out.println("New Shifter Array: " + Arrays.toString(shiftNumbers));
    }
    
    public void checkArrayContainsThreeIncreasingAdjacent107()
    {
        int[] numbers = {11, 12, 13, 14, 45, 20};
        int n = numbers.length;
        int result = 0;
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        for(int i = 0; i < n-3; i++)
        {
            if(numbers[i]+1 == numbers[i+1] && numbers[i+1]+1 == numbers[i+2])
            {
                result = 1;
            }
        }
        
        System.out.println((result == 1 ? true : false));
    }
    
    public void addAllTheDigitsResultSingleDigit108()
    {
        Scanner newInt = new Scanner(System.in);
        System.out.print("Input a positive intereger: ");
        int number = newInt.nextInt();
        
        while(number < 1)
        {
            System.out.print("Error! Try again!:");
            number = newInt.nextInt();            
        }
        
        if(number > 0)
        {
        int x = number/10;
        int y = number%10;
        
        int result = x + y;
        
        System.out.println("Original Number: " + number);
        System.out.println("Result Number: " + x + " + " + y + " = " + result);
        System.out.println("The single digit number is: "+(number == 0 ? 0 : (number % 9 == 0 ? 9 : number % 9)));
        }
    }
    
    public void staircaseShapeCoins109()
    {
        Scanner scanInt = new Scanner(System.in);
        int number = 0;
        
        try{            
        System.out.print("Input integer: " );
        number = scanInt.nextInt();
        
            while(number<1)
            {
                System.out.print("Error wrong number! Try again!: ");
                number = scanInt.nextInt();
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error:" + e);
        }
        
        System.out.println("Numbers of rows: " + ((int)((Math.sqrt(8 * (long)number - 1) - 1) /2 )));
    }
    
    public void givenInteger4Power110()
    {
        Scanner scanInt = new Scanner(System.in);
        int number = 0;
        
        try{
            System.out.print("Input integer: ");
            number = scanInt.nextInt();
            
            while(number<0)
            {
                System.out.println("Error! Wrong Number! Try Agian: ");
                number = scanInt.nextInt();
            }
        }
        
        catch(InputMismatchException e)
                    {
                    System.out.println("Error: " + e);
                    }
        
        System.out.println((number%4 == 0 ? true : false));
        
        int test = 0;
        
        if(number < 1)
        {
            System.out.println(Boolean.toString(false));
            test = 1;
        }
        if((number & (number-1)) != 0)
        {
            System.out.println(Boolean.toString(false));
            test = 1;
        }
        if(test == 0)
        {
            System.out.println(Boolean.toString((number & 55555555) != 0));
        }
    }
    
    public void addTwoNumberNoArithmetic111()
    {
        int x = 0, y = 0, result = 0;
        
        Scanner scanInt = new Scanner(System.in);
        
        try{
            System.out.print("Input first number: ");
            x = scanInt.nextInt();
            
            while(x < 1)
            {
                System.out.print("Error! Try again: ");
                x = scanInt.nextInt();
            }
            
            System.out.print("Input second number: ");
            y = scanInt.nextInt();
            
            while(y < 1)
            {
                System.out.print("Error! Try again: ");
                y = scanInt.nextInt();
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error!: " + e);
        }
        
        result = x;
        for(int i = 1; i <= y; i++)
        {
            result++;
        }
        System.out.println("Result: " + result);
        
        while(y != 0)
        {
            int carry = x & y;
            System.out.print(carry + " , ");
            x = x ^ y;
            System.out.print(x + " , ");
            y = carry << 1;
            System.out.print(y + " , ");
        }
        
        System.out.println("Result: " + x);
    }
    
    public void computeNumbersFactorial12()
    {
        Scanner scanInt = new Scanner(System.in);
        int number = 0;
        int result = 1;
        int zeroCount = 0;
        
        try{
            System.out.print("Input integer: ");
            number = scanInt.nextInt();
            
            while(number < 1 || number > 50)
            {
                System.out.print("Error! Try again!: ");
                number = scanInt.nextInt();
            }
        }
        catch(InputMismatchException e)
                    {
                    System.out.println("ERROR!: " + e);
                    }
        
        for(int i = 1; i <= number; i++)
        {
                result = result * i;
        }
        
        int x = result;
        while(x % 10 == 0)
        {
            x = x /10;
            zeroCount++;
        }
        
        System.out.println("Result for " + number + "! (factorial) : " + result);
        System.out.println("Trailing zeros: " + zeroCount);
        
    }
    
    public void mergeTwoGivenShortedArray113()
    {
        int[] numbers1 = {1,2,3,4};
        int[] numbers2 = {2,5,6,8};
        int x = numbers1.length;
        int y = numbers2.length;
        int[] result = new int[x+y];
        
        System.out.println("First Array: " + Arrays.toString(numbers1));
        System.out.println("Second Array: " + Arrays.toString(numbers2));
        
        for(int i = 0; i < x; i++)
        {
            if(result[i] == 0)
            {
            result[i] = numbers1[i];
            }
        }
        for(int i = x; i < x+y; i++)
        {
            if(result[i] == 0)
            {
                result[i] = numbers2[i-y];
            }
        }
        
        System.out.println("Result Array: " + Arrays.toString(result));
        int temp = 0;
        for(int i = 1; i < x+y; i++)
        {
            if(result[i-1] > result[i])
            {
                temp = result[i];
                result[i] = result[i-1];
                result[i-1] = result[i];
            }
        }
        //Arrays.sort(result);
        System.out.println("Sorted Result Array: " + Arrays.toString(result));
    }
    
    public void givenStringAndOffsetRotate114()
    {
        Scanner inputString = new Scanner(System.in);
        System.out.print("Input string: ");
        String text = inputString.nextLine();
        int n = text.length();
        int x = n/2;
        //System.out.println(x);
        System.out.println("Original text: " + text);
        System.out.println("Reversed text: " + offsetreverse(text, x));
    }
    
    public static String offsetreverse(String str, int offset)
    {
        String startText = str.substring(0,offset);
        String endText = str.substring(offset);
        return endText + startText;
    }
    
    public void checkPalidromeOrNot115()
    {
        Scanner inputInt = new Scanner(System.in);
        int number = 0;
        
        System.out.print("Input Integer:");
        number = inputInt.nextInt();
        
        try{
            while(number<1)
            {
            System.out.print("Error! Try Again! :");
            number = inputInt.nextInt();
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: " + e);
        }
            
        System.out.println("A " + number + " prímszám?: " + primeNumber(number));
        System.out.println("A " + number + " palidromszám?: " + palidromeNumber(number));
    }
    
    public static boolean primeNumber(int number)
    {
        int counter = 0;
        for(int i = 1; i <= number; i++)
        {
            if(number%i == 0)
            {
                counter++;
            }
        }
        if(counter>2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static boolean palidromeNumber(int number)
    {
        String numString = String.valueOf(number);
        String reverseNum = "";
        int n = numString.length();
        
        /*
        //saját megoldás
        for(int i = n-1; i >= 0; i--)
        {
            char c = numString.charAt(i);
            reverseNum += c;
        }
        System.out.println("Original: " + numString);
        System.out.println("Reversed: " + reverseNum);
        if(Integer.parseInt(numString) == Integer.parseInt(reverseNum))
        {
            return true;
        }
        else
        {
            return false;
        }*/
        
        //netes megoldás
        int x = 0;
        int y = numString.length()-1;
        while(x < y)
        {
            if(numString.charAt(x++) != numString.charAt(y--))
            {
                return false;
            }
        }
        return true;        
    }
    
    public static void iteratesNumbersFizzBuzz116()
    {
        for(int i = 1; i <= 100; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i + ": fizz buzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println(i + ": fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println(i + ": buzz");
            }
        }
    }
    
    public void computeSquareRoot117()
    {
        Scanner inputInt = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int x=0;
        
        try
        {
            x = inputInt.nextInt();
            
            while(x<1)
            {
                System.out.print("Error! Try Again!:");
                x = inputInt.nextInt();
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error!: " + e);
        }
        
        System.out.println("Square root of " + x + " is: " + Math.sqrt(x));
        System.out.println("Square root of " + x + " is: " + sqrt(x));
    }
    
    public static int sqrt(int number)
    {
        if(number == 0 || number == 1)
        {
            return number;
        }
        int a = 0;
        int b = number;
        while(a <= b)
        {
            int mid = (a + b) >> 1;
            System.out.println(mid);
            if(number / mid < mid)
            {
                b = mid -1;
            }
            else
            {
                if(number / (mid +1 ) <= mid)
                {
                    return mid;
                }
                a = mid +1;
            }
        }
        return a;
    }
    
}