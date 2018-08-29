package w3resource;

import java.util.*;

public class Basic1 {
    
    //************************************************************************\\
    
    public int inputInt()
    {
        int number = 0;
        
        while(number == 0)
        {
            Scanner inputReader = new Scanner(System.in);
            System.out.println("Kérek egy számot: ");
                try 
                {
                number = inputReader.nextInt();            
                }
                    catch(NumberFormatException e)
                    {
                        System.out.println("A megadott érték nem szám:" + e);            
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("Hibás formátum:" + e);
                    }
                    catch(NullPointerException e)
                    {
                        System.out.println("A megadott szám nem lehet nulla:" + e);
                    }
        }
        
        return number;
    }
    
    //************************************************************************\\
    
    
    public int binaryConvertToDecimal(int bin_num)
    {
        int dec_num = 0, rem, x = 1;
        
        while(bin_num != 0)
        {
            rem = bin_num % 10;
            dec_num = dec_num + rem * x;
            x = x * 2;
            bin_num = bin_num / 10;            
        }
        
        return dec_num;
    }
    
    //************************************************************************\\
    
    
    public void helloWorld1()
    {
        System.out.println("Hello World!");
    }
    
    public void sumNumbers2(int a, int b)
    {
        System.out.println(a+b);
    }
    
    public void divideNumbers3(int a, int b)
    {
        System.out.println(a/b);
    }
    
