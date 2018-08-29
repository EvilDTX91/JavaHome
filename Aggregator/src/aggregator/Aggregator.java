package aggregator;
import java.io.*;
import nu.xom.*;
public class Aggregator {
    public String[] title = new String[15];
    public String[] link = new String[15];
    public int count = 0;
    
    public Aggregator(String rssUrl){
        try{
            //az XML dokumentum beolvasása
            Builder builder = new Builder();
            Document doc = builder.build(rssUrl);
            //a dokumentum gyökérelemének beolvasása
            Element root = doc.getRootElement();
            //a gyökér channel (csatorna) elemének beolvasása
            Element channel = root.getFirstChildElement("channel");
            //item (elem) elemek beolvasása a channel elem alól
            if(channel != null) {
                Elements items = channel.getChildElements("item");
                for(int current = 0;current<items.size();current++){
                    if(count>15){
                        break;
                    }
                    //az aktuális elem beolvasása
                    Element item = items.get(current);
                    Element titleElement = item.getFirstChildElement("title");
                    Element linkElement = item.getFirstChildElement("link");
                    title[current] = titleElement.getValue();
                    link[current] = linkElement.getValue();
                    count++;
                }
            }
        } catch (ParsingException exception) {
            System.out.println("XML error: " + exception.getMessage());
        } catch (IOException ioException) {
            System.out.println("IO error: " + ioException.getMessage());
            ioException.printStackTrace();
        }
    }
    public void listItems(){
        for(int i=0; i<15;i++){
            if(title[i] != null){
                System.out.println("\n" + title[i]);
                System.out.println(link[i]);
                i++;
            }
        }
    }
    public static void main(String[] args) {
        if(args.length>0){
            Aggregator aggie = new Aggregator(args[0]);
            aggie.listItems();
        } else{
            System.out.println("Usage: java Aggregator rssUrl");
        }
    }
    
}
