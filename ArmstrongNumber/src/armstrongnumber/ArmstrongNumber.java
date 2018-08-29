package armstrongnumber;

public class ArmstrongNumber {
    
    public void ArmstrongCheck(String number)
    {
        String a = "";
        int b  = 0;
        int c = 0;
        int newNumber = 0;
        
        int length = number.length()-1;
        for(int i = 0; i<=length; i++)
        {
            a += number.charAt(i);
            b=Integer.parseInt(a);
            c = b;
            System.out.print(c + ",");
            for(int j = 1; j<=length; j++)
            //azért kell csak kétszer futnia mert meg kapja a 'c' alapértéknek a számot
            {
                c = c*b;
                System.out.print(c + ",");
            }
            newNumber += c;
            a="";
            b=0;
            c=0;
        }
        
        if(newNumber == (Integer.parseInt(number)))
        {
        System.out.println("\n" + newNumber);
        System.out.println("It's a Armstrong number!");
        }
        else
        {
        System.out.println("\n" + newNumber);
        System.out.println("It isn't a Armstrong number!");
        }
    }

    public static void main(String[] args) {
        
        ArmstrongNumber armstrongNumb = new ArmstrongNumber();
        TextScanner scanText = new TextScanner();
        
        armstrongNumb.ArmstrongCheck(scanText.callScanString());
        
        
        //alternativ megoldás köttött nagyon
        int c=0,a,temp;
        int n=153;//It is the number to check armstrong  
        temp=n;  
        while(n>0)  
            {  
                a=n%10;  //az utolsó számjegy értéket kapja meg
                n=n/10;  
                c=c+(a*a*a);
                System.out.println(a + " , " + n + " , " + c);
            } 
        if(temp==c)
        {
            System.out.println("armstrong number");
        }
        else  
            System.out.println("Not armstrong number");   
    }
}
