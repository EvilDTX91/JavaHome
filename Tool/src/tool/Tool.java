package tool;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tool extends JFrame {
    public Tool(){//Keret létrehozása és beállítása
        super("Tool");
        setSize(370,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //eszköztárgombok létrehozása
        ImageIcon image1 = new ImageIcon("newfile.gif");
        JButton button1 = new JButton(image1);
        ImageIcon image2 = new ImageIcon("openfile.gif");
        JButton button2 = new JButton(image2);
        ImageIcon image3 = new ImageIcon("savefile.gif");
        JButton button3 = new JButton(image3);
        
        //eszköztár létrehozása
        JToolBar bar = new JToolBar();
        bar.add(button1);
        bar.add(button2);
        bar.add(button3);
        
        //szövegmező létrehozása
        JTextArea edit = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(edit);
        
        //keret létrehozása
        BorderLayout border = new BorderLayout();
        setLayout(border);
        add("North", bar);
        add("Center", scroll);
        setVisible(true);
    }
    public static void main(String[] args) {
        Tool frame = new Tool();
    }
    
}
