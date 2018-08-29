package clockpanel;
import java.awt.*;
import javax.swing.*;

public class ClockFrame extends JFrame {
    public ClockFrame() {
        super("Clock");
        setSize(225,125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        ClockPanel time = new ClockPanel();
        add(time);
        setVisible(true);
    }
    public static void main(String[] args) {
       ClockFrame clock = new ClockFrame();
    }
    
}
