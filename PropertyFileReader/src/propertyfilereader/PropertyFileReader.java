package propertyfilereader;
import java.io.*;
import nu.xom.*;
public class PropertyFileReader {
    String comment;
    String username;
    String password;
    String visits;
    String browser;
    boolean showEmail;
    
    public PropertyFileReader() throws ParsingException, IOException{
        //megnyitjuk az XML dukumentumot
        File propFile = new File("properties.xml");
        Builder builder = new Builder();
        Document doc = builder.build(propFile);
        //lekérdezzük a <properties> gyökérelemet
        Element root = doc.getRootElement();
        // bekérjük a <comment> elemet és egy változóban tároljuk
        Element commentElement = root.getFirstChildElement("comment");
        comment = commentElement.getValue();
        //beolvassuk az <entry> elemeket
        Elements entries = root.getChildElements("entry");
        for(int current = 0; current < entries.size(); current++){
            //beolvassuk az aktuális <entry> tartalmát
            Element entry = entries.get(current);
            //beolvassuk az elem key jellemzőjét
            Attribute key = entry.getAttribute("key");
            String keyValue = key.getValue();
            //a jellemző értéket a megfelelő változóba helyezzük
            if(keyValue.equals("username")){
                username = entry.getValue();
            }
            if(keyValue.equals("password")){
                password = entry.getValue();
            }
            if(keyValue.equals("visits")){
                visits = entry.getValue();
            }
            if(keyValue.equals("browser")){
                browser = entry.getValue();
            }
            if(keyValue.equals("showEmail")){
                String emailValue = entry.getValue();
                if(emailValue.equals("yes")){
                    showEmail = true;
                } else {
                    showEmail = false;
                }
            }
        }
    }
    
    public void showProperties(){
        System.out.println("\nProperties\n");
        System.out.println("Comment: " + comment);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Visits: " + visits);
        System.out.println("Browser: " + browser);
        System.out.println("Show Email: " + showEmail);
    }
    
    public static void main(String[] args) {
        try{
            PropertyFileReader reader = new PropertyFileReader();
            reader.showProperties();
        } catch (Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }
    }
    
}