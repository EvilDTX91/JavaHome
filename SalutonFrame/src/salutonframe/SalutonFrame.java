package salutonframe;
import java.awt.*;
import javax.swing.*;
public class SalutonFrame extends JFrame {
    public SalutonFrame()
    {
        super("Saluton mondo!");
        setSize(350, 100);
        JTextArea comments = new JTextArea("Saluton mondo!\n", 5, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(comments);
        setVisible(true);
    }
    public static void main(String[] args) {
       SalutonFrame sal = new SalutonFrame();
    }
    
}
