package newvirus;
public class NewVirusLook {
    public static void main(String[] args) {
        //int numViruses = Integer.parseInt(arguments[0]);
    int numViruses = Integer.parseInt("100");
    if(numViruses > 0){
        NewVirus[] virii = new NewVirus[numViruses];
        for(int i = 0; i< numViruses; i++){
            virii[i] = new NewVirus();
        }
        System.out.println("There are " + NewVirus.getVirusCount() + " viruses.");
    }
    
    NewVirus crush = new NewVirus();
    System.out.println("A NewVirus newSeconds alap értéke: " + NewVirus.getNewSeconds());
    System.out.println("Első kísérlet az newSeconds érték módosításra(20)...");
    if(crush.setNewSeconds(30) == true)
    {
        System.out.println("A kísérlet sikeres! Az új érték: " + NewVirus.getNewSeconds());
    }
    else
    {
        System.out.println("A kísérlet sikertelen volt!");
    }
    System.out.println("Második kísérlet az newSeconds érték módosításra(60)...");
    if(crush.setNewSeconds(60) == true)
    {
        System.out.println("A kísérlet sikeres! Az új érték: " + NewVirus.getNewSeconds());
    }
    else
    {
        System.out.println("A kísérlet sikertelen volt!");
    }
    System.out.println("Harmadik kísérlet az newSeconds érték módosításra(90)...");
    if(crush.setNewSeconds(90) == true)
    {
        System.out.println("A kísérlet sikeres! Az új érték: " + NewVirus.getNewSeconds());
    }
    else
    {
        System.out.println("A kísérlet sikertelen volt!");
    }
    }
    
}
