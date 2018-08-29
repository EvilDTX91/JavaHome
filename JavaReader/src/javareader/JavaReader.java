package javareader;
import java.io.*;
import java.util.*;

public class JavaReader {
    public static void main(String[] args) {
        try{
            File folder = new File(".");
            File[] contents = folder.listFiles();
            for(int i=0;i<contents.length;i++){
                String name = contents[i].getName();
            if(name.indexOf(".java") == -1){
                //System.out.println("Eddig ez jó!(Rossz file) :" + name + " - " + contents[i]);
                continue;
                }
            else{
                System.out.print("Creating file ... ");
            }
            File file = new File(name);
            FileInputStream in = new FileInputStream(file);//'in' létrehozása és adatok beolvasása
            File clean = new File("new " + name);
            FileOutputStream out = new FileOutputStream(clean);//'out' létrehozása adatok későbbi be írása
            boolean eof = false;
            while(!eof){
                int input = in.read();//'in'-ből be olvassuk az adatokat amit meg kap az 'input'
                if(input == -1){
                    eof = true;
                    continue;
                }
            else{
                out.write((char)input);//az 'out'-ba be írjuk az 'input'-ból az adatokat
                System.out.println("Done!: " + clean);
                eof = true;
                }
            }
        in.close();
        out.close();
            }
        }catch(Exception e){
            System.out.println("Error -- " + e.toString());
        }
    }
    
}
