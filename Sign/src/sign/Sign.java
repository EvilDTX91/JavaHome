package sign;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Sign extends JFrame{
    public Sign(){
        super("Use of Compressed Air Prohibited");
        setSize(410, 435);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SignPanel sp = new SignPanel();
        add(sp);
        setVisible(true);
    }
    public static void main(String[] args) {
        Sign sign = new Sign();
    }
    
}
class SignPanel extends JPanel {
    public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(Color.white);
        comp.fillRect(0, 0, 400, 400);
        
        //a jel megrajzolása
        comp2D.setColor(Color.red);
        Ellipse2D.Float sign1= new Ellipse2D.Float(0F, 0F, 400F, 400F);
        comp2D.fill(sign1);
        comp2D.setColor(Color.white);
        Ellipse2D.Float sign2 = new Ellipse2D.Float(55F, 55F, 290F, 290F);
        comp2D.fill(sign2);
        
        //az emberke megrajzolása
        comp2D.setColor(Color.black);
        Ellipse2D.Float head = new Ellipse2D.Float(160F, 96F, 32F, 32F);
        comp2D.fill (head);
        GeneralPath body = new GeneralPath();
        body.moveTo(159F, 162F);
        body.lineTo(119F, 303F);
        body.lineTo(139F, 303F);
        body.lineTo(168F, 231F);
        body.lineTo(190F, 303F);
        body.lineTo(213F, 303F);
        body.lineTo(189F, 205F);
        body.lineTo(203F, 162F);
        body.lineTo(247F, 151F);
        body.lineTo(236F, 115F);
        body.lineTo(222F, 118F);
        body.lineTo(231F, 140F);
        body.lineTo(141F, 140F);
        body.lineTo(101F, 190F);
        body.lineTo(112F, 197F);
        body.lineTo(144F, 162F);
        body.closePath();
        comp2D.fill(body);
        
        //a palack megrajzolása
        comp2D.setColor(Color.black);
        comp2D.fillRect(251, 191, 33, 118);
        comp2D.fillRect(262, 160, 13, 31);
        GeneralPath nozzle = new GeneralPath();
        nozzle.moveTo(252F, 176F);
        nozzle.lineTo(262F, 160F);
        nozzle.lineTo(262F, 176F);
        nozzle.closePath();
        comp2D.fill(nozzle);
        
        //vonalak rajzolása
        comp2D.setColor(Color.black);
        BasicStroke pen = new BasicStroke(2F);
        comp2D.setStroke(pen);
        Line2D.Float ln1 = new Line2D.Float(203F, 121F, 255F, 102F);
        comp2D.draw(ln1);
        Line2D.Float ln2 = new Line2D.Float(255F, 102F, 272F, 116F);
        comp2D.draw(ln2);
        Line2D.Float ln3 = new Line2D.Float(272F, 134F, 252F, 158F);
        comp2D.draw(ln3);
        
        //a piktogram befejezése
        comp2D.setColor(Color.red);
        GeneralPath sign3 = new GeneralPath();
        sign3.moveTo(110F, 78F);
        sign3.lineTo(321F, 289F);
        sign3.lineTo(290F, 317F);
        sign3.lineTo(81F, 107F);
        sign3.closePath();
        comp2D.fill(sign3);
    }
}
