import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bounce3 extends JFrame implements ActionListener{
    BouncePanel3 canvas;
    JTextField speed;
    JSlider speedSlider = new JSlider(0,200); 
    
    BouncePanel3 bp3 = new BouncePanel3(this);
    
    public Bounce3(){
        super("Tennis");
        setSize(550,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        /*BorderLayout border = new BorderLayout();
        setLayout(border);
        canvas = new BouncePanel3();
        add(canvas, BorderLayout.CENTER);
        JPanel speedPanel = new JPanel();
        JLabel speedLabel = new JLabel("Speed:");
        speed = new JTextField("100", 10);
        JButton speedSetter = new JButton("Set");
        speedSetter.addActionListener(this);
        speedPanel.add(speedLabel);
        speedPanel.add(speed);
        speedPanel.add(speedSetter);
        add(speedPanel, BorderLayout.SOUTH);
        setVisible(true);*/
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        canvas = new BouncePanel3(this);
        add(canvas, BorderLayout.CENTER);
        
        JPanel sliderPanel = new JPanel();       
        speedSlider.setMajorTickSpacing(20);
        speedSlider.setMinorTickSpacing(10);
        speedSlider.setPaintTicks(true);
        speedSlider.setPaintLabels(true);
        sliderPanel.add(speedSlider);
        add(sliderPanel, BorderLayout.NORTH);
        
        JPanel speedPanel = new JPanel();
        JLabel speedLabel = new JLabel("Speed:");
        speed = new JTextField("100", 10);
        JButton speedSetter = new JButton("Set");
        speedSetter.addActionListener(this);
        speedPanel.add(speedLabel);
        speedPanel.add(speed);
        speedPanel.add(speedSetter);
        add(speedPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public static void main (String[] arguments){
        Bounce3 af = new Bounce3();
    }
public void actionPerformed(ActionEvent event){
    try{
    int speedValue = Integer.parseInt(speed.getText());
    canvas.setDelay(speedValue);
    } catch (NumberFormatException exception){
    //nem csinálunk semmit
        }
    }
}