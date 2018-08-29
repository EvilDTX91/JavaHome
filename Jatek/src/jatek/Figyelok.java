package jatek;

import javax.swing.*;
import java.awt.event.*;

public class Figyelok implements ActionListener{
    
    Jatek jatek;
    //private int i = 0;
    private int score = 0;
    private String kep1 = "";
    private String kep2 = "";
    //szálon kell futtatni a programot a start lenyomása után, elvileg akkor így lehet késlelteni a képek vissza fordítását is
        
    public Figyelok(Jatek in){
        jatek = in;
    }
    
    public void KepAtKonv(ImageIcon kepnev)
    {
        String kep=kepnev.toString();
        KepAzonos(kep);
    }
    
    public void KepAzonos(String kepnev)
    {        
        if(kep1 == "")
        {
            kep1 = kepnev;
            System.out.println("Kep1: " + kep1);
            //kepnev = "";
        }
        else if (kep1 != "" && kep2 == "")
        {
            kep2 = kepnev;
            System.out.println("Kep2: " + kep2);
            //kepnev = "";
        }
        if(kep1 != "" && kep2 != "")
        {
            KepEgyForma();
        }
        
    }
    
    public void KepEgyForma()
    {
        if(kep1 == kep2)
        {
            score++;
            Pontok(score);
            System.out.println("Hoppá! Ez egy pont! Jelenlegi pontszám:" + score + " (" + jatek.nevJatekosLabel.getText() + ")");
            eltuntet(kep1);
            //visszaFordit();
            kep1 = "";
            kep2 = "";
        }
        else
        {
            System.out.println("Sajnos ez nem ér pontot! :( Jelenlegi pontszám:" + score + " (" + jatek.nevJatekosLabel.getText() + ")");
            visszaFordit();
            kep1 = "";
            kep2 = "";
        }
    }
    
    public void visszaFordit()
    {
        ImageIcon ima = new ImageIcon("pictures/backside/hatlap.gif");
            jatek.box1.setIcon(ima);
            jatek.box1.setSelected(false);
            jatek.box2.setIcon(ima);
            jatek.box2.setSelected(false);
            jatek.box3.setIcon(ima);
            jatek.box3.setSelected(false);
            jatek.box4.setIcon(ima);
            jatek.box4.setSelected(false);
    }
    
    public void eltuntet(String A)
    {
        if(jatek.box1.getIcon().toString() == A)
        {
            jatek.box1.setVisible(false);
            jatek.box1.setSelected(false);
        }
        if(jatek.box2.getIcon().toString() == A)
        {
            jatek.box2.setVisible(false);
            jatek.box2.setSelected(false);
        }
        if(jatek.box3.getIcon().toString() == A)
        {
            jatek.box3.setVisible(false);
            jatek.box3.setSelected(false);
        }
        if(jatek.box4.getIcon().toString() == A)
        {
            jatek.box4.setVisible(false);
            jatek.box4.setSelected(false);
        }
    }
    
    public void actionPerformed(ActionEvent esemeny){
        String parancs = esemeny.getActionCommand();
        System.out.println(parancs);
        if(parancs == "Start"){
            jatekIndul();
            Adatok();
        }
        if(parancs == "Kilépés"){
            jatekReset();
            Adatok();
        }
        
        if(jatek.box1.isSelected() == true)
        {
            ImageIcon ima = new ImageIcon("pictures/memo/sziv.gif");
            //jatek.button1.setIcon(ima);
            jatek.box1.setIcon(ima);
            KepAtKonv(ima);
            jatek.box1.setSelected(false);
        }
        else{
            ImageIcon ima = new ImageIcon("pictures/backside/hatlap.gif");
            jatek.box1.setIcon(ima);
            //jatek.box1.setRolloverIcon(jatek.image1select);
        }
        if(jatek.box2.isSelected() == true)
        {
            ImageIcon ima = new ImageIcon("pictures/memo/sziv.gif");
            jatek.box2.setIcon(ima);
            KepAtKonv(ima);
            jatek.box2.setSelected(false);
        }
        else{
            ImageIcon ima = new ImageIcon("pictures/backside/hatlap.gif");
            jatek.box2.setIcon(ima);
            //jatek.box2.setRolloverIcon(jatek.image1select);
        }
        if(jatek.box3.isSelected() == true)
        {
            ImageIcon ima = new ImageIcon("pictures/memo/csillag.gif");
            jatek.box3.setIcon(ima);
            KepAtKonv(ima);
            jatek.box3.setSelected(false);
        }
        else{
            ImageIcon ima = new ImageIcon("pictures/backside/hatlap.gif");
            jatek.box3.setIcon(ima);
            //jatek.box3.setRolloverIcon(jatek.image1select);
        }
        if(jatek.box4.isSelected() == true)
        {
            ImageIcon ima = new ImageIcon("pictures/memo/csillag.gif");
            jatek.box4.setIcon(ima);
            KepAtKonv(ima);
            jatek.box4.setSelected(false);
        }
        else{
            ImageIcon ima = new ImageIcon("pictures/backside/hatlap.gif");
            jatek.box4.setIcon(ima);
            //jatek.box4.setRolloverIcon(jatek.image1select);
        }
    }
    
