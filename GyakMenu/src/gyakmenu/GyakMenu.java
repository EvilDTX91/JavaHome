package gyakmenu;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GyakMenu extends JFrame {
    
    JMenuItem gambler1 = new JMenuItem("Hold 'Em");
    JMenuItem gambler2 = new JMenuItem("Fold 'Em");
    JMenuItem gambler3 = new JMenuItem("Walk Away");
    JMenuItem gambler4 = new JMenuItem("Run");
    JMenuItem gambler5 = new JMenuItem("Count Your Money");
    JMenuItem exit = new JMenuItem("Exit");
    
    public GyakMenu(){
        
        super("Menu Demo");
        setSize(270,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        JMenu m1 = new JMenu("Gamble");
	m1.add(gambler1);
	m1.add(gambler2);
	m1.addSeparator();
	m1.add(gambler3);
	m1.add(gambler4);
	m1.addSeparator();	
	m1.add(gambler5);
        m1.addSeparator();	
	m1.add(exit);
        gambler5.setEnabled(false);
        
        JMenuBar jmb = new JMenuBar();
	jmb.add(m1);
	setJMenuBar(jmb);
    }
    
    public static void main(String[] args) {
       GyakMenu menu = new GyakMenu();
    }
    
}
