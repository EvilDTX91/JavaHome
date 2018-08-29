package keyview;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class KeyView extends JFrame implements KeyListener {
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text field.");
    
    KeyView(){
        super("KeyView");
        setSize(350,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(this);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }
    
    public void keyTyped(KeyEvent input){
        char key = input.getKeyChar();
        keyLabel.setText("You pressed: " + key);
    }
    
    public void keyPressed(KeyEvent txt){
        //nem csinálunk semmit
    }
    
    public void keyReleased(KeyEvent txt){
        //nem csinálunk semmit
    }
    
    public static void main(String[] args) {
     KeyView frame = new KeyView();
    }
    
}
