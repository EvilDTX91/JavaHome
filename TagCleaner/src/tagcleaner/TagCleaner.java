package tagcleaner;
import java.io.*;
import java.util.*;

public class TagCleaner {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Usage: java TagCleaner filename");
            System.exit(-1);
        }
        TagCleaner cleaner = new TagCleaner(args[0]);
    }
    
    public TagCleaner(String filename){
        try{
            //beállítások betöltése
            File propFile = new File("TagCleaner.properties");
            FileInputStream propStream = new FileInputStream(propFile);
            Properties props = new Properties();
            props.load(propStream);
            String caseProperty = props.getProperty("case");
            String hideOutput = props.getProperty("hideOutput");
            //a fájlbemenet és kimenet beállítása
            File file = new File(filename);
            FileInputStream in = new FileInputStream(file);
            File clean = new File(filename + " .clean");
            FileOutputStream out = new FileOutputStream(clean);
            boolean eof = false;
            boolean inTag = false;
            boolean inQuote = false;
            if(hideOutput.equals("false")){
                System.out.print("Creating file ... ");
            }
            while(!eof){
                int input = in.read();
                if(input == -1){
                    eof = true;
                    continue;
                }
            //idézőjelek keresése
            if(input == '"'){
                if(inQuote != true){
                    inQuote = true;
                }else {
                    inQuote = false;
                }
            }
            //nyitócímke keresése
            if(input == '<'){
                inTag = true;
            }
            //zárócímke keresése
            if(input == '>'){
                inTag = false;
                inQuote = false;
            }
            if((!inTag) | (inQuote)){
                out.write((char)input);
            }else{
                if(caseProperty.equals("lower")){
                    out.write(Character.toLowerCase((char)input));
                }else{
                    out.write(Character.toUpperCase((char)input));
                }
            }
            }
        in.close();
        out.close();
        if(hideOutput.equals("false")){
            System.out.println("Done!");
        }
    }catch(Exception e){
    System.out.println("error\n\n" + e.toString());
    }
}
}
