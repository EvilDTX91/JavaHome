package palidromnumber;

public class PalidromNumber {
    
    public String palidromCheck(String number)
    {
        int length = number.length()-1;
        String newNumber = "";
        
        for(int i = length; i >= 0; i--)
        {
            newNumber+=number.charAt(i);
        }
        
        if(newNumber.equals(number))
        {
            System.out.println(newNumber + "\nIt's a Palidrom number!");
            return newNumber;
        }
        else
        {
            System.out.println(newNumber + "\nIt isn't a Palidrom number!");
            return newNumber;
        }
    }
    
    public static void main(String[] args) {
        
        PalidromNumber pNumb = new PalidromNumber();
        TextScanner text = new TextScanner();
        
        pNumb.palidromCheck(text.callScanString());
    }
    
}
