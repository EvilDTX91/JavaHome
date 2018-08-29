package lottomadness;
import java.io.*;
import java.util.*;
import nu.xom.*;

public class LottoCounter{
    Document document;
    Element root;
    File logFile;
    
    public LottoCounter() throws IOException, ParsingException{
        Builder builder = new Builder();
        logFile = new File("lotto.log");
        if(!logFile.exists()){
            // új XML dokumentum létrehozása
            root = new Element("log");
            document = new Document(root);
            writeDocument();
        }
        //az XML dokumentum betöltése egy fájlból
        document = builder.build(logFile);
        root = document.getRootElement();
    }
    
    public boolean sendResult(int plays, int win3, int win4, int win5, int win6) throws IOException, ParsingException{
        
        //az eredmény elemének létrehozása
        Element result = new Element("result");
        
        //részelemek létrehozása minden értékhez
        Element playElement = new Element("plays");
        playElement.appendChild(""+plays);
        Element win3Element = new Element("win3");
        win3Element.appendChild(""+win3);
        Element win4Element = new Element("win4");
        win4Element.appendChild(""+win4);
        Element win5Element = new Element("win5");
        win5Element.appendChild(""+win5);
        Element win6Element = new Element("win6");
        win6Element.appendChild(""+win6);
        Element dateElement = new Element("date");
        Date now = new Date();
        dateElement.appendChild(now.toString());
        
        // a részelemek hozzáadása az eredményhez
        result.appendChild(playElement);
        result.appendChild(win3Element);
        result.appendChild(win4Element);
        result.appendChild(win5Element);
        result.appendChild(win6Element);
        result.appendChild(dateElement);
        
        // az eredmény hozzáadása a gyökérhez
        root.appendChild(result);
        
        //a dokumentum mentése
        writeDocument();
        return true;
    }
    
    // a dokumentum fáljba írása
    private void writeDocument() throws IOException {
        FileOutputStream fileStream = new FileOutputStream(logFile);
        Serializer writer = new Serializer(fileStream);
        writer.setIndent(2);
        writer.write(document);
    }
//tesztelés
    /*
public static void main(String[] args){
    try{
        int plays = Integer.parseInt(args[0]);
        int win3 = Integer.parseInt(args[1]);
        int win4 = Integer.parseInt(args[2]);
        int win5 = Integer.parseInt(args[3]);
        int win6 = Integer.parseInt(args[4]);
        LottoCounter counter = new LottoCounter();
        counter.send(plays, win3, win4, win5, win6);
    } catch (Exception exception){
        System.out.println("Error: " + exception.getMessage());
        exception.printStackTrace();
    }
}*/
}