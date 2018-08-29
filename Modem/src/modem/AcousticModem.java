package modem;
public class AcousticModem extends Modem {
    String method = "Acoustic connection";
    
    public void connect()
    {
        System.out.println("Connecting to the Internet...");
        System.out.println("Using a " + method);
    }
}
