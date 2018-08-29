package sign2;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Sign2 extends JFrame{
    public Sign2(){
        super("Use of Compressed Air Prohibited");
        setSize(410, 425);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SignPanel sp = new SignPanel();
        add(sp);
        setVisible(true);
    }
    public static void main(String[] args) {
        Sign2 sign = new Sign2();
    }
    
}
class SignPanel extends JPanel {
    public void paintComponent(Graphics comp) {
        
        //kiszámítja a 'jel' méretét
        float wScale = getSize().width / 400F;
        //lekérdezi az ablak szélesség és osztja 400-al
        //400 az alapszélességének értéke
        //lebegőpontos szám pl. 400/400=1  200/400=0.5
        //akkor a továbbiakban 0.5-tel végez müveleteket
        float hScale = getSize().height / 400F;
        //lekérdezi az ablak magasságát és osztja 400-al
        
        //'jel' megrajzolása
        //super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(Color.white);
        comp.fillRect(0, 0, (int)(400*wScale), (int)(400*hScale));
        //a fehér 'alaplap' meg rajzolása
        //'float'-ból(lebegőpontos) 'int'(egész)
        
        //a jel megrajzolása
        comp2D.setColor(Color.red);
        Ellipse2D.Float sign1= new Ellipse2D.Float(0F, 0F, 400F * wScale, 400F * hScale);
        comp2D.fill(sign1);
        //a piros kör meg rajzolása kezdő és végpont megadásával
        //a kezdő és végpont a kört körülvevő négyzet kezdő és végpontja
        comp2D.setColor(Color.white);
        Ellipse2D.Float sign2 = new Ellipse2D.Float(55F * wScale, 55F * hScale,
            290F * wScale, 290F * hScale);
        comp2D.fill(sign2);
        
        //az emberke megrajzolása
        comp2D.setColor(Color.black);
        Ellipse2D.Float head = new Ellipse2D.Float(160F * wScale, 96F * hScale, 32F * wScale, 32F * wScale);
        comp2D.fill (head);
        GeneralPath body = new GeneralPath();
        body.moveTo(159F * wScale, 162F * hScale);
        body.lineTo(119F * wScale, 303F * hScale);
        body.lineTo(139F * wScale, 303F * hScale);
        body.lineTo(168F * wScale, 231F * hScale);
        body.lineTo(190F * wScale, 303F * hScale);
        body.lineTo(213F * wScale, 303F * hScale);
        body.lineTo(189F * wScale, 205F * hScale);
        body.lineTo(203F * wScale, 162F * hScale);
        body.lineTo(247F * wScale, 151F * hScale);
        body.lineTo(236F * wScale, 115F * hScale);
        body.lineTo(222F * wScale, 118F * hScale);
        body.lineTo(231F * wScale, 140F * hScale);
        body.lineTo(141F * wScale, 140F * hScale);
        body.lineTo(101F * wScale, 190F * hScale);
        body.lineTo(112F * wScale, 197F * hScale);
        body.lineTo(144F * wScale, 162F * hScale);
        body.closePath();
        comp2D.fill(body);
        
        //a palack megrajzolása
        comp2D.setColor(Color.black);
        comp2D.fillRect((int)(251 * wScale), (int)(191 * hScale), (int)(33 * wScale), (int)(118 * hScale));
        comp2D.fillRect((int)(262 * wScale), (int)(160 * hScale), (int)(13 * wScale), (int)(31 * hScale));
        GeneralPath nozzle = new GeneralPath();
        nozzle.moveTo(252F * wScale, 176F * hScale);
        nozzle.lineTo(262F * wScale, 160F * hScale);
        nozzle.lineTo(262F * wScale, 176F * hScale);
        nozzle.closePath();
        comp2D.fill(nozzle);
        
        //vonalak rajzolása
        comp2D.setColor(Color.black);
        BasicStroke pen = new BasicStroke(2F);
        comp2D.setStroke(pen);
        Line2D.Float ln1 = new Line2D.Float(203F * wScale, 121F * hScale, 255F * wScale, 102F * hScale);
        comp2D.draw(ln1);
        Line2D.Float ln2 = new Line2D.Float(255F * wScale, 102F * hScale, 272F * wScale, 116F * hScale);
        comp2D.draw(ln2);
        Line2D.Float ln3 = new Line2D.Float(272F * wScale, 134F * hScale, 252F * wScale, 158F * hScale);
        comp2D.draw(ln3);
        
        //a piktogram befejezése
        comp2D.setColor(Color.red);
        GeneralPath sign3 = new GeneralPath();
        sign3.moveTo(110F * wScale, 78F * hScale);
        sign3.lineTo(321F * wScale, 289F * hScale);
        sign3.lineTo(290F * wScale, 317F * hScale);
        sign3.lineTo(81F * wScale, 107F * hScale);
        sign3.closePath();
        comp2D.fill(sign3);
    }
}
