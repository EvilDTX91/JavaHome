package homepage;
import java.net.*;
//weboldalak adatait képes tárolni oldal címe oldal URL-jét, az oldal tulaj nevét és oldal tartalom rövid leírása
public class HomePage {
    String owner;
    URL address;
    String category = "none";
    
    public HomePage(String inOwner, String inAddress)
        throws MalformedURLException{
        //kivételkezelés itt figyelmenkívül hagyja a kivételt
        owner = inOwner;
        address = new URL(inAddress);
    }
   
        
    public HomePage(String inOwner, String inAddress, String inCategory)
        throws MalformedURLException {
        
            this(inOwner, inAddress);
            category = inCategory;
        }
    }