    void jatekIndul(){
        //System.out.println("Start...");ó
        jatek.WellComeStart(true);
        jatek.GamePanelStart(true);
        
        jatek.gamePanel.setVisible(true);
        //jatek.wellcomePanel.setVisible(true);
        //jatek.start.setVisible(false);
        jatek.foPanel.remove(jatek.start);
        //jatek.reset.setVisible(true);
        jatek.foPanel.add(jatek.reset);
        jatek.kozepPanel.remove(jatek.start);
        jatek.nevField.setEditable(false);
        jatek.nevField.setVisible(false);
        jatek.nevLabel.setVisible(false);
        jatek.korField.setEditable(false);
        jatek.korField.setVisible(false);
        jatek.korLabel.setVisible(false);
        jatek.box1.setVisible(true);
        jatek.box2.setVisible(true);
        jatek.box3.setVisible(true);
        jatek.box4.setVisible(true);
    }
    void jatekReset(){
        jatek.WellComeStart(false);
        jatek.gamePanel.setVisible(false);
        //jatek.wellcomePanel.setVisible(false);
        //jatek.start.setVisible(true);
        //jatek.reset.setVisible(false);
        jatek.foPanel.add(jatek.start);
        jatek.foPanel.remove(jatek.reset);
        jatek.kozepPanel.add(jatek.start);
        jatek.nevField.setEditable(true);
        jatek.nevField.setVisible(true);
        jatek.nevLabel.setVisible(true);
        jatek.korField.setEditable(true);
        jatek.korField.setVisible(true);
        jatek.korLabel.setVisible(true);
        score = 0;
        Pontok(score);
        //jatek.nevJatekosLabel.setText("Tyomi");
        //jatek.korJatekosLabel.setText("26");
    }
    
    void Adatok()
    {
        String nev = jatek.nevField.getText();
        int nevhossz = nev.length();
        String ujnev = "Player";
        if(nevhossz != 0)
        {
            jatek.nevJatekosLabel.setText(nev);
            jatek.nevField.setText(nev);
        }
        else
        {
            jatek.nevJatekosLabel.setText(ujnev);
            jatek.nevField.setText(ujnev);
        }
        
        int kor = Integer.parseInt(jatek.korField.getText());
        //System.out.println(kor);
        try
        {
        if(kor > 0)
        {
            jatek.korJatekosLabel.setText("(" + jatek.korField.getText() + ")");
            jatek.korField.setText(jatek.korField.getText());
        }
        else
        {
            jatek.korJatekosLabel.setText("(18)");
            jatek.korField.setText("18");
        }
        }
        catch (NumberFormatException e){
                System.out.println("Számot kell megadni.");
            }
        catch (ArithmeticException e) {
                System.out.println("A szám nem lehet nulla.");
        }
    }
    void Pontok(int pontok)
    {
        //Integer.toString(i) or String.valueOf(i).
        jatek.pontokJatekosLabel.setText("Pontszám: " + String.valueOf(pontok));
    }
}