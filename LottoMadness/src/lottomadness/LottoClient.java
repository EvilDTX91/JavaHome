package lottomadness;
import java.io.*;
import java.net.*;
import java.util.*;
import org.apache.xmlrpc.*;
import org.apache.xmlrpc.client.*;

public class LottoClient{
    XmlRpcClient client;
    String server = "http://localhost";
    int port = 4404;
    
    public LottoClient(){
        try{
            client = new XmlRpcClient(server + ":" +port);
        } catch (MalformedURLException exception){
            System.out.println("Bad URL: " + server + ":" + port);
        }
    }
    
    public void send(int plays, int win3, int win4, int win5, int win6)
        throws IOException, XmlRpcException{
        
        Vector<Integer> params = new Vector<Integer>();
        params.add(plays);
        params.add(win3);
        params.add(win4);
        params.add(win5);
        params.add(win6);
        Boolean result = (Boolean) client.execute("lotto.sendResult", params);
    }
        
        public static void main(String[] args){
            try{
                int plays = Integer.parseInt(args[0]);
                int win3 = Integer.parseInt(args[1]);
                int win4 = Integer.parseInt(args[2]);
                int win5 = Integer.parseInt(args[3]);
                int win6 = Integer.parseInt(args[4]);
                LottoClient lc = new LottoClient();
            } catch (Exception exception){
                System.out.println("Error: " + exception.getMessage());
                exception.printStackTrace();
        }
    }
}