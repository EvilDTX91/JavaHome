package changer;
public class Changer {
    public static void main(String[] args) {
        
        //string adata = Integer.parseInt(args[0]);
        String data = "125";
        System.out.println("Adat:" + data);
        
        float alapadat = Integer.parseInt(data);
        System.out.println("Adat:" + alapadat);
        
        Float modadat = new Float(alapadat);
        System.out.println("Adat:" + modadat);
        
        int vegadat = modadat.intValue();
        System.out.println("Adat:" + vegadat);
    }
    
}
