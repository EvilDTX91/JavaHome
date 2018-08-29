package factorialnumber;

public class FactorialNumber {
    
    public int factorialCalculat(int number)
    {
        int x = 1;
        for(int i = 1; i<=number; i++)
        {
            x=x*i;
        }
        System.out.println("Factorial of the number: " + x);
        return x;
    }
    public static void main(String[] args) {
        
        FactorialNumber factorialNumb = new FactorialNumber();
        TextScanner scannNumb = new TextScanner();
        
        factorialNumb.factorialCalculat(Integer.parseInt(scannNumb.callScanString()));
    }
    
}
