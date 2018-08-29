package modem;
public class TestModems {
    public static void main(String[] args) {
        CableModem roadRunner = new CableModem();//objektum létrehozása
        DslModem bellSouth = new DslModem();//objektum létrehozása
        AcousticModem slow = new AcousticModem();
        roadRunner.speed = 500000;//objektum értékadása
        bellSouth.speed = 400000;//objektum értékadása
        slow.speed = 300;
        roadRunner.name=roadRunner.method;
        bellSouth.name=bellSouth.method;
        slow.name=slow.method;
        System.out.println("Trying the cable modem:");
        roadRunner.displaySpeed();//meghívjuk a displayMethod tagfüggvényét a roadRunner objektumnak
        //ezt a 'Modem' osztályból örököltük
        roadRunner.connect();//meghívjuk a readRunner objektum connet() tagfüggvényét
        roadRunner.disconnect();
        System.out.println("Trying the DSL modem:");
        bellSouth.displaySpeed();
        bellSouth.connect();
        bellSouth.disconnect();
        System.out.println("Trying the Acoustic modem:");
        slow.displaySpeed();
        slow.connect();
        slow.disconnect();
    }
    
}
