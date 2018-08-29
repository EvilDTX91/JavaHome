package playback;
import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame {
    public Playback() {
        super("Playback");
        setSize(225,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
        add(play);
        add(stop);
        add(pause);
        setVisible(true);
    }
    public static void main(String[] args) {
        Playback pb = new Playback();
    }
    
}
