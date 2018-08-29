package pingreader;
import java.io.*;
import nu.xom.*;
public class PingReader {
    
    public PingReader() throws ParsingException, IOException{
        //XML file megnyitása
        File shortChanges = new File("shortChanges.xml");
        Builder builder = new Builder();// Builder osztály az interneten keresztúl bárhonnan képes XML adatokat be tölteni
        Document doc = builder.build(shortChanges);
        
        //lekérdezzük a <weblogUpdates> gyökérelemet
        Element root = doc.getRootElement();
        
        //bekérjük a <updated> elemet,egy változóba tároljuk, majd kiíratás
        Attribute updated = root.getAttribute("updated");
        String updatedValue = updated.getValue();
        
        //beolvassuk az <weblog> elemeket
        Elements weblog = root.getChildElements("weblog");
        for(int current = 0; current < weblog.size(); current++){
            
            //beolvassuk az aktuális <weblog> tartalmát
            Element log = weblog.get(current);
            
            //a jellemző értéket a megfelelő változóba helyezezzük
            //beolvassuk a 'log' - 'name' attributumát
            Attribute name = log.getAttribute("name");
            String nameValue = name.getValue();
            //beolvassuk a 'log' - 'url' attributumát
            Attribute url = log.getAttribute("url");
            String urlValue = url.getValue();
            //beolvassuk a 'log' - 'when' attributumát
            Attribute when = log.getAttribute("when");
            String whenValue = when.getValue();
            
            //az értékek ki íratása
            System.out.println("\n\nName: " + nameValue + "\nURL: " + urlValue + "\nWhen: " + whenValue);
        }
        
        System.out.println("\nLatest update: " + updatedValue);
        
    }
    public static void main(String[] args) {
        try{
            PingReader reader = new PingReader();
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
    
}
