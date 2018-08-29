package virus;
public class VirusLook {
    public static void main(String[] arguments){
    //int numViruses = Integer.parseInt(arguments[0]);
    int numViruses = Integer.parseInt("100");
    if(numViruses > 0){
        Virus[] virii = new Virus[numViruses];
        for(int i = 0; i< numViruses; i++){
            virii[i] = new Virus();
        }
        System.out.println("There are " + Virus.getVirusCount() + " viruses.");
    }
    }
    
}
