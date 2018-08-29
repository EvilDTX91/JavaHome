package keret;
import java.awt.*;
import javax.swing.*;

public class Kicsikeret extends JPanel {
    JLabel kicsikeret = new JLabel("Ez a második keret!");
    JLabel kicsi = new JLabel();
    public Kicsikeret()
    {
    super();
    add(kicsikeret);
    add(kicsi);
    };
    
}
