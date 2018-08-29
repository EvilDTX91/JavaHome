package w3resource;

import java.util.*;

public class Basic3 {
    
    
    private static String stringScanner()
    {
        Scanner stringScanner = new Scanner(System.in);
        String text = stringScanner.nextLine();

        return text;
    }
    
    private static int intScanner()
    {
        int number = 0;
        Scanner intScanner = new Scanner(System.in);
        try{
        number = intScanner.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Given type is not a number! Error: " + e);
            System.exit(0);
        }
        return number;
    }
    
    public void reverseWord61()
    {
        System.out.print("Input a word: ");
        String word = stringScanner();
        String reverseWord = "";
        
        for(int i = word.length()-1; i >= 0; i--)
        {
            reverseWord = reverseWord + word.charAt(i);
        }
        
        System.out.println("Reverse word: (string) " + reverseWord);
        
        String text = word.trim();
        String result = "";
        char[] ch = text.toCharArray();
        for(int i = ch.length - 1; i >= 0; i--)
        {
            result +=ch[i];
        }       
        
        System.out.println("Reverse word: (char) " + result.trim());
    }
    
    public static boolean moreLessThanOthers62()
    {
        System.out.print("Input the first number: ");
        int a = intScanner();
        System.out.print("Input the second number: ");
        int b = intScanner();
        System.out.print("Input the second number: ");
        int c = intScanner();
        
        System.out.println(Math.abs(a-b) >= 20 || Math.abs(b-c) >= 20 || Math.abs(c-a) >= 20);
        
        if(Math.abs(a-b) >= 20)
        {
            return true;
        }
        else if(Math.abs(b-c) >= 20)
        {
            return true;
        }
        else if(Math.abs(c-a) >= 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static int twoValuesLargerSmaller63()
    {
        System.out.print("Input the first number: ");
        int a = intScanner();
        System.out.print("Input the second number: ");
        int b = intScanner();
        
        System.out.println("1.Result: " + resultLargerSmaller(a, b));
        
        if(a == b)
        {
            System.out.println("Result: " + 0);
            System.exit(0);
            return 0;
        }
        
        if(a != b)
        {
            int ra = a%6;
            int rb = b%6;
            System.out.println("Remainders: " + ra + " | " + rb);

            if(ra == rb)
            {
                if(a > b)
                {
                    System.out.println("Result: " + b);
                    return b;
                }
                else if (b > a)
                {
                    System.out.println("Result: " + a);
                    return a;
                }
            }
            else if(ra != rb)
            {
                if(a > b)
                {
                    System.out.println("Result: " + a);
                    return a;
                }
                else if (b > a)
                {
                    System.out.println("Result: " + b);
                    return b;
                }
            }
        }
        return 0;
    }

    public static int resultLargerSmaller(int a, int b)
    {
        if(a == b)
        {
            return 0;
        }
            if(a%6 == b%6)
            {
                return(a < b) ? a : b;
            }
            else
            {
                return(a > b) ? a : b;
            }
    }
    
    public static boolean commonDigitBoth64()
    {
        System.out.println("Input numbers between 25 and 75!");
        System.out.print("Input the first number: ");
        int a = intScanner();
        System.out.print("Input the second number: ");
        int b = intScanner();
        
        System.out.println("1. Result: " + result_common_digit(a,b));
        
        if(a<25 || a >75 || b<25 || b>25)
        {
            System.out.println("Error Wrong Number(s)!");
            System.exit(0);
            return false;
        }
        while(a != 0 || b != 0)
        {
            if(a%10 == b%10)
            {
                System.out.println("Result: " + true);
                System.exit(0);
                return true;
            }
            else
            {
                a = a / 10;
                b = b / 10;
            }
        }
        System.out.println("Result: " + false);
        return false;
    }
    
    public static boolean result_common_digit(int a, int b)
    {//nem megfelelő
        if(a<25 || b>25)
        {
            return false;
        }
        int x = a % 10;
        int y = b % 10;
        a /= 10;
        b /= 10;
        return (a == b || a == y || x == b || x == y);
    }
    
    public void calculateModulus65()
    {
        System.out.print("Input the first number: ");
        int a = intScanner();
        System.out.print("Input the second number: ");
        int b = intScanner();
        
        int divided = a / b;
        System.out.println(divided);
        int result = a - (divided * b);
        System.out.println(result);
    }
    
    public void computePrimeNumbers66()
    {
        //100-ig a prímszámok összege
        int result = 0;
        int x = 0;
        
        for(int i=2; i <= 100; i++)
        {
            x=0;
            for(int j=1; j <= i; j++)
            {
                if(i%j == 0)
                {
                    x++;
                }
            }
            if(x<=2)
            {
                //System.out.print(i + ",");
                result = result+i;
            }
        }
        
        System.out.println("\nSum of the prime numbers to 100: " + result);
        
        int nums = 1;
        int y = 0;
        int z = 0;
        int v = 0;
        
        while(z<100)
        {
            v++;
            if(v%2 != 0)
                {
                    if(is_prime(v))
                    {
                    //System.out.print(i + ",");
                    nums = nums+v;
                    z++;
                    }
                }
        }
        
        System.out.println("\nSum of the first 100 prime numbers: " + nums);
        
        
        int sum = 1;
        int n = 0;
        
        while(n < 100)
        {
            n++;
            if(n%2 != 0)
            {
                if(is_prime(n))
                    {
                        sum += n;
                    }
            }
        }
        System.out.println("\n2. Sum of the first 100 prime numbers:" + sum);
    }
    
    public static boolean is_prime(int n)
    {
        for(int i = 3; i * i <= n; i++ )
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public void insertStringInside67()
    {
        System.out.print("Input a sentence: ");
        String sentence = stringScanner();
        System.out.print("Input a word: ");
        String word = stringScanner();
        
        String[] text = sentence.split(" ");
        int x = text.length-1;
        
        for(int i = 0; i <= x; i++)
        {
            System.out.print(text[i] + " ");
            if(i%2==0)
            {
                System.out.print(word + " ");
            }
        }
        System.out.println();
        
        System.out.println(sentence.substring(0, 7) + word + sentence.substring(6));
    }
    
    public void copiesFourString68()
    {
        System.out.print("Input a word: ");
        String sentence = stringScanner();
        
        while(sentence.length()<3)
        {
            System.out.print("Error! At least 3 character long: ");
            sentence = stringScanner();
        }
        
        int x = sentence.length();
        
        String lastThree = sentence.substring(x-3, x);
        String newText = lastThree + lastThree + lastThree + lastThree;
        
        System.out.println("New Text:" + newText);
    }
    
    public void extractTheFirstHalf69()
    {
        System.out.print("Input a word: ");
        String sentence = stringScanner();
        
        while(sentence.length()<3)
        {
            System.out.print("Error! At least 3 character long: ");
            sentence = stringScanner();
        }        
        
        int x = sentence.length();
        String newText = sentence.substring(0,x/2);
        
        System.out.println("New Text: " + newText);
    }
    
    public void stringShorLongShort70()
    {
        System.out.print("Input the first word: ");
        String text1 = stringScanner();
        int x1 = text1.length();
        
        System.out.print("Input the second word: ");
        String text2 = stringScanner();
        
        /*while(text2.length()<x1)
        {
            System.out.print("Error! Second sentence need to be longer than first: ");
            text2 = stringScanner();
        }*/
        
        int x2 = text2.length();
        String newText = "";
        
            if(x1<x2)
            {        
                newText = text1 + text2 + text1;            
            }
            else if(x1>x2)
            {        
                newText = text2 + text1 + text2;            
            }
            else
            {
                newText = text1 + text2 + text1;                
            }
            
        System.out.println("New Text: " + newText);
    }
    
    public void stringsRemovingFirst71()
    {
        System.out.print("Input the first word: ");
        String str1 = stringScanner();
        while(str1.length()<=1)
        {
            System.out.print("Error!At least 3 character long! Try again:");
            str1 = stringScanner();
        }
        System.out.print("Input the second word: ");
        String str2 = stringScanner();
        while(str2.length()<=1)
        {
            System.out.print("Error!At least 3 character long! Try again:");
            str2 = stringScanner();
        }
        
        String text = str1.substring(1) + str2.substring(1);
        
        System.out.println(text);
    }
    
    public void stringNewFirstThree72()
    {
        System.out.print("Input a word: ");
        String str1 = stringScanner();
        
        if(str1.length()>=3)
        {
            String str2 = str1.substring(0,3);
            System.out.println(str2);
        }
        else if(str1.length()==2)
        {
            System.out.println(str1.substring(0,2) + "#");
        }
        else if(str1.length()==1)
        {
            System.out.println(str1.substring(0,1) + "##");
        }
        else
        {
            System.out.println("###");
        }
    }
    
    public void stringFirstLastCharacter73()
    {
        System.out.print("Input the first word: ");
        String str1 = stringScanner();
        int a1 = str1.length();
        System.out.print("Input the second word: ");
        String str2 = stringScanner();
        int a2 = str2.length();
        String text = "";
        String result = "";
        
        if(a1 == 0 && a2 != 0)
        {
            text = "#" + str2.substring(a2-1,a2);
        }
        else if(a2 == 0 && a1 != 0)
        {
            text = str1.substring(0,1) + "#";
        }
        else if(a1 == 0 && a2 == 0)
        {
            text = "##";
        }
        else
        {
        text = str1.substring(0,1) + str2.substring(a2-1,a2);
        }
        
        result += (a1 >= 1) ? str1.charAt(0) : "#";
        result += (a2 >= 1) ? str2.charAt(a2-1) : "#";
                
        System.out.println("1." + text);
        System.out.println("2." + result);
    }
    
    public void firstOrLastArrayTenAppears74()
    {
        System.out.print("Input Array lenght: ");
        int x = intScanner();
        while(x<2)
        {
            System.out.print("Error! At least 2 long! Try again: ");
            x = intScanner();
        }
        int[] numbers = new int[x];
        for(int i = 0; i < x; i++)
        {
        System.out.print("Input " + (i+1) + ". number: ");
        numbers[i] = intScanner();
        }
            if(numbers[0] == 10 || numbers[x-1] == 10)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            
        System.out.println((numbers[0] == 10 || numbers[x-1] == 10));
    }
    
    public void firstAndLastSameArray75()
    {
        int[] fixArray = {50,-20,0,30,40,60,10};
        int fa = fixArray.length;
        System.out.println((fa >= 1 && fixArray[0] == fixArray[fa-1]));
        
        System.out.print("Input Array length: ");
        int x = intScanner();
        while(x<2)
        {
            System.out.print("Error! At least 2 long! Try again: ");
            x=intScanner();
        }
        int[] numbers = new int[x];
        for(int i = 0; i < x; i++)
        {
            System.out.print("Input " + (i+1) + ". number: ");
            numbers[i] = intScanner();
        }
        
        if(numbers[0] == numbers[x-1])
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    
    public void twoArrayFirstLast76()
    {
        int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {45, 20, 10, 20, 30, 50, 11};
        
        System.out.println((array1[0] == array2[0] || array1[array1.length-1] == array2[array2.length-1]));
    }
    
    public void creatNewArrayFromTwo77()
    {
        int[] array1 = {50,-20,0};
        int[] array2 = {5,-50,10};
        int[] newArray = {array1[0],array2[array2.length-1]};
        
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));        
        System.out.println("New Array: " + Arrays.toString(newArray));
        
        System.out.print("New Array: [");
        for(int x : newArray)
        {
            System.out.print(x + ",");
        }
        System.out.print("\b]");
        System.out.println();
    }
    
    public void testArrayContains78()
    {
        int[] array1 = {5, 7};
        System.out.println("Original Array: " + Arrays.toString(array1));
        System.out.println((array1[0] == 4 || array1[0] == 7 || array1[1] == 4 ||array1[1] == 7));
    }
    
    public void rotateArrayLeft79()
    {
        int[] array1 = {20,30,40};
        System.out.println("Original Array: " + Arrays.toString(array1));
        
        int[] array2 = {array1[1], array1[2], array1[0]};        
        System.out.println("Rotated Array: " + Arrays.toString(array2));
        
        int temp = 0;
        temp = array1[0];
        array1[0] = array1[1];
        array1[1] = array1[2];
        array1[2] = temp;
        
        System.out.println("Rotated Array: " + Arrays.toString(array1));
    }
    
    public void getLargerFromArray80()
    {
        int[] array1 = {20,30,40};
        System.out.println("Original Array: " + Arrays.toString(array1));
        int x = array1.length;
        
        if(array1[0] > array1[x-1])
        {
            System.out.println("Larger value between first and last elemnet: " + array1[0]);
        }
        if(array1[0] < array1[x-1])
        {
            System.out.println("Larger value between first and last element: " + array1[x-1]);
        }
        else
        {
            System.out.println("The elements equals!");
        }
    }
    
    public void swapFirstAndLastElementArray81()
    {
        int[] array1 = {20,30,10,5,2,3,11,40};
        System.out.println("Original Array: " + Arrays.toString(array1));
        int x = array1.length;
        int[] array2 = new int[x];
        
        array2[0] = array1[x-1];
        array2[x-1] = array1[0];        
        for(int i = 1; i < x-1; i++)
        {
            array2[i] = array1[i];
        }
        
        System.out.println("New array after swapping the first and the last elements: " + Arrays.toString(array2));
    }
    
    public void findLargestFirstMiddleLastElement82()
    {
        int[] array1 = {20,30,40,50,67};
        System.out.println("Original Array: " + Arrays.toString(array1));
        
        int x = array1.length;
        int result = 0;
        
        if(array1[0] >= array1[x-1] && array1[0] >= array1[(x-1)/2])
        {
            result = array1[0];
        }
        else if(array1[0] <= array1[x-1] && array1[x-1] >= array1[(x-1)/2])
        {
            result = array1[x-1];
        }
        else if(array1[0] <= array1[(x-1)/2] && array1[x-1] <= array1[(x-1)/2])
        {
            result = array1[(x-1)/2];
        }
        else
        {
            System.out.println("Unexpected error!");
            result = array1[0];
        }
        
        System.out.println("Largest element between first, last and middle values: " + result);
    }
    
    public void multiplyTwoArrayElements83()
    {
        int[] array1 = {1,3,-5,4};
        int[] array2 = {1,4,-5,-2};
        
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        
        System.out.print("Result: ");
        for(int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i] * array2[i] + " ");
        }
        System.out.println();
    }
    
