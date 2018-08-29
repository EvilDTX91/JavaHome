//package piepanel2;

import java.awt.*;
import javax.swing.*;

public class PieApplet2 extends JApplet {
    
    public void init(){
            
    Container pane = getContentPane();
    int topSlice = 1;
    while(getParameter("color" + topSlice) != null){
        topSlice++;
    }
    PiePanel2 pie = new PiePanel2(topSlice);
    boolean noMoreSlice = false;
    int currentSlice = 0;
    while((!noMoreSlice) & (currentSlice < topSlice)){
    String paramValue = getParameter("color" + currentSlice);
    if(paramValue == null){
        noMoreSlice = true;
        continue;
    }
    String redValue = paramValue.substring(0,2);
    int red = Integer.parseInt(redValue, 16);
    String greenValue = paramValue.substring(2, 4);
    int green = Integer.parseInt(greenValue, 16);
    String blueValue = paramValue.substring(4, 6);
    int blue = Integer.parseInt(blueValue, 16);
    Color sliceColor = new Color(red, green, blue);
    //get value
    String sliceValue = getParameter("slice" + currentSlice);
    int slice = Integer.parseInt(sliceValue);
    //add slice
    pie.addSlice(sliceColor, slice);
    currentSlice++;
        }
    pane.add(pie);
    setContentPane(pane);
    }
}