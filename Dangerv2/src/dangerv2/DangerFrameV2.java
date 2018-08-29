package dangerV2;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class DangerFrameV2 extends JFrame {
    
    JPanel textpanel = new JPanel();
    JPanel labelpanel = new JPanel();
    JPanel speedpanel = new JPanel();
    JPanel bgpanel = new JPanel();
    JSlider speed = new JSlider(0,100,20);
    
    JPanel colorpanel = new JPanel();
    JLabel bgcolorLabel = new JLabel("Background Color: ");
    JLabel redLabel = new JLabel("Red: ", JLabel.RIGHT);
    JTextField red = new JTextField("110");
    JLabel greenLabel = new JLabel("Green: ", JLabel.RIGHT);
    JTextField green = new JTextField("50");
    JLabel blueLabel = new JLabel("Blue: ", JLabel.RIGHT);
    JTextField blue = new JTextField("10");
    
    public DangerFrameV2(){
        super("Warning!");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(5, 1, 10, 10);
        setLayout(layout);
        
        JLabel speedLabel = new JLabel("Speed: ");
        //GridLayout layout2 = new GridLayout(1, 1, 20, 20);
        FlowLayout layout2 = new FlowLayout(FlowLayout.CENTER, 100, 10);
        labelpanel.setLayout(layout2);
        labelpanel.add(speedLabel);
        add(labelpanel);
        
        
        GridLayout layout3 = new GridLayout(1, 1, 20, 20);
        speedpanel.setLayout(layout3);
        speed.setMajorTickSpacing(20);
        speed.setMinorTickSpacing(10);
        speed.setPaintTicks(true);
        speed.setPaintLabels(true);
        speedpanel.add(speed);
        add(speedpanel);
        
        
        DangerV2 gb = new DangerV2("Core Breach in Sector 12", this);
        GridLayout layout1 = new GridLayout(1, 1, 20, 20);
        textpanel.setLayout(layout1);
        textpanel.add(gb);
        add(textpanel);
        
        FlowLayout layout5 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        bgpanel.setLayout(layout5);
        bgpanel.add(bgcolorLabel);
        add(bgpanel);
        
        GridLayout layout4 = new GridLayout(3,2);
        colorpanel.setLayout(layout4);
        colorpanel.add(redLabel);
        colorpanel.add(red);
        //red.addChangeListener(dangerc2);
        colorpanel.add(greenLabel);
        colorpanel.add(green);
        //red.addChangeListener(dangerc2);
        colorpanel.add(blueLabel);
        colorpanel.add(blue);
        //red.addChangeListener(dangerc2);
        add(colorpanel);
        
        setVisible(true);
    }
    public static void main(String[] args) {
        DangerFrameV2 frame = new DangerFrameV2();
    }
    
}