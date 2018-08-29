package lottomadness;
import java.io.*;
import nu.xom.*;
import org.apache.xmlrpc.webserver.*;

public class LottoServer{
    int port = 4404;
    WebServer server;
    
    public LottoServer() throws IOException, ParsingException{
        //a kiszolgáló létrehozása
        System.out.println("Creating server on port " + port);
        server = new WebServer(port);
        
        //a kéréskezelő bejegyzése
        LottoCounter counter = new LottoCounter();
        server.addHandler("lotto", counter);
    }
    public void start(){
        // a kiszolgáló elindítása
        System.out.println("Now accepting requests");
        server.start();
    }
    
    public static void main(String[] args){
        try{
            LottoServer lotto = new LottoServer();
            lotto.start();
        } catch(Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }
    }
}