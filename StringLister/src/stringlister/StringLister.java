package stringlister;
import java.util.*;
public class StringLister {
    String[] names = {"Spanky" , "Alfalfa" , "Buckwheat" , "Daria" , "Stymie"
    , "Marianne" , "Scotty" , "Tommy" , "Chubby"};
    
    public StringLister(String[] moreNames){
        //vektor jobb tárolóhely, mert a nevek számának összeg nem imsert amig a program fut
        Vector<String> list = new Vector<String>(); //vektor létrehozása
        for(int i = 0; i < names.length; i++){ //names() több elemeinek száma és be járása
            list.add(names[i]); //names() tömb elemei betöltése a vektorba
        }
        for (int i = 0; i< moreNames.length; i++) { //moreNames() több elemeinek száma és be járása
            list.add(moreNames[i]); //moreNames() tömb elemeinek betöltése a vekotrba
            //ezeket az elemeket a konstrukor adja meg
        }
        Collections.sort(list); 
        //a Collections osztály egyik tagfüggvénye segítségével teszi ábécésorrendbe a vaktor karakterláncát
        for(String name : list){ // be járja a vektor elemeit
            System.out.println(name); // ki írja a vektor elemeit
        }
    }
    
    public static void main(String[] args) {
     String[] nevek = {"Jackie","Wickie","Mickey","Farina","Woim"};
     //StringLister lister = new StringLister(nevek); //Run/Set Project Configuration/Customize
     StringLister lister = new StringLister(args);
    }
    
}
