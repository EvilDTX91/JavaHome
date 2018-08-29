package armstrongnumber;

import java.util.*;

public class TextScanner {
    
    private String text;
    
    public String setText(String text)
    {
        return this.text=text;
    }
    
    public String getText()
    {
        return this.text;
    }
    
    private String scanString(){
        
        String input = null;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Kérlek adj meg egy számot: ");
        input = inputReader.nextLine();
        
        return setText(input);
    }

    public String callScanString()
    {
        return scanString();
    }
}