    public void lastThreeFrontAndBack84()
    {
        Scanner inputString = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = inputString.nextLine();
        
        while(word.length() < 3)
        {
            System.out.print("Error!Too short!Try again: ");
            word = inputString.nextLine();
        }
        
        String add = word.substring(word.length()-3);
        
        System.out.println(add+word+add);
    }
    
    public void checkStartSpecified85()
    {
        System.out.print("Input a sentence: ");
        Scanner inputString = new Scanner(System.in);
        String sentence = inputString.nextLine();
        
        String[] firstWord = sentence.split(" ");
        
        for(String s : firstWord)
        {
            System.out.print(s + " ");
        }
        
        System.out.println();
        
        if(firstWord[0].equals("Hello"))
        {
            System.out.println("True " + firstWord[0]);
        }
        else
        {
            System.out.println("False " + firstWord[0]);
        }
        System.out.println(sentence.startsWith("Hello"));
        inputString.close();
    }
    
    public void startsWithInteger86()
    {
        System.out.print("Input a number: ");
        int n = intScanner();
        
        while(n != 1)
        {
            System.out.println("n:" + n);
            if(n%2 == 0)
            {
                n = n/2;
            }
            else
            {
                n = (3*n+1) / 2;
            }
        }
        System.out.println("Result: " + n);
    }
    
    public void readIntegerSumDigits87()
    {
        System.out.print("Input a number: ");
        Scanner intScanner = new Scanner(System.in);
        
        int number = intScanner.nextInt();
        System.out.println("Original number: " + number);
        
        int digit = 0;
        int sumDigit = 0;
        
        String[] nameNumbers = {"Zero", "One" , "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] temp = new String[10];
        
        while(number != 0)
        {
        digit = number % 10;
        number = number / 10;
        System.out.print(digit + "+");
        sumDigit = sumDigit+digit;
        }
        System.out.println("\b\nThe sum of the digits: " + sumDigit);
        System.out.print("1.Numbers in English: ");
        
        int x = 0;
        while(sumDigit != 0)
        {
            digit=sumDigit%10;
            sumDigit = sumDigit/10;
            System.out.print(nameNumbers[digit] + " ");
            temp[x] = nameNumbers[digit];
            x++;
        }
        System.out.println();
        
        System.out.print("2.Numbers in English: ");
        for(int i=x-1; i >= 0; i--)
        {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
    
    
    public void readIntegerSumDigits87V2()
    {
        System.out.print("Input a number: ");
        Scanner intScanner = new Scanner(System.in);        
        String inputNumber = intScanner.nextLine();
        
        System.out.println("Original number: " + inputNumber);
        
        String[] nameNumbers = {"Zero", "One" , "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        char[] numbers = inputNumber.toCharArray();
        int sumDigits = 0;
        
        for(int i = 0; i <= numbers.length-1; i++)
        {
            sumDigits = sumDigits + numbers[i] - '0';
        }
        
        System.out.println("V2: The sum of the digits: " + sumDigits);
        System.out.print("V2: Numbers in English: ");
        
        if(sumDigits<10)
        {
            System.out.println(nameNumbers[sumDigits]);
        }
        else if(sumDigits>10)
        {
            int x = sumDigits%10;
            int y = sumDigits/10;
            System.out.print(nameNumbers[y] + " " + nameNumbers[x]);
        }
        else if(sumDigits>100)
        {
            int x = sumDigits%10;
            int y = sumDigits/10;
            int z = sumDigits/100;
            System.out.print(nameNumbers[z] + " " + nameNumbers[y] + " " + nameNumbers[x]);
        }
        
        System.out.println();
    }
    
    
    public void systemEnvironmentAndProperties88()
    {
        System.out.println("Current system environment:");
        System.out.println(System.getenv());
        System.out.println("\nCurrent system properties: ");
        System.out.println(System.getProperties());
    }
    
    public void checkSecurityManagerEstablished89()
    {
        System.out.println("Security Manager Established?: ");
        System.out.println(System.getSecurityManager());
        System.out.println((System.getSecurityManager() != null ? "" : "No"));
    }
    
    public void getTheValueOfTheEnvironment90()
    {
        System.out.println("\nEnvironment variable PATH: ");
        System.out.println(System.getenv("PATH"));
        System.out.println("\nEnvironment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));
        System.out.println("\nEnvironment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
    }
}