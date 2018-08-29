package w3resource;

import java.io.Console;
import java.io.File;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;

public class Basic2 {
    
    public int inputInt()
    {
        int x = 0;
        Scanner number = new Scanner(System.in);
        
        try{
            System.out.print("Kérek egy számot: ");
            x = number.nextInt();            
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
        
        return x;
    }
    
    public void javaVersion31()
    {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }
    
    public void compareTwoNumber32()
    {
        int a = inputInt();
        int b = inputInt();
        
        if( a != b)
        {
            System.out.println(a + " != " + b);
        }
        else
        {
            System.out.println(a + " = " + b);
        }
        
        if(a > b)
        {
            System.out.println(a + " > " + b);
        }
        else if(a < b)
        {
            System.out.println(a + " < " + b);
        }
        
        if(a >= b)
        {
            System.out.println(a + " >= " + b);
        }
        else if (a <= b)
        {
            System.out.println(a + " <= " + b);
        }
    }
    
    public void computeSumDigits33()
    {
        int x,sumDigit = 0, rem;
        
        Scanner numScan = new Scanner(System.in);
        System.out.print("Input an integer: ");        
        x = numScan.nextInt();
        
        while(x != 0)
        {
            rem = x%10;
            sumDigit = sumDigit + rem;
            x = x / 10;
        }
        
        System.out.println("The sum of the digits is: " + sumDigit);
    }
    
    public void computeAreaHexagon34()
    {
        int s = inputInt();
        double hexArea = (6*(s*s))/(4*Math.tan(Math.PI/6));
        
        System.out.println("The area of the hexagon is: " + hexArea);
    }
    
    public void computeAreaPolygon35()
    {
        int numSide;
        double side,polyArea;
        
        Scanner polyScan = new Scanner(System.in);
        
        System.out.print("Input the number of sides on the polygon:");
        numSide = polyScan.nextInt();
        
        System.out.print("Input the length of one of the sides:");
        side = polyScan.nextDouble();
        
        polyArea = (numSide*(side*side))/(4*Math.tan((Math.PI/numSide)));
    
        System.out.print("The are is: " + polyArea);
        System.out.println();
    }
    
    public void computeDistanceTwoPoints36()
    {
        double x1,x2,y1,y2,d, earthRadius = 6371.01;
        Scanner pointScan = new Scanner(System.in);
        
        System.out.print("Input the latitude of coordinate 1:");
        x1 = pointScan.nextDouble();
        System.out.print("Input the longitude of coordinate 1:");
        y1= pointScan.nextDouble();
        System.out.print("Input the latitude of coordinate 2:");
        x2 = pointScan.nextDouble();
        System.out.print("Input the longitude of coordinate 2:");
        y2 = pointScan.nextDouble();        
        
        System.out.println("The distance between those points: " + distance_Between_LatLong(x1,y1,x2,y2) + " km.");
        
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        
        d = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
        
        System.out.println("The distance between those points: " + d + " km.");
    }
    
    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2)
    {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        
        double earthRadius = 6371.01;
        
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
    }
    
    public void reverseString37()
    {
        
        Scanner stringScane = new Scanner(System.in);
        
        String inputString, reverseString = "";
        
        //char[] letters = stringScane.nextLine().toCharArray();
                
        System.out.print("Input string: ");
        inputString = stringScane.nextLine();
        
        int n = inputString.length()-1;
        
        for(int i = n; i >= 0; i--)
        {
            reverseString = reverseString + inputString.charAt(i);
        }
        
        System.out.println("Reverse string: " + reverseString);
    }
    
    public void countCharacters38()
    {
        Scanner stringScan = new Scanner(System.in);
        System.out.print("Input string: ");
        String inputText = stringScan.nextLine();
        
        char[] text = inputText.toCharArray();
        int letter = 0, space = 0, number = 0, other = 0;
        
        for(int i = 0; i < text.length; i++)
        {
            if(Character.isLetter(text[i]))
            {
                letter++;
            }
            else if(Character.isSpace(text[i]))
            {
                space++;
            }
            else if(Character.isDigit(text[i]))
            {
                number++;
            }
            else
            {
                other++;
            }
        }
        
        String print = "The string is: " + inputText + "\nletter: " + letter +
                "\nspace: " + space + "\nnumber: " + number + "\nother: " + other;
        
        System.out.println(print);
    }
    
    public void uniqueThreeDigitNumber39()
    {
        int totalNumber = 0;
        
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 4; j++)
            {
                for(int k = 1; k <= 4; k++)
                {
                    if(i != j && i != k && j != k)
                    {
                    System.out.print(i + "" + j + "" + k + ",");
                    totalNumber++;
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Total number of the three-digit-number is: " + totalNumber);
        
    }
    
    public void availableCharSets40()
    {
        System.out.println("List of available character sets: ");
        for(String str : Charset.availableCharsets().keySet())
            System.out.println(str);
    }
    
    public void printAsciiValue41()
    {
        int z = 'Z';
        
        System.out.println("The ASCII value of Z is: " + z);
    }
    
    public void inputDisplayPassword42()
    {
        String password;
        Scanner stringScan = new Scanner(System.in);
        System.out.print("Input your Password: ");
        password = stringScan.nextLine();
        System.out.println("Yor password was: " + password);
        
        /*Console cons;
        if((cons = System.console()) != null)
        {
            char[] pass_ward = null;
            try
            {
                pass_ward = cons.readPassword("Input your password: ");
                System.out.println("Your password was: " + pass_ward);
            }
            finally 
            {
                if(pass_ward != null)
                {
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        }
        else
        {
            throw new RuntimeException("Can't get password...No console!");
        }*/
    }
    
    public void stringSpecificFormat43()
    {
        System.out.print("Twinkle, twinkle, little star,");
        System.out.print("\n\tHow I wonder what you are! ");
        System.out.print("\n\t\tUp above the world so high,");
        System.out.print("\n\t\tLike a diamond in the sky.");
        System.out.print("\nTwinkle, twinkle, little star,");
        System.out.print("\n\tHow I wonder what you are\n");
    }
    
    public void integerComputeValue44()
    {
        int x = 0;
        
        Scanner intScan = new Scanner(System.in);
        System.out.print("Input number: ");
        
        try
        {
            x = intScan.nextInt();
        }
        catch(NumberFormatException e)
        {
            System.out.println("Given type not number: " + e);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Given type not integer number: " + e);
        }
        int a = (x*10)+x;
        int b = (x*100)+(x*10)+x;
        
        System.out.println(x + " + " + a + " + " + b);
        System.out.printf("%d + %d%d + %d%d%d\n", x, x, x, x, x, x);
        
    }    
    
    public void findFileSize45()
    {
        File folder = new File("testfiles");
        
        if(folder.exists())
        {
            for(final File fileEntry : folder.listFiles())
            {
                System.out.println(fileEntry.getName());
            }
        }
        File newFileA = new File(folder + "/abc.txt");
        File newFileB = new File(folder + "/test.txt");
        File newFileC = new File(folder + "/Sia - Cheap Thrills (feat. Sean Paul).mp3");
        
        if(newFileA.exists())
        {
            System.out.println(folder + "/" + newFileA.getName() + " : " + newFileA.length() + " kByte.");
        }
        if(newFileB.exists())
        {
            System.out.println(folder + "/" + newFileB.getName() + " : " + newFileB.length() + " kByte.");
        }
        if(newFileC.exists())
        {
            System.out.println(folder + "/" + newFileC.getName() + " : " + newFileC.length() + " kByte.");
        }
    }
    
    public void displaySystemTime46()
    {
        Date systemDate = new Date();
        
        long time = systemDate.getTime();
        int y = systemDate.getYear();
        int m = systemDate.getMonth();
        int d = systemDate.getDay();
        int h = systemDate.getHours();
        int min = systemDate.getMinutes();
        int sec = systemDate.getSeconds();
        
        System.out.println("Current Date Time: " + m + " " + d + " " + h + ":" + min + ":" + sec + " " + y);
        System.out.format("\nCurrent Date Time: %tc%n\n", System.currentTimeMillis());
    }
    
    public void displaySystemTimeSpecific47()
    {
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        
        System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));
    }
    
    public void printOddNumbers48()
    {
        for(int i = 1; i < 100; i++)
        {
            if(i%2 != 0)
            {
                System.out.println(i);
            }
        }
    }
    
    public int numberOddOrEven49()
    {
        Scanner scanInt = new Scanner(System.in);
        System.out.print("Input a number: ");
        int x = 0;
        try{
            x = scanInt.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("It's not a number!: " + e);
        }
        
        if(x%2 == 0)
        {
            System.out.println("1 (Even)");
            return 1;
        }
        else
        {
            System.out.println("0 (Odd)");
            return 0;
        }
    }
    
    public void printNumberDivisible50()
    {
        System.out.println("\nDivided by 3:");
        for(int i = 1; i < 100; i++)
        {
            if(i%3 == 0)
            {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        
        System.out.println("\nDivided by 5:");
        for(int i = 1; i < 100; i++)
        {
            if(i%5 == 0)
            {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        
        System.out.println("\nDivided by 3 & 5:");
        for(int i = 1; i < 100; i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
    
    public void convertStringToInt51()
    {
        Scanner stringScan = new Scanner(System.in);
        System.out.print("input a number(string): ");
        String number = stringScan.nextLine();
        int x = Integer.parseInt(number);
        System.out.println("The integer value is: " + x);
    }
    
    public boolean sumTwoEqualsThird52()
    {
        Scanner numberScan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = numberScan.nextInt();
        System.out.print("Input the second number: ");
        int b = numberScan.nextInt();
        System.out.print("Input the third number: ");
        int c = numberScan.nextInt();
        
        if(a+b == c || a+c == b || b+c == a)
        {
            System.out.println("The result is: true");
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void threeIntegerGreater53()
    {
        Scanner numberScan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = numberScan.nextInt();
        System.out.print("Input the second number: ");
        int b = numberScan.nextInt();
        System.out.print("Input the third number: ");
        int c = numberScan.nextInt();
        
        System.out.println("The rsult is: " + greater(a,b,c));
    }
    
    public boolean greater(int a, int b, int c)
    {
        return (c>b) || (c>b && b>a);
    }
    
    public void rightmostDigit54()
    {
        Scanner numberScan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = numberScan.nextInt();
        System.out.print("Input the second number: ");
        int b = numberScan.nextInt();
        System.out.print("Input the third number: ");
        int c = numberScan.nextInt();
        
        System.out.println("The result is: " + test_last_digit(a,b,c));
    }
    
    public boolean test_last_digit(int a, int b, int c)
    {
        return (a%10 == b%10) || (a%10 == c%10) || (b%10 == c%10);
    }
    
    public void converSecondToHour55()
    {
        Scanner secondScan = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int second = secondScan.nextInt();
        
        int p1 = second % 60;
        int p2 = second / 60;
        int p3 = p2%60;
        p2 = p2 / 60;
        
        System.out.println(p2 + ":" + p3 + ":" + p1);
        
        int hours = second/(60*60);
        second = second % (60*60);
        int minutes = second / 60;
        second = second % 60;;
        
        System.out.println(hours + ":" + minutes + ":" + second);
    }
    
    public void findNumbersOfIntegers56()
    {
        int x = 5, y = 20, p = 3, db = 0;
        
        for(int i = x; i <= y; i++)
        {
            if(i%p == 0)
            {
                db++;
            }
        }
        
        System.out.println("1. Divisible by " + p + ": " + db);
        System.out.println("2. Divisible by " + p + ": " + resultDiv56(x,y,p));
    }
    
    public static int resultDiv56(int x, int y, int p)
    {
        if(x%p == 0)
        {
            return( y/p - x/p + 1);
        }
        return(y/p - x/p);
    }
    
    public void acceptsIntegerCountFactor57()
    {
        int x = 0,factors=0;
        
        Scanner newInt = new Scanner(System.in);
        System.out.print("Input an integer: ");
        
        try{
        x = newInt.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error: " + e);
            System.exit(0);
        }
        
        for(int i = 1; i <= x; i++)
        {
            if(x%i == 0)
            {
                System.out.print(i + ",");
                factors++;
            }
        }
        System.out.println("\n" + x + " number have " + factors + " factor.");
    }
    
    public void capitalizeTheEachWord58()
    {
        String text = "", newText = ""; 
        char[] sentence = new char[500];
        
        Scanner newString = new Scanner(System.in);
        
        System.out.print("Input a sentence:");
        text = newString.nextLine();
        sentence = text.toCharArray();
        
        int n = text.length()-1;
               
        //----------- 1.
        /*
        sentence[0] = resultCapitalizeTheEachWord58(sentence[0]); 
        for(int i = 1; i <= n; i++)
        {
            if(sentence[i] == ' ')
            {
                sentence[i+1] = resultCapitalizeTheEachWord58(sentence[i+1]);
            }
        }        
        
        for(int i = 0; i <= n; i++)
        {
            System.out.print(sentence[i]);
        }
        System.out.println();
        */
        //----------- 1.
        
        //----------- 2.
        /*
        sentence[0] = Character.toUpperCase(sentence[0]);
        for(int i = 1; i <= n; i++)
        {
            if(sentence[i] == ' ')
            {
                sentence[i+1] =  Character.toUpperCase(sentence[i+1]);;
            }
        }
        
        for(int i = 0; i <= n; i++)
        {
            System.out.print(sentence[i]);
        }
        System.out.println();
        */
        //----------- 2.
        
        //----------- 3.
        String upper_case_line = "";
            Scanner lineScane = new Scanner(text);
            while(lineScane.hasNext())
            {
                String word = lineScane.next();
                //System.out.println(word);
                upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
                //System.out.println(upper_case_line);
            }
            System.out.println(upper_case_line.trim());
        //----------- 3.
        
        //System.out.println(newText);
        
    }
    
    public static char resultCapitalizeTheEachWord58(char c)
    {
        char[] up = {'A','B','C','D','E','F','G','H','I','J',
                      'K','L','M','N','O','P','Q','R','S','T',
                      'U','V','W','Z'};
        char[] low = {'a','b','c','d','e','f','g','h','i','j',
                     'k','l','m','n','o','p','q','r','s','t',
                     'u','v','w','z'};
        int n = 0;
        
        for(int i = 0; i <= low.length-1; i++)
        {
            if(low[i] == c)
            {
                n=i;
            }
        }
        
        return up[n];
    }
    
    
    public void convertGivenStringLowercase59()
    {
        Scanner newString = new Scanner(System.in);
        System.out.print("Input a String: ");
        String text = newString.nextLine();
        
        text = text.toLowerCase();
        
        System.out.println(text);
    }
    
    public void findPenultimateWord60()
    {
        Scanner newString = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = newString.nextLine();
        
        String[] words = line.split("[ ]+");
        /*a bevitt String-ből egy String tömböt csinál 
        a "split()" metódus segítségével
        a metódusban meg adott "karakter" találata alapján tegolja*/
        System.out.println("Penultimate word: " + words[words.length-2]);
        
        for(String w : words)
        {
            System.out.println(w);
        }
    }
}