package modem;
public class DslModem extends Modem {
    //ez a 'Modem' osztály alosztálya, hozzá fér a Modem osztályhoz
    String method = "DSL phone connection";
    
    public void connect()
    {
        System.out.println("Connecting to the Internet ...");
        System.out.println("Using a " + method);
    }
    
}
