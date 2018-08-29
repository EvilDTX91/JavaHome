import java.awt.*;
public class TextMover extends javax.swing.JApplet{
    
    String szoveg;
    int a;
    int b;
    
    public void init(){
        szoveg="Random!";
        a=(int) Math.floor(Math.random()*200+1);
        System.out.println("X koordináta: " + a);
        b=(int) Math.floor(Math.random()*200+1);
        System.out.println("Y koordináta: " + b);
    }
    
    public void paint(Graphics screen){
        Graphics2D screen2D = (Graphics2D)screen;
        screen.drawString(szoveg, a,b);
    }
    
}
