package colorslide;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class ColorSlide extends JFrame implements ChangeListener {
    
    ColorPanel canvas = new ColorPanel(); //ColorPanel osztály 'canvas' objektum létrehozása
    JSlider red = new JSlider(0,255,255); //'red' csúszka létrehozása
    JSlider green = new JSlider(0,255,0); //'green' csúszka létrehozása
    JSlider blue = new JSlider(0,255,0); //'blue' csúszka létrehozása
    
    public ColorSlide(){ // keret létrehozása és beállításai
        super("Color Slide");
        setSize(270,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        red.setMajorTickSpacing(50); //címkejelzések sűrűségének be állítása (nagy)
        red.setMinorTickSpacing(10); //címkejelzések sűrűségének be állítása (kicsi)
        red.setPaintTicks(true); //címkejelzések megjelenítése
        red.setPaintLabels(true); //fő jelezésekhez tartozó számértékek megjelenítését
        red.addChangeListener(this);//a csúszka változásainak figyelése
        
        green.setMajorTickSpacing(50);
        green.setMinorTickSpacing(10);
        green.setPaintTicks(true);
        green.setPaintLabels(true);
        green.addChangeListener(this);
        
        blue.setMajorTickSpacing(50);
        blue.setMinorTickSpacing(10);
        blue.setPaintTicks(true);
        blue.setPaintLabels(true);
        blue.addChangeListener(this);
        
        JLabel redLabel = new JLabel("Red: "); //címke létrehozása
        JLabel greenLabel = new JLabel("Green: ");
        JLabel blueLabel = new JLabel("Blue: ");
        GridLayout grid = new GridLayout(4,1); // elrendezéskezelő beállítása
        FlowLayout right = new FlowLayout(FlowLayout.RIGHT);
        setLayout(grid);
        
        JPanel redPanel = new JPanel();//panel létrehozása
        redPanel.setLayout(right);//elrendezéskezelő hozzá adása a panelhez
        redPanel.add(redLabel); //cimke hozzá adása a panelhez
        redPanel.add(red); //csúszka hozzá adása panelhez
        add(redPanel); //a panel hozzá adása a kerezhez
        
        JPanel greenPanel = new JPanel();
        greenPanel.setLayout(right);
        greenPanel.add(greenLabel);
        greenPanel.add(green);
        add(greenPanel);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setLayout(right);
        bluePanel.add(blueLabel);
        bluePanel.add(blue);
        add(bluePanel);
        add(canvas);
        
        setVisible(true);
    }
    
    public void stateChanged(ChangeEvent evt){
        JSlider source = (JSlider)evt.getSource(); //az objektum átalakítása JSlider típusúra
        if(source.getValueIsAdjusting() != true){ //a csúszka mozgatásának megvizsgálása
            //ha már nem mozog a csúszka akkor, a csúszkák aktális értékének átadása az objektumnak
            Color current = new Color(red.getValue(), 
            green.getValue(),
            blue.getValue());
            canvas.changeColor(current);// az új értékek át adása a szín cserélőnek
            canvas.repaint();//az obejktum újra rajzolása
        }
    }
    
    public Insets getInsets(){ //szegély beállítás
        Insets border = new Insets(45,10,10,10); // szegény beállítás távolság (bottom,left,right,top)
        return border;
    }
    
    public static void main(String[] args) {
        ColorSlide cs = new ColorSlide(); //konstruktor példányosítás
    }
    
}
class ColorPanel extends JPanel{
    
    Color background;// objektum létrehozása
    
    ColorPanel(){
        background = Color.red;//értéke adás, háttér szín beállítása
    }
    
    public void paintComponent(Graphics comp){ //a panel komponens megrajzolása
        Graphics2D comp2D = (Graphics2D)comp; // a penel komponens létrehozása
        comp2D.setColor(background); // komponens színének beállítása
        comp2D.fillRect(0,0,getSize().width,getSize().height); //komponens méreteinek beállítása
    }
    
    void changeColor(Color newBackground){
        background = newBackground; //érték adás, háttér szín megváltozatása a kapott értékek szerint
    }
    
}