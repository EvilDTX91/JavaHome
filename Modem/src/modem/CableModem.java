package modem;
public class CableModem extends Modem {
    //ez a 'Modem' osztály alosztálya, hozzá fér a Modem osztályhoz
    String method = "Cable connection";
    
    public void connect()
    {
        System.out.println("Connecting to the Internet ...");
        System.out.println("Using a " + method);
    }
}
