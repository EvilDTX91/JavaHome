import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class Revolve extends JApplet implements Runnable, ActionListener{
    
    String[] pageTitle = new String[6];
    URL[] pageLink = new URL[6];
    Color butterscotch = new Color(255,204,158);
    int current = 0;
    Thread runner;
    
    public void init(){
        pageTitle[0] = "Sun's Java site";
        pageLink[0] = getURL("http://java.sun.com");
        pageTitle[1] = "Cafe au Lait";
        pageLink[1] = getURL("http:/www.ibiblio.org/javafaq");
        pageTitle[2] = "JavaWorld";
        pageLink[2] = getURL("http://www.javaworld.com");
        pageTitle[3] = "Java 2 in 24 Hours";
        pageLink[3] = getURL("http://www.java24hours.com");
        pageTitle[4] = "Sams Publishing";
        pageLink[4] = getURL("http://www.samspublishing.com");
        pageTitle[5] = "Workbench";
        pageLink[5] = getURL("http://www.cadenhead.org/workbench");
        Button goButton = new Button("Go");
        goButton.addActionListener(this);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(goButton);
    }
    
    URL getURL(String urlText){
        URL pageURL = null;
        try{
            pageURL = new URL(getDocumentBase(), urlText);
        }catch (MalformedURLException m){}
        return pageURL;
    }
    
    public void paint(Graphics screen){
        Graphics2D screen2D = (Graphics2D) screen;
        screen2D.setColor(butterscotch);
        screen2D.fillRect(0, 0, getSize().width, getSize().height);
        screen2D.setColor(Color.black);
        screen2D.drawString(pageTitle[current], 5, 60);
        screen2D.drawString("" + pageLink[current], 5, 80);
    }
    
    public void start() {
        if(runner == null){
            runner = new Thread(this);
            runner.start();
        }
    }
    
    public void run(){
        Thread thisThread = Thread.currentThread();
        while(runner == thisThread){
            current++;
            if(current > 5){
                current = 0;
            }
            repaint();
            try{
                Thread.sleep(10000);
            }catch (InterruptedException e) {
                // nem csinál semmit
            }
        }
    }
    
    public void stop(){
        if (runner != null){
            runner = null;
        }
    }
    
    public void actionPerformed(ActionEvent evt) {
        if(runner != null){
            runner = null;
        }
        
        AppletContext browser = getAppletContext();
        if(pageLink[current] != null){
            browser.showDocument(pageLink[current]);
        }
    }
}