    public void followOp4()
    {
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);
    }
    
    public void inputNumbers5(int a, int b)
    {
        System.out.println(a + " x " + b + " = " + a*b);
    }
    
    public void intputTwoNumbPrintAll6(int a, int b)
    {
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " x " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " mod " + b + " = " + (a%b));
    }
    
    public void inputOneNumber7(int a)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
    
    public void printJava8()
    {
        System.out.println("   J     a   v     v   a");
        System.out.println("   J    a a   v   v   a a");
        System.out.println("J  J   aaaaa   V V   aaaaa");
        System.out.println(" JJ   a     a   V   a     a");
    }
    
    public void doubleCompute9()
    {
        double number = ((25.5*3.5-3.5*3.5)/(40.5-4.5));
        System.out.println(number);
    }
    
    public void doubleFormula10()
    {
        double number = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(number);
    }
    
    public void circle11(double r)
    {
        double area = (r*r)*Math.PI;
        double perimeter = 2*r*Math.PI;
        
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
    
    public void threeNumberAverage12(float a, float b, float c)
    {
       float d = (a+b+c)/3;
       System.out.println(d);
    }
    
    public void rectangle13(double a, double b)
    {
        double area = a*b;
        double perimeter = (a+b)*2;
        
        System.out.println("Area is " + a + " x " + b + " = " + area);
        System.out.println("Perimeter is (" + a + " + " + b + ") x 2 = " + perimeter);
    }
    
    public void americanFlag14()
    {
        String p1 = "* * * * * * ==================================";
        String p2 = " * * * * *  ==================================";
        String p3 = "==============================================";
        
        for(int i = 0; i < 4; i++)
        {
            System.out.println(p1 + "\n" + p2);
        }
        
        System.out.println(p1);
        
        for(int i = 0; i < 6; i++)
        {
            System.out.println(p3);
        }
    }
    
    public void swapTwoVariables15(int a, int b)
    {
        System.out.println("Before swapping A:" + a + " B:" + b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping A:" + a + " B:" + b);
    }
    
    public void printFace16()
    {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
    
    public void twoBinaryNumber17()
    {
        long a, b;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner binaryScan = new Scanner(System.in);
        
        System.out.println("First binary number: ");
        a = binaryScan.nextLong();
        System.out.println("Second binary number: ");
        b = binaryScan.nextLong();
        
        while(a != 0 || b != 0)
        {
            sum[i++] = (int)((a % 10 + b % 10 + remainder)%2);
            remainder = (int)((a % 10 + b % 10 + remainder)/2);
            a = a / 10;
            b = b / 10;            
        }
        if(remainder != 0)
        {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbes: ");
        while(i >= 0)
        {
            System.out.print(sum[i--]);
        }
        System.out.println();
        
    }
    
    public void multiplyTwoBinary18()
    {
        long a, b, multiply = 0;
        int digit, factor = 1;
        Scanner binaryScan = new Scanner(System.in);
        
        System.out.println("First binary number: ");
        a = binaryScan.nextLong();
        System.out.println("Second binary number: ");
        b = binaryScan.nextLong();
        
        while(b != 0)
        {
            digit = (int)(b%10);
            if(digit == 1)
            {
                a = a * factor;
                multiply = binaryproduct18((int) a, (int) multiply);
            }
            else
            {
                a = a * factor;
            }
            b = b / 10;
            factor = 10;
        }
        System.out.println("Product of two binary numbers: " + multiply);
    }
    
    static int binaryproduct18(int a, int b)
    {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;
        
        while(a!=0 || b!=0)
        {
            sum[i++] = (a % 10 + b % 10 + remainder)%2;
            remainder = (a % 10 + b % 10 + remainder)/2;
            a = a / 10;
            b = b / 10;
        }
        if(remainder != 0)
        {
            sum[i++] = remainder;
        }
        --i;
        while(i >= 0)
        {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }
        return binary_prod_result;
    }
    
    public void decimalConverBinary19()
    {
        /*decimális számot bináris számmá alakítani úgy kell hogy osztjuk kettővel és mindig a maradékot írjuk le(ami 1 vagy 0)
        addig még az osztás eredménye 0-a nem lesz*/
        int dec_num, rem, quot, i = 1, j;
        int[] bin_num = new int[100];
        
        Scanner decScan = new Scanner(System.in);
        System.out.println("Intput a decimal number:");
        dec_num = decScan.nextInt();
        
        quot = dec_num;
        
        while(quot != 0)
        {
            bin_num[i++] = quot%2; //maradékos osztást csinál ami ha kettővel osztunk vagy 1 vagy 0 lehet és ezt rakja bele a tömbbe
            //System.out.println("x:" + quot%2);
            quot = quot / 2; //maradékos osztás elvégzése után el is kell osztani kettővel, amig nem lesz 0-a azt osztás eredménye
            //System.out.println("y:" + quot);
        }
        
        System.out.println("Binary number:");
        for(j=i-1; j > 0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.println();
    }
    
    public void decimalConvertHexadecimal20()
    {
        int dec_num, rem;
        String hexdec_num = "";
        
        /* hexadecimal number digits */
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        /*Scanner decScan = new Scanner(System.in);
        System.out.println("Input a decimal number:");
        dec_num = decScan.nextInt();*/
        
        dec_num = inputInt();
        
        while(dec_num != 0)
        {
            rem = dec_num % 16;
            System.out.println(rem);
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num / 16;
        }
        System.out.println("Hexadecimal number is: " + hexdec_num);
    }
    
    public void decimalNumberOcta21()
    {
        int dec_num, rem, quot, i = 1, j;
        int[] octa_number = new int[100];
        
        dec_num = inputInt();
        quot = dec_num;
        
        while(quot != 0)
        {
            octa_number[i++] = quot%8;
            quot = quot / 8;            
        }
        
        System.out.print("Octa number is: ");
        for(j = i-1; j>0; j--)
        {
            System.out.print(octa_number[j]);
        }
        System.out.println();
    }
    
    public void binaryConvertDecimal22()
    {
        long bin_num, dec_num = 0, i = 1, rem;
        
        Scanner binScan = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        bin_num = binScan.nextLong();
        
        while(bin_num != 0)
        {
            rem = bin_num % 10;
            dec_num = dec_num + rem *i;
            i = i * 2;
            bin_num = bin_num / 10;
        }
        
        System.out.println("Decimal Number: " + dec_num);        
    }
    
    public void binaryConvertHexaDecimal23()
    {
        int bin_num, dec_num=0, rem, i = 1;
        String hex_num = "";
        
        /* hexadecimal number digits */
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner binScan = new Scanner(System.in);
        System.out.println("Input a binary number: ");
        bin_num = binScan.nextInt();
        
        while(bin_num != 0)
        {
            rem = bin_num % 10;
            dec_num = dec_num + rem * i;
            i = i * 2;
            bin_num = bin_num / 10;
        }
        
        while(dec_num != 0)
        {
            rem = dec_num % 16;
            hex_num = hex[rem] + hex_num;
            dec_num = dec_num / 16;
        }
        
        System.out.println("Hexadecimal number: " + hex_num);
    }
        
    public void binaryConvertOcta24()
    {
        int bin_num, dec_num, i = 1, rem;
        int[] octa_num = new int[100];
        
        bin_num = inputInt();
        dec_num = binaryConvertToDecimal(bin_num);
        
        while(dec_num != 0)
        {
            rem = dec_num % 8;
            octa_num[i++] = rem;
            dec_num = dec_num / 8;
        }
        System.out.print("Octa number: ");
        for(int j = i - 1; j > 0; j--)
        {
            System.out.print(octa_num[j]);
        }
        System.out.println();
        
    }
    
    public void octaConvertDecimal25()
    {
        int oct_num, dec_num = 0, rem, x = 1;
        
        Scanner scanOct = new Scanner(System.in);
        System.out.print("Input octal number: ");
        oct_num = scanOct.nextInt();
        
        while(oct_num != 0)
        {
            rem = oct_num % 10;
            dec_num = dec_num + rem * x;
            x = x * 8;
            oct_num = oct_num / 10;
        }
        
        System.out.println("Decimal number: " + dec_num);
    }
    
    public void octaConvertBinary26()
    {
        int oct_num, dec_num = 0, rem, x = 1, i = 1, quot;
        int[] bin_num = new int[100];
        
        Scanner octScan = new Scanner(System.in);
        System.out.print("Input octa number: ");
        oct_num = octScan.nextInt();
        quot = oct_num;
        
        while(quot != 0)
        {
            rem = quot % 10;
            dec_num = dec_num + rem * x;
            x = x * 8;
            quot = quot / 10;
        }
        
        System.out.println("Decimal number: " + dec_num);
        
        quot = dec_num;
        
        while(quot != 0)
        {
            rem = quot % 2;
            bin_num[i++] = rem;
            quot = quot / 2;
        }
        
        System.out.print("Binary number: ");
        for(int j = i-1; j > 0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.println();
    }
    
    public void octaConvertHexa27a()
    {
        int oct_num, dec_num = 0, x = 1, rem, quot;
        String hex_num = "";
        /* hexadecimal number digits */
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner octScan = new Scanner(System.in);
        System.out.print("Input octal number: ");
        oct_num = octScan.nextInt();
        quot = oct_num;
        
        while(quot != 0)
        {
            rem = quot % 10;
            dec_num = dec_num + rem * x;
            x = x * 8;
            quot = quot / 10;
        }
        
        quot = dec_num;
        
        while(quot != 0)
        {
            rem = quot % 16;
            hex_num = rem + hex_num;
            quot = quot / 16;
        }
        
        System.out.println("Hexadecimal number: " + hex_num);
    }
    
    public void octaConvertHexa27b()
    {
        int dec_num, bin_num;
        String oct_num,hex_num;
        
        Scanner numb = new Scanner(System.in);
        System.out.print("Enter number: ");
        oct_num = numb.nextLine();
        
        dec_num = Integer.parseInt(oct_num, 8);
        hex_num = Integer.toHexString(dec_num);
        
        System.out.println("Decimal number: " + dec_num);
        System.out.println("Hexadecimal number: " + hex_num);
    }
    
    public void hexaConvertDecimal28a()
    {
        int dec_num, rem, x = 1;
        String hex_num;
        Scanner hexScan = new Scanner(System.in);
        System.out.print("Input hexadecimal number: ");
        hex_num = hexScan.nextLine();
        
        dec_num = Integer.parseInt(hex_num, 16);
        
        System.out.println("Decimal number: " + dec_num);
    }
    
    public void hexaConvertDecimal28b()
    {
        String digits = "0123456789ABCDEF";
        int dec_num = 0;
        String hex_num;
        
        Scanner hexScan = new Scanner(System.in);
        System.out.print("Input hexadecimal number: ");
        hex_num = hexScan.nextLine();
        
        int length = hex_num.length();
        
        for(int i = 0; i < length; i++)
        {
            char c = hex_num.charAt(i);
            int d = digits.indexOf(c);
            dec_num = 16 * dec_num + d;
        }
        
        System.out.println("Decimal number: " + dec_num);
    }
    
    public void hexaConvertBinary29a()
    {
        int dec_num, rem, x = 1, i = 1, quot;
        int[] bin_num = new int[100];
        String hex_num;
        
        Scanner hexScan = new Scanner(System.in);
        System.out.print("Input hexadecimal number: ");
        hex_num = hexScan.nextLine();
        
        dec_num = Integer.parseInt(hex_num, 16);
        quot = dec_num;
        
        while(quot != 0)
        {
            rem = quot % 2;
            bin_num[i++] = rem;
            quot = quot / 2;            
        }
        
        System.out.println("Decimal number: " + dec_num);
        System.out.print("Binary number: ");
        for(int j = i-1; j > 0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.println();
    }
    
    public void hexaConvertBinary29b()
    {
        int dec_num = 0, rem, x = 1, quot;
        int[] bin_num = new int[100];
        String hex_num;
        String digits = "0123456789ABCDEF";
        
        Scanner hexScan = new Scanner(System.in);
        System.out.print("Input hexadecimal number: ");
        hex_num = hexScan.nextLine();
        
        for(int i = 0; i < hex_num.length(); i++)
        {
            char c = hex_num.charAt(i);
            int d = digits.indexOf(c);
            dec_num = dec_num * 16 + d;
        }
        
        quot = dec_num;
        
        while(quot != 0)
        {
            rem = quot % 2;
            bin_num[x++] = rem;
            quot = quot / 2;
        }
        
        System.out.println("Decimal number: " + dec_num);
        System.out.print("Binary number: ");
        for(int j = x-1; j > 0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.println();
    }
    
    public void hexaConvertOcta30a()
    {
        int dec_num, rem, i = 1;
        int[] oct_num = new int[100];
        String hex_num;
        
        Scanner hexScan = new Scanner(System.in);
        System.out.print("Input hexadecimal number: ");
        hex_num = hexScan.nextLine();
        
        dec_num = Integer.parseInt(hex_num, 16);
        
        while(dec_num != 0)
        {
            rem = dec_num % 8;
            oct_num[i++] = rem;
            dec_num = dec_num / 8;
        }
        
        System.out.print("Octa number: ");
        for(int j = i - 1; j > 0; j--)
        {
            System.out.print(oct_num[j]);
        }
        System.out.println();
    }
    
     public void hexaConvertOcta30b()
    {
        int dec_num, rem, i = 1;
        int[] oct_num = new int[100];
        String hex_num;
        
        Scanner hexScan = new Scanner(System.in);
        System.out.print("Input hexadecimal number: ");
        hex_num = hexScan.nextLine();
        
        dec_num = hexaConvertDecimal(hex_num);
        
        while(dec_num != 0)
        {
            rem = dec_num % 8;
            oct_num[i++] = rem;
            dec_num = dec_num / 8;
        }
        
        System.out.print("Octa number: ");
        for(int j = i - 1; j > 0; j--)
        {
            System.out.print(oct_num[j]);
        }
        System.out.println();
    }
     
     public static int hexaConvertDecimal(String hex_num)
     {
         String digits = "0123456789ABCDEF";
         int dec_num = 0;
         
         for(int i = 0; i < hex_num.length(); i++)
         {
             char c = hex_num.charAt(i);
             int d = digits.indexOf(c);
             dec_num = 16 * dec_num + d;
         }
         
         return dec_num;
     }
       
}