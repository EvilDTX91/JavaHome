/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3resource;

/**
 *
 * @author Tomi
 */
import java.util.*;
public class DataTypes {
    
    private static int inputInt()
    {
        Scanner inputInt = new Scanner(System.in);
        int number = 0;
        try{
            number = inputInt.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error!:" + e);
        }        
        return number;
    }
    
    private static double inputDouble()
    {
        Scanner inputInt = new Scanner(System.in);
        double number = 0;
        try{
            number = inputInt.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error!:" + e);
        }
        return number;
    }
    
    public void convertTemperatureFromFahrenheitToCelsius1()
    {
        System.out.print("Input a degree in Fahrenheit: ");
        double x = inputDouble();
        double c = (5*(x-32)) / 9;
        double f = (9*c+(32*5))/5;
        System.out.println(x + " degree Fahrenheit is equal to " + c + " in Celsius!(" + f + ")");
        
    }
    
    public void convertInchesToMeters2()
    {
        System.out.print("Input a value for inch: ");
        double inch = inputDouble();
        //double meter = (inch*25.4)/1000;
        double meter = inch * 0.0254;
        System.out.println(inch + " inch is " + meter + " meters.");
        
    }
    
    public void readIntAddsAllDigits3()
    {
        System.out.print("Input an integer between 0 and 1000:");
        int number = inputInt();
        while(number < 1 || number > 1000)
        {
            System.out.print("Error! Between 0 and 1000! Try again! :");
            number = inputInt();
        }
        
        int x = number;
        int digit = 0;
        while(x > 0)
        {
            digit = digit + (x%10);            
            x = x / 10;
        }
        
        System.out.println("The sum of all digits in " + number + " is " + digit);
    }
    
    public void convertMinutesYearsAndDays4()
    {
        System.out.print("Input the number of minutes: ");
        double minutes = inputInt();
        long days = 0, years = 0;
        int minDay = 60*24, dayYear = 365;
        
        days =  (long)(minutes / minDay);
        years = (long)(days / dayYear);
        days = (long)(days - (years * dayYear));
        //days = (minutes / 60 / 24) % dayYear;
        
        System.out.println((int)minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
    
    public void printsTheCurrentTimeGMT5()
    {
        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = inputInt();
        
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = ((totalHours + timeZoneChange) % 24);
        
        Date systemDate = new Date();
        long time = systemDate.getTime();
        int y = systemDate.getYear();
        int m = systemDate.getMonth();
        int d = systemDate.getDay();
        int h = systemDate.getHours();
        int min = systemDate.getMinutes();
        int sec = systemDate.getSeconds();
        int tz = systemDate.getTimezoneOffset();
        
        System.out.println("Here the current time is " + y + "." + m + "." + d + ". " + h + ":" + min + ":" + sec + "(" + tz + ")");
        System.out.format("Here the current time is %tc%n\n", System.currentTimeMillis());
        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
    
    public void computeBodyMassIndex6()
    {
        System.out.print("Input weight in pounds: ");
        double pounds = inputDouble();
        System.out.print("Input height in inches: ");
        double inches = inputDouble();
        
        double bmi = pounds * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        
        System.out.println("Body Mass Index is " + bmi);
        
        System.out.print("Input weight in kg: ");
        double weight = inputDouble();
        System.out.print("Input height in cm: ");
        double height = inputDouble();
        
        double siBMI = weight / ((height/100) * (height/100));
        
        System.out.println("Body Mass Index is " + siBMI);
        
        if(siBMI < 16)
        {
            System.out.println("Súlyos soványság!");
        }
        else if(siBMI > 16 && siBMI < 16.99)
        {
            System.out.println("Mérsékelt soványság!");
        }
        else if(siBMI > 17 && siBMI < 18.49)
        {
            System.out.println("Enyhe soványság!");
        }
        else if(siBMI > 18.5 && siBMI < 24.99)
        {
            System.out.println("Normális testsúly!");
        }
        else if(siBMI > 25 && siBMI < 29.99)
        {
            System.out.println("Túlsúlyos!");
        }
        else if(siBMI > 30 && siBMI < 34.99)
        {
            System.out.println("I. fokú elhízás!");
        }
        else if(siBMI > 35 && siBMI < 39.99)
        {
            System.out.println("II. fokú elhízás!");
        }
        else if(siBMI >= 40)
        {
            System.out.println("III. fokú (súlyos) elhízás! Előrehaladott kövér disznóititsz!");
        }
    }
    
    public void takesTheUserDistanceTimeAndDisplay7()
    {
        /*1 mile = 1609 meters*/
        System.out.print("Input distance in meters: ");
        double meters = inputDouble();
        System.out.print("Input hour: ");
        double hours = inputDouble();
        System.out.print("Input minutes: ");
        double minutes = inputDouble();
        System.out.print("Input seconds: ");
        double seconds = inputDouble();
        
        double meterpersec = meters / ((hours*60*60) + (minutes*60) + seconds);
        double kmperhour = (meters/1000) / (hours + (minutes/60) + (seconds/60/60));
        double milesperhour = (meters / 1609) / (hours + (minutes/60) + (seconds/60/60));
        
        System.out.println("Your speed in meters/second is " + meterpersec);
        System.out.println("Your speed in km/h is " + kmperhour);
        System.out.println("Your speed in miles/h is " + milesperhour);
        
        System.out.println();
        
        double timeSeconds, mps, kph, mph;
        
        timeSeconds = (hours*3600) + (minutes*60) + seconds;
        mps = meters / timeSeconds;
        kph = (meters/1000.0f) / (timeSeconds/3600.0f);
        mph = kph / 1.609f;
        
        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kph);
        System.out.println("Your speed in miles/h is " + mph);
    
    }
    
}
