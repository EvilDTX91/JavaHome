package keret;
import java.awt.*;
import javax.swing.*;

public class Keret extends JFrame {
    public Keret()
    {
    super("Első keret!");
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FlowLayout flo = new FlowLayout();
    setLayout(flo);
    Kicsikeret kicsi = new Kicsikeret();
    add(kicsi);
    setVisible(true);
    };
    public static void main(String[] args) {
        Keret kt = new Keret();
    }
    
}