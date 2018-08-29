package gyak16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gyak16 extends JFrame{
    
    public Gyak16(){
        super("ScrollCombo");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComboBox leli = new JComboBox();
        leli.addItem("elso");
        leli.addItem("masodik");
        leli.addItem("harmadik");
        leli.addItem("negyedik");
        leli.addItem("otodik");
        leli.addItem("hatodik");
        leli.addItem("hetedik");
        
        JScrollPane scroll = new JScrollPane(leli);
        
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(scroll);
        
        setVisible(true);
        
    }
    public static void main(String[] args) {
        Gyak16 gyak = new Gyak16();
    }
    
}
