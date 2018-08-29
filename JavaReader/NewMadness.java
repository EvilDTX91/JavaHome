package newmadness;
import java.awt.*;
import javax.swing.*;
public class NewMadness extends JFrame {
    
    //az 1. sor létrehozása
    JPanel row1 = new JPanel();
    //ButtonGroup option = new ButtonGroup();
    JComboBox combobox = new JComboBox();
    
    //a 2. sor létrehozása
    JPanel row2 = new JPanel();
    JLabel numbersLabel = new JLabel("Your picks: ", JLabel.RIGHT);
    JTextField[] numbers = new JTextField[6];
    JLabel winnersLabel = new JLabel("Winners: ", JLabel.RIGHT);
    JTextField[] winners = new JTextField[6];
    
    //a 3. sor létrehozása
    JPanel row3 = new JPanel();
    JCheckBox stop = new JCheckBox("Stop",false);
    JCheckBox play = new JCheckBox("Play",true);
    JCheckBox reset = new JCheckBox("Reset",false);
    
    //a 4. sor létrehozása
    JPanel row4 = new JPanel();
    JLabel got3Label = new JLabel("3 of 6: ", JLabel.RIGHT);
    JTextField got3 = new JTextField("0");
    JLabel got4Label = new JLabel("4 of 6: ", JLabel.RIGHT);
    JTextField got4 = new JTextField("0");
    JLabel got5Label = new JLabel("5 of 6: ", JLabel.RIGHT);
    JTextField got5 = new JTextField("0");
    JLabel got6Label = new JLabel("6 of 6: ", JLabel.RIGHT);
    JTextField got6 = new JTextField("0", 10);
    JLabel drawingsLabel = new JLabel("Drawings: ", JLabel.RIGHT);
    JTextField drawings = new JTextField("0");
    JLabel yearsLabel = new JLabel("Years: ", JLabel.RIGHT);
    JTextField years = new JTextField();
    
    //a 5. sor létrehozása
    JPanel row5 = new JPanel();
    JLabel author = new JLabel("Készítette: ", JLabel.RIGHT);
    JTextField aut = new JTextField("Nádas Tamás");
    
    public NewMadness()
    {
        super("New Lotto Madness");
        setSize(550, 270);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(5, 1, 10, 10);
        setLayout(layout);
        
        //első sor rendezése
        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        /*'CENTER' a komponensek középre igazítottak ('10' szélessége, '10' magassága)
        azaz 10 képpontnyi a tárolóknak az egymástól való távolsága*/
        row1.setLayout(layout1);
        combobox.addItem("Quick Pick");
        combobox.addItem("Persolna");
        row1.add(combobox);
        add(row1);
        
        //második sor rendezése
        GridLayout layout2 = new GridLayout(2, 7, 10, 10);
        row2.setLayout(layout2);
        row2.add(numbersLabel);
        for(int i = 0; i < 6; i++)
        {
            numbers[i] = new JTextField();
            row2.add(numbers[i]);
        }
        row2.add(winnersLabel);
        for(int i = 0; i < 6; i++)
        {
            winners[i] = new JTextField();
            winners[i].setEditable(false);
            row2.add(winners[i]);
        }
        add(row2);
        
        //hamradik sor rendezése
        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        row3.setLayout(layout3);
        stop.setEnabled(false);
        row3.add(stop);
        row3.add(play);
        row3.add(reset);
        add(row3);
        
        //negyedik sor rendezése
        GridLayout layout4 = new GridLayout(2, 3, 20, 10);
        row4.setLayout(layout4);
        row4.add(got3Label);
        got3.setEditable(false);
        row4.add(got3);
        row4.add(got4Label);
        got4.setEditable(false);
        row4.add(got4);
        row4.add(got5Label);
        got5.setEditable(false);
        row4.add(got5);
        row4.add(got6Label);
        got6.setEditable(false);
        row4.add(got6);
        row4.add(drawingsLabel);
        drawings.setEditable(false);
        row4.add(drawings);
        row4.add(yearsLabel);
        years.setEditable(false);
        row4.add(years);
        add(row4);
        
        GridLayout layout5 = new GridLayout(1,2,50,10);
        row5.setLayout(layout5);
        row5.add(author);
        row5.add(aut);
        aut.setEditable(false);
        add(row5);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        NewMadness frame = new NewMadness();
    }
    
}