package jatek;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Jatek extends JFrame {
    
    Figyelok figyelo = new Figyelok(this);
    
    
    Calendar mostDatum = Calendar.getInstance();
         private int evDatum = mostDatum.get(Calendar.YEAR);
         private int honapDatum = mostDatum.get(Calendar.MONTH);
         private int napDatum = mostDatum.get(Calendar.DAY_OF_MONTH);
         private int oraDatum = mostDatum.get(Calendar.HOUR_OF_DAY);
         private int percDatum = mostDatum.get(Calendar.MINUTE);
         private int masodpercDatum = mostDatum.get(Calendar.SECOND);
         private int szazadmasodpercDatum = mostDatum.get(Calendar.MILLISECOND);
    
         
    JPanel felsoPanel = new JPanel();
    JPanel oldalPanelJobb = new JPanel();
    JPanel kozepPanel = new JPanel();
    JPanel foPanel = new JPanel();
    JPanel oldalPanelBal = new JPanel();
    JPanel alsoPanel = new JPanel();
    
    
    //Belépés
    JLabel nevLabel = new JLabel("Név: ", JLabel.LEFT);
    JTextField nevField = new JTextField("");
    JLabel korLabel = new JLabel("Kor: ", JLabel.LEFT);
    JTextField korField = new JTextField("0");
    JButton start = new JButton("Start");
    JButton reset = new JButton("Kilépés");
    
    
    //Játékhoz
    JPanel gamePanel = new JPanel();
    ImageIcon imageHatlap = new ImageIcon("pictures/backside/hatlap.gif");
    ImageIcon image1select = new ImageIcon("pictures/backside/hatlapselected.gif");
    //JButton button1 = new JButton(imageHatlap);
    //JButton button2 = new JButton(imageHatlap);
    //JButton button3 = new JButton(imageHatlap);
    //JButton button4 = new JButton(imageHatlap);
    JRadioButton box1 = new JRadioButton(imageHatlap);
    JRadioButton box2 = new JRadioButton(imageHatlap);
    JRadioButton box3 = new JRadioButton(imageHatlap);
    JRadioButton box4 = new JRadioButton(imageHatlap);
    
    //Adatokhoz
    JPanel wellcomePanel = new JPanel();
    JLabel wellcome = new JLabel("Üdövözöllek, ", JLabel.CENTER);
    JLabel nevJatekosLabel = new JLabel("", JLabel.LEFT);
    JLabel korJatekosLabel = new JLabel("0", JLabel.LEFT);
    JLabel pontokJatekosLabel = new JLabel("Pontszám: 0", JLabel.LEFT);
    
    //Dátum és idő
    JPanel idoPanel = new JPanel();
    JLabel idoLabel = new JLabel(evDatum + "." + honapDatum + "." + napDatum + ". \t" + oraDatum + ":" + percDatum + ":" + masodpercDatum + "." + szazadmasodpercDatum);
    
    private void FoPanel(boolean indul){
    GridLayout racsrendez1 = new GridLayout(3,2,5,5);
    //BorderLayout racsrendez1 = new BorderLayout();
        //FlowLayout racsrendez1 = new FlowLayout();
    foPanel.setLayout(racsrendez1);
    foPanel.add(nevLabel);
    foPanel.add(korLabel);
    foPanel.add(nevField);
    foPanel.add(korField);
    foPanel.add(start);
    //foPanel.add(reset);
    //reset.setVisible(false);
    foPanel.setBackground(Color.green);
    add(foPanel);
    foPanel.setVisible(indul);
    WellComeStart(false);
    GamePanelStart(false);
    }
    
    public void FoPanelStart(boolean indul){
        if(indul==true){
            FoPanel(indul);
        }
        else{
            FoPanel(false);
        }
    }
    
    private void GamePanel(boolean indul){
    GridLayout racsrendez2 = new GridLayout(2,2,20,20);
    gamePanel.setLayout(racsrendez2);

    /*group.add(box1);
    group.add(box2);
    group.add(box3);
    group.add(box4);*/
    gamePanel.add(box1);
    gamePanel.add(box2);
    gamePanel.add(box3);
    gamePanel.add(box4);
    
    if(box1.getIcon() == imageHatlap)
    {
    box1.setRolloverIcon(image1select);
    }
    if(box2.getIcon() == imageHatlap)
    {
    box2.setRolloverIcon(image1select);
    }
    if(box3.getIcon() == imageHatlap)
    {
    box3.setRolloverIcon(image1select);
    }
    if(box4.getIcon() == imageHatlap)
    {
    box4.setRolloverIcon(image1select);
    }
    //gamePanel.add(button1);
    //gamePanel.add(button2);
    //gamePanel.add(button3);
    //gamePanel.add(button4);
    gamePanel.setBackground(Color.black);
    add(gamePanel);
    gamePanel.setVisible(indul);
    }
    public void GamePanelStart(boolean indul){
        if(indul==true){
            GamePanel(indul);
        }
        else{
            GamePanel(false);
        }
    }

    private void WellCome(boolean indul){
    //FlowLayout racsrendez3 = new FlowLayout();
    
    GridLayout racsrendez3 = new GridLayout(1,4,10,10);
    
    wellcomePanel.setLayout(racsrendez3);
    wellcomePanel.add(wellcome);
    wellcomePanel.add(nevJatekosLabel);
    wellcomePanel.add(korJatekosLabel);
    wellcomePanel.add(pontokJatekosLabel);
    wellcomePanel.setBackground(Color.yellow);
    add(wellcomePanel);
    wellcomePanel.setVisible(indul);
    }
    
    public void WellComeStart(boolean indul){
        if(indul==true){
            WellCome(indul);
        }
        else{
            WellCome(false);
        }
    }
    
    private void Also()
    {
        FlowLayout rendez = new FlowLayout();
        alsoPanel.setLayout(rendez);
        felsoPanel.add(wellcome);
        alsoPanel.add(idoLabel);
        alsoPanel.setBackground(Color.white);
        add(alsoPanel,BorderLayout.PAGE_END);
        alsoPanel.setVisible(true);
    }
    private void Felso()
    {
        FlowLayout rendez1 = new FlowLayout();
        felsoPanel.setLayout(rendez1);
        felsoPanel.setBackground(Color.red);
        add(felsoPanel,BorderLayout.PAGE_START);
        felsoPanel.setVisible(true);
    }
    private void Kozep()
    {
        //BorderLayout rendez = new BorderLayout();
        GridLayout rendez2 = new GridLayout(3,2,5,5);
        kozepPanel.setLayout(rendez2);
        kozepPanel.add(nevLabel);
        kozepPanel.add(korLabel);
        kozepPanel.add(nevField);
        kozepPanel.add(korField);
        kozepPanel.add(start);
        kozepPanel.setBackground(Color.green);
        add(kozepPanel,BorderLayout.CENTER);
        kozepPanel.setVisible(true);
        //FoPanelStart(true);
    }
    private void Ball()
    {
        FlowLayout rendez3 = new FlowLayout();
        oldalPanelBal.setLayout(rendez3);
        oldalPanelBal.setBackground(Color.orange);
        add(oldalPanelBal,BorderLayout.LINE_START);
        oldalPanelBal.setVisible(true);
    }
    private void Jobb()
    {
        FlowLayout rendez4 = new FlowLayout();
        oldalPanelBal.setLayout(rendez4);
        oldalPanelJobb.setBackground(Color.orange);
        add(oldalPanelJobb,BorderLayout.LINE_END);
        oldalPanelJobb.setVisible(true);
    }
    
    public Jatek(){
        super("Game on!");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //GridLayout rendez = new GridLayout(3, 1, 10, 10);
        //FlowLayout rendez = new FlowLayout();
        BorderLayout rendez = new BorderLayout();
        setLayout(rendez);
        start.addActionListener(figyelo);
        reset.addActionListener(figyelo);
        //button1.addActionListener(figyelo);
        box1.addActionListener(figyelo);
        box2.addActionListener(figyelo);
        box3.addActionListener(figyelo);
        box4.addActionListener(figyelo);
        setVisible(true);
        Felso();
        Jobb();
        FoPanelStart(true);
        Kozep();
        Ball();
        Also();
        
        System.out.println(evDatum + "." + honapDatum + "." + napDatum + ".\t" + oraDatum + ":" + percDatum + ":" + masodpercDatum + "." + szazadmasodpercDatum);
        while(masodpercDatum != mostDatum.get(Calendar.SECOND))
        {
            masodpercDatum = mostDatum.get(Calendar.SECOND);
            System.out.println(masodpercDatum + ",");
        }
    }
    
    public static void main(String[] args) {
        Jatek indul = new Jatek();
        //indul.WellCome(false);
        //indul.FoPanel(true);
        //indul.GamePanel(false);
        
        //indul.Also();
    }
    
}
