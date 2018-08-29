package crisis;
import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame {
    
    JPanel row1 = new JPanel();
    JButton panicButton = new JButton("Panic");
    JButton dontPanicButton = new JButton("Don't Panic");
    
    JPanel row2 = new JPanel();
    JButton blameButton = new JButton("Blame Others");
    JButton mediaButton = new JButton("Notify the Media");
    JButton saveButton = new JButton("Save Yourself");
    
    JPanel row3 = new JPanel();
    JLabel author = new JLabel("Készítette: ", JLabel.RIGHT);
    JTextField aut = new JTextField("Nádas Tamás");
    
    public Crisis()
    {
    super("Crisis");
    setSize(550, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GridLayout layout = new GridLayout(3, 1, 10, 10);
    setLayout(layout);
    
    //FlowLayout
    /*FlowLayout flo = new FlowLayout();
    setLayout(flo);*/
    
    
    //GridLayout
    /*GridLayout grid = new GridLayout(2, 3);
    setLayout(grid);*/
    
    /*
    add(panicButton);
    add(dontPanicButton);
    add(blameButton);
    add(mediaButton);
    add(saveButton);
    setVisible(true);
    */
    
    //BorderLayout
    /*
    BorderLayout crisisLayout = new BorderLayout();
    setLayout(crisisLayout);
    add(panicButton, BorderLayout.NORTH);
    add(dontPanicButton, BorderLayout.SOUTH);
    add(blameButton, BorderLayout.EAST);
    add(mediaButton, BorderLayout.WEST);
    add(saveButton, BorderLayout.CENTER);
    setVisible(true);
    */
    
    //BoxLayout
    /*
    JPanel pane = new JPanel();
    BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
    pane.setLayout(box);
    pane.add(panicButton);
    pane.add(dontPanicButton);
    pane.add(blameButton);
    pane.add(mediaButton);
    pane.add(saveButton);
    add(pane);
    setVisible(true);
    */
    
    //házi vagy gyakorlat
    FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
    row1.setLayout(layout1);
    row1.add(panicButton);
    row1.add(dontPanicButton);
    add(row1);
    
    GridLayout layout2 = new GridLayout(1,3,10,10);
    row2.setLayout(layout2);
    row2.add(blameButton);
    row2.add(mediaButton);
    row2.add(saveButton);
    add(row2);
    
    GridLayout layout3 = new GridLayout(1,2,50,10);
        row3.setLayout(layout3);
        row3.add(author);
        row3.add(aut);
        aut.setEditable(false);
        add(row3);
    
    setVisible(true);
    }
    public Insets getInsets()
    {
        Insets squeeze = new Insets(50, 15, 10, 15);
        return squeeze;
    }
    public static void main(String[] args) {
        Crisis cr = new Crisis();
    }
    
}
