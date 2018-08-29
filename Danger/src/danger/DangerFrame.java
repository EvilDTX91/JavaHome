package danger;
import java.awt.*;
import javax.swing.*;

public class DangerFrame extends JFrame {
    public DangerFrame(){
        super("Warning!");
        setSize(400, 70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Danger gb = new Danger("Core Breach in Sector 12");
        add(gb);
        setVisible(true);
    }
    public static void main(String[] args) {
        DangerFrame frame = new DangerFrame();
    }
    
}
