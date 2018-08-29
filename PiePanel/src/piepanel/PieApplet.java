//package piepanel;

import java.awt.*;
import javax.swing.*;

public class PieApplet extends JApplet {
    Color uneasyBeingGreen = new Color (0xCC, 0xCC, 0x99);
    Color zuzusPetals = new Color (0xCC, 0x66, 0xFF);
    Color zootSuit = new Color (0x66, 0x66, 0x99);
    Color sweetHomeAvocado = new Color (0x66, 0x99, 0x66);
    Color shrinkingViolet = new Color (0x66, 0x66, 0x99);
    Color maiamNice = new Color (0x33, 0xFF, 0xFF);
    Color inBetweenGreen = new Color (0x00, 0x99, 0x66);
    Color norwegianBlue = new Color (0x33, 0xCC, 0xCC);
    Color purpleRain = new Color (0x66, 0x33, 0x99);
    Color Freckle = new Color (0x99, 0x66, 0x33);
    
    public void init(){
        PiePanel pie = new PiePanel(10);
        pie.addSlice(uneasyBeingGreen, 1306);
        pie.addSlice(zuzusPetals, 1080);
        pie.addSlice(zootSuit, 296);
        pie.addSlice(sweetHomeAvocado, 242);
        pie.addSlice(shrinkingViolet, 186);
        pie.addSlice(maiamNice, 162);
        pie.addSlice(inBetweenGreen, 144);
        pie.addSlice(norwegianBlue, 143);
        pie.addSlice(purpleRain, 129);
        pie.addSlice(Freckle, 127);
        add(pie);
    }
}