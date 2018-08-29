package propertyfilecreator;
import java.io.*;
import java.util.*;
public class PropertyFileCreator {
    public PropertyFileCreator(){
        Properties prop = new Properties();
        prop.setProperty("username", "rcade");
        prop.setProperty("password", "12345");
        prop.setProperty("visits", "50");
        prop.setProperty("browser", "Mozilla Firefox");
        prop.setProperty("showEmail", "no");
        try{
            File propFile = new File("properties.xml");
            FileOutputStream propStream = new FileOutputStream(propFile);
            Date now = new Date();
            prop.storeToXML(propStream, "Created on " + now);
        }catch(IOException exception){
            System.out.println("Error: " + exception.getMessage());
        }
    }
    public static void main(String[] args) {
        PropertyFileCreator pfc = new PropertyFileCreator();
    }
    
}
