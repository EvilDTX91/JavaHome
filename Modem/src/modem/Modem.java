package modem;
public class Modem {
    //Modem osztály létrehozása amely a sebesség kiírására képes (Szuperosztály)
    int speed;
    String name;
    public void displaySpeed()
    {
        System.out.println("Speed: " + speed);
    }
    public void disconnect()
    {
        System.out.println(name + " is disconnecting...");
    }
}
