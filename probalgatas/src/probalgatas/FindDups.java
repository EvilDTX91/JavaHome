package probalgatas;
/*
Ez a program gyűjtemények(Collection) gyakorlására van.
Az argumentumként megadott szavakat rakja gyűjteménybe 'Set'
segítsévével, azaz nem szerepelhet kétszer ugyan az jelen esetben szó
a gyűjteményben. Azaz nem lehet duplikáció.
Ez eredetileg két külömböző program volt
Módosítottam őket hogy csak metódusok legyenek, amik meghívhatóak
*/
import java.util.*;
public class FindDups {
    
    //SET
    public void findDups(String[] args) {
        //a kapott argumentumokat berakja a gyűjteménybe ha még nincs benne
        Set<String> s = new HashSet<String>();
        for (String a : args)
            if (!s.add(a))
                System.out.println("Duplicate: " + a);
        System.out.println(s.size()+" distinct words: "+s);
    }
    
    public void findDups2(String[] args) {
        //két külömbőz gyűjteménybe rakja, az egyik amelyek csak egyszer szerepel(egyedi), a másikba amelyek többször(duplikált)
        Set<String> uniques = new HashSet<String>();
        Set<String> dups = new HashSet<String>();
        for (String a : args) 
            if (!uniques.add(a)) 
                dups.add(a);
        // Destructive set-difference
        uniques.removeAll(dups); 
        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
    
    // LIST
    public void Shuffle(String args[]) {
        // össze keveri az lista elemeit, véletlenszerűen
        List<String> list = new ArrayList<String>();
        for (String a : args) 
            list.add(a);
        Collections.shuffle(list, new Random());
        System.out.println(list);
    }
    
    public void Shuffle2(String args[]) {
        // ugyan az a program csak rövidebb és gyorsabb változata 'asList' használatával
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        System.out.println(list);
    }
    
    
    //subList
    public static <E> List<E> dealHand(List<E> deck, int n) {
    int deckSize = deck.size();
    List<E> handView = deck.subList(deckSize - n, deckSize);
    List<E> hand = new ArrayList<E>(handView);
    handView.clear();
    return hand;
    }
    
    public void Deal() {
        int numHands = Integer.parseInt("2");
        int cardsPerHand = Integer.parseInt("5");
        /*
        int numHands = Integer.parseInt(args[0]);
        int cardsPerHand = Integer.parseInt(args[1]);
        */
        // Make a normal 52-card deck
        String[] suit = new String[]
            {"Káró", "Pikk", "Treff", "Kör"};
        String[] rank = new String[]
            {"Ász","2","3","4","5","6","7","8",
             "9","10","Bubi","Dáma","Király"};
        List<String> deck = new ArrayList<String>();
        for (int i = 0; i <suit.length; i++)
            for (int j = 0; j <rank.length; j++)
                deck.add(suit[i] + " <" + rank[j] + ">");
        Collections.shuffle(deck);
        for (int i=0; i<numHands; i++)
            System.out.println(dealHand(deck, cardsPerHand));
}
    
    
    
    
    //Map
    public void Freq(String args[]) {
        Map<String, Integer>     m =
            new HashMap<String, Integer>();
        // Initialize frequency table from command line
        for (String a : args) {
            Integer freq = m.get(a);
            m.put(a, (freq == null ? 1 : freq + 1));
        }
        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
}
    
     public static void main(String args[]) {
         FindDups szavak = new FindDups();
         
         szavak.findDups(args);
         szavak.findDups2(args);
         szavak.Shuffle(args);
         szavak.Shuffle2(args);
         szavak.Deal();
         szavak.Freq(args);
         
     }
}