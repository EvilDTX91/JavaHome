package repeat;
import java.util.*;
public class Repeat {
    public static void main(String[] args) {
    String sentence = "Thorium 230 is not a toy.";
    int count = 10;
    
    /*létre hozza 'start' változót a 'Calendar' osztályból
    tartalma az aktuális idő lesz*/
    Calendar start = Calendar.getInstance();
    
    /*'Calendar' osztály get() tagfügvényével ki keressük a pillanatnyi idő
    adatokat és el raktározzuk őket*/
    int startMinute = start.get(Calendar.MINUTE);
    int startSecond = start.get(Calendar.SECOND);
    
    // egy percel előrébb lépteti a 'start' változóban tárolt időértéket
    start.roll(Calendar.MINUTE, true);
    
    /*get() tagfüggvény használjuk a 'start' változóban tárolt idő adatok
    le kérdezésre és el raktározzuk őket változókban(+1perc)*/
    int nextMinute = start.get(Calendar.MINUTE);
    int nextSecond = start.get(Calendar.SECOND);
    /*
    while (count < 1000000)
    {
        System.out.println(sentence);
        
        // Calendar osztályból létre hozunk egy 'now' változót
        //amely értéke a pillanatnyi idő
        GregorianCalendar now = new GregorianCalendar();
        
        //megvizsgálja hogy le telt-e az egy perc, a pillanatnyi idő és
        //a változókban tárolt értékek segítségével (+1perc, nextMinute,nextSecond
        if(now.get(Calendar.MINUTE) >= nextMinute)
        {
            if (now.get(Calendar.SECOND) >= nextSecond)
            {
                break;
            }
        }
        count++;
    }
    System.out.println("\nI wrote the sentence " + count + " times.");
    System.out.println("I have learned my lesson.");
    */
    //'házifeladat' megoldás
    int i = 10;
    for (; i <1000000; i++)
    {
     System.out.println(sentence);
     GregorianCalendar now = new GregorianCalendar();
     if(now.get(Calendar.MINUTE) >= nextMinute)
        {
            if (now.get(Calendar.SECOND) >= nextSecond)
            {
                break;
            }
        }
    }
    System.out.println("\nI wrote the sentence " + i + " times.");
    System.out.println("I have learned my lesson.");
 }   
}
