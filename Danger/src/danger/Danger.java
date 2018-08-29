package danger;
import java.awt.*;
import javax.swing.*;

public class Danger extends JPanel implements Runnable{
    /*A 'class' utasítással a 'Danger'-t a 'JPanel' osztály alosztályaként határozzuk meg
    Az 'implements' kulcsszóval jelezzük, hogy a 'Danger' megvalósítja a 'Runnable' felületet
    ez a feltétele annak, hogy egy objektum 'szálként' futhassan.*/
    String text = "No text has been specified"; // karakterlánc változó a szöveg tárolására
    /*A lebegőpontos szám változókat a színek HSB értékeinek tárolásra használjuk.
    A (float) utasítás az utánna következő értéket lebegőpontos számmá alakítja.
    Ezt az átalakítást mindenképpen végre kell hajtani, mert a 'hue','saturation' és 'brightness'
    változók típusa csak 'float' lehet*/
    float hue = (float) 0.5;
    float saturation = (float) 0.8;
    float brightness = (float) 0.0;
    /*A panel megjelenítendő szöveg formázása, ennek tárolása egy 'Font' objektumban 'textFont'*/
    Font textFont = new Font("Dialog", Font.BOLD, 20);
    int textX; //egész szám változó a szöveg középre igazításához használjuk
    Thread runner;  //'runner' nevű 'Thread' objektum, hogy tárolja a 'Danger' osztályt futtató szálat
    
    public Danger(String warning){
    /*A konstruktort akkor hívjuk meg, amikor az osztályból objektumot hozunk létre, máskor
    nincs rá szükség. Ez a függvény olyan beállítások elhelyezésére alkalamas, amelyek
    nem példány- vagy osztályváltozók.*/
    text = warning; //egy függvénynek átadott karakterláncot azaz a 'warning' tartalmát át másololjuk a 'text' példányváltozóba
    FontMetrics fm = getFontMetrics(textFont); // megméri milyen széles lesz a megjelenítendő szövegsor
    textX = 200 - fm.stringWidth(text) / 2; // a szöveget a tároló külömböző részeire helyezhetjük, annak szélességétől függően
    runner = new Thread(this); //'Thread' obejktum létrehozása és 'start()' tagfüggvények meghívása, ennek eredményeként a szál elkezd futni
    // a szál maga a 'Danger' osztály mivel a 'Thread()' konstruktor tagfüggvénynek a 'this-t' adtul át 
    runner.start();
    }

    public void paintComponent(Graphics comp){
    /*A paintComponent() tagfüggvény a 'comp' nevű 'Graphics' objektumot veszi át paraméterként
    majd ezt az objektumot használja fel a 'comp2D' nevű 'Graphics2D objektum létrehozására.*/
    Graphics2D comp2D = (Graphics2D)comp;
    //A 'comp2D' tartalmazza az összes szükséges információt minden megjelenítési művelethez.
    //Később több tagfüggvényét használni is fogjuk.
    comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    //élsimítás be kapcsolása
    
    comp2D.setColor(Color.black);
    comp2D.fillRect(0,0,400,200);
    Color textColor = Color.getHSBColor(hue, saturation, brightness);
    /*Létrehoztuk a 'textColor' nevű 'Color' objektumot, amelyhez a szín a HSB változók
    használatával állítottuk be*/
    comp2D.setColor(textColor);
    //A 'textColor' objektum ez után a 'screen' 'setColor()' tagfüggvényének meghívásával válik az akutális színné
    comp2D.setFont(textFont);
    comp2D.drawString(text, textX, 30);
    /*a 'scrrend2D drawString()' tagfüggvényének meghívásával a 'text' változó a (textX, 30)
    koordinátán jelenik meg. A szöveg színe az előzőleg beállított aktuális szín.*/
    }
    
    void pause(int duration){
        /*A 'duration' értéket paraméterként átvevő 'pause()' tagfüggvény szünelteti a szál futását
        a 'Thread.sleep()' tagfüggvény meghívásával.
        A szüneltetés hosszát ezredmásodpercben kifejező számot adunk át paraméterként.*/
        try{
            Thread.sleep(duration);
        }catch (InterruptedException e){}
    }
    
    public void run(){
        /*létrehoztuk a 'Thread' objektumot, ez tartalmazza az éppen futó szálat, amit a 'while'
        ciklusban összehasonlítunk a 'runner' objektummal*/
        Thread thisThread = Thread.currentThread();
        while(runner == thisThread){
            /*A 'while' ciklus idézi elő a szöveg animációját. A 'pause(75)' utasítás az animációt
            75 ezredmásodpercre szünelteti az egyes panelfrissítések között.*/
            pause(75);
            brightness += 0.05;
            /*a 'brightness változó értékét meg kell változtatnunk, hogy a szöveg fényerje
            változni tudjon. A program 0.05-tel (5%-os változás) emeli az értéket, majd ha 
            elérte a maximális fényerőt (1.0), újraindul 0.0-ról.
            Mindig, amikor a fényerő visszaáll 0.0 értékre, a program meghívja a pause() tagfüggvényt.*/
            if(brightness > 1){
                brightness = (float) 0.0;
                pause(75);
            }
            repaint();
            // ha valamilyen változás következtében a tároló újrarajzolása szükségessé válik.
            // 'repaint()' utasítás kéri a Javát a 'paintComponent()' tagfüggvény meghívására
        }
    }
    
public static void main(String[] args) {
        DangerFrame frame = new DangerFrame();
    }
    
}
