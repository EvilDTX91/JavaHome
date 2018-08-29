//package bouncepanel2;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class BouncePanel2 extends JPanel implements Runnable {
    Image ball, court;
    float current = 0F;
    Thread runner;
    int xPosition = 10;
    int xMove = 1;
    int yPosition = -1;
    int ballHeight = 185;
    int ballWidth = 190;
    int height;
    int delay = 100;
    
    public BouncePanel2(){
        super();
        Toolkit kit = Toolkit.getDefaultToolkit();
        ball = kit.getImage("tennis.gif");
        court = kit.getImage("court.jpg");
        runner = new Thread(this);
        runner.start();
    }
    
    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        height = getSize().height - ballHeight;
        if(yPosition == -1){
            yPosition = height - 20;
        }
        if((court != null) && (ball != null)){
            comp2D.drawImage(court, 0, 0, this);
            comp2D.drawImage(ball, (int)xPosition,(int)yPosition, this);
        }
    }
    
    public void run(){
        Thread thisThread = Thread.currentThread();
        while (runner == thisThread) {
            current += (float) 0.1;
            if(current>3){
                current = (float) 0;
            }
            xPosition += xMove;
            if(xPosition > (getSize().width - ballWidth)){
                xMove *= -1;
            }
            if(xPosition < 1){
                xMove *= -1;
            }
            double bounce = Math.sin(current) * height;
            yPosition = (int) (height - bounce);
            repaint();
            try{
                Thread.sleep(delay);
            }catch (InterruptedException e){
                //nem csinálunk semmit
            }
        }
    }    
    
    public void setDelay(int delay){
        if((delay > 0) & (delay <=200)){
            this.delay = delay;
        }
    }
}