package player;
import java.awt.*;
import javax.swing.*;
public class Player extends JFrame {
    public Player(){
        //ablak létrehozása
        super("Player");
        setSize(294, 396);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PlayerPanel fp = new PlayerPanel();
        add(fp);
        setVisible(true);
    }
    public static void main(String[] args) {
        Player frame = new Player();// konstruktor
    } 
}

class PlayerPanel extends JPanel{
    public PlayerPanel(){
        //panel létrehozása és a kép be töltése a panelba
        ImageIcon player = new ImageIcon("johnny-evers-1913.jpg");
        JLabel playerLabel = new JLabel(player);
        add(playerLabel);
    }

public void paintComponent(Graphics comp){
    //kirajzolás az ablakban
    super.paintComponent(comp);
    /*meghívja a szülőosztály tagfüggvényét, hogy biztosan megtörténjen minden beállítás
    mielőtt a panelt kirajzolnánk*/
    
    Graphics2D comp2D = (Graphics2D)comp; //comp2D nevű Graphics2D objektum létrehozása
    //ebben az obejktumban hívunk majd meg minden későbbi rajzoló és betűtípus-tagfüggvényt
    
    //élsímítás be kapcsolása
    comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    
    //ablak méretének átadása
    int width = getSize().width;
    int height = getSize().height;
    
    //beűtípus és méret be állítása, el helyezés az ablakban
    Font currentFont = new Font("Dialog", Font.BOLD, 18);
    comp2D.setFont(currentFont);
    comp2D.drawString("JOHNNY EVERS", width - 155, height - 50);
    
    currentFont = new Font("Dialog", Font.ITALIC, 12);
    comp2D.setFont(currentFont);
    comp2D.drawString("second baseman", width - 155, height - 30);
    
    currentFont = new Font("Dialog", Font.PLAIN, 12);
    comp2D.setFont(currentFont);
    comp2D.drawString("CHICAGO CUBS", width - 155, height - 10);
    }
}
