import java.awt.*;
import javax.swing.*;

public class Bounce extends JFrame{
    public Bounce(){
        super("Tennis");
        setSize(550,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BouncePanel boing = new BouncePanel();
        add(boing);
        setVisible(true);
    }
    
    public static void main (String[] arguments){
        Bounce frame = new Bounce();
    }
}