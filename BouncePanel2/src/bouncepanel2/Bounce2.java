import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bounce2 extends JFrame implements ActionListener{
    BouncePanel2 canvas;
    JTextField speed;
    
    public Bounce2(){
        super("Tennis");
        setSize(550,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        BorderLayout border = new BorderLayout();
        setLayout(border);
        canvas = new BouncePanel2();
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
        setVisible(true);
        
        /*
        GridLayout layout = new GridLayout(3, 1, 0, 0);
        setLayout(layout);
        
        JPanel row1 = new JPanel();
        JSlider speedSlider = new JSlider(0,100);
        
        JPanel row2 = new JPanel();
        BouncePanel2 boing = new BouncePanel2();
        
        JPanel row3 = new JPanel();
        JLabel speedLabel = new JLabel("Speed:");
        TextField speedArea = new TextField("100");
        
        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        row1.setLayout(layout1);
        speedSlider.setMajorTickSpacing(20);
        speedSlider.setMinorTickSpacing(10);
        speedSlider.setPaintTicks(true);
        speedSlider.setPaintLabels(true);
        row1.add(speedSlider);
        add(row1);
        
        FlowLayout layout2 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        row2.setLayout(layout2);
        row2.add(boing);
        add(row2);
        
        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        row3.setLayout(layout3);
        row3.add(speedLabel);
        row3.add(speedArea);
        add(row3);
        
        setVisible(true);*/
    }
    
    public static void main (String[] arguments){
        Bounce2 af = new Bounce2();
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