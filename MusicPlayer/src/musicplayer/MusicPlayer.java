package musicplayer;

import java.io.*;
import java.util.*;

public class MusicPlayer {
    
    public static <E> List<E> dealHand(List<E> deck, int n) {
    int deckSize = deck.size();
    List<E> handView = deck.subList(deckSize - n, deckSize);
    List<E> hand = new ArrayList<E>(handView);
    handView.clear();
    return hand;
}
    
    public static void main(String[] args) {
        try{
            FileOutputStream out = new FileOutputStream("theTime.txt");
            ObjectOutputStream s = new ObjectOutputStream(out);
            s.writeObject("Today");
            s.writeObject(new Date());
            s.flush();            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error! File Not Found!: " + e);
        }
        catch(IOException e)
        {
            System.out.println("Error! I/O!: " + e);
        }
        
        File libary = new File("");
        System.out.println(libary.list());
        
        try{
            FileInputStream in = new FileInputStream("theTime.txt");
            ObjectInputStream s = new ObjectInputStream(in);
            String today = (String)s.readObject();
            Date date = (Date)s.readObject();
                
            System.out.println(date);
        }
        catch(FileNotFoundException e)
        { 
            System.out.println("Error! File Not Found!: " + e);  
        }
        catch(IOException e)
        {
            System.out.println("Error! I/O!: " + e);  
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Error! Class Not Found: " + e);  
        }        
        
        
    System.out.println("xBox Store Price Checker: ");
    int euro = 330;
    double x = 1, result = 0;
    Scanner money = new Scanner(System.in);
    while(x != 0)
    {
    System.out.print("Összeg Euro(325): ");
    x = money.nextDouble();
    result = result + x * euro;
    System.out.println("Ft: " + (x*euro));
    }
    System.out.println("Végösszeg Ft: " + result);
    
    
    int numHands = Integer.parseInt(args[0]);
        int cardsPerHand = Integer.parseInt(args[1]);
        // Make a normal 52-card deck
        String[] suit = new String[]
            {"spades", "hearts", "diamonds", "clubs"};
        String[] rank = new String[]
            {"ace","2","3","4","5","6","7","8",
             "9","10","jack","queen","king"};
        List<String> deck = new ArrayList<String>();
        for (int i = 0; i <suit.length; i++)
            for (int j = 0; j <rank.length; j++)
                deck.add(rank[j] + " of " + suit[i]);
        Collections.shuffle(deck);
        for (int i=0; i<numHands; i++)
            System.out.println(dealHand(deck, cardsPerHand));
    
    }    
}
