package lottomadness;
import javax.swing.*;
import java.awt.event.*;
/*Nincsenek változók, amelyek nyomon követnék az eseményeket, úgy mint a sorsolások
eredményeit, a találatok számát és a megjelölt számokat. A felhasználói felület ezen részének
megvalósítása különbözik más programtípusokétól, ahol a felhasználó felületet értékek tárolására
és azok automatikus megjelenítésére is használhatjuk.*/
public class LottoEvent implements ItemListener, ActionListener, Runnable{
    
    LottoMadness gui; //gui ami LottoMadness objektuma
    /*A gui változót a program grafikus felületét tartalmazó LottoMadness objektummal
    való kommunikációra használjuk. A gui objektum példányát használjuk ha meg akarjuk változtani
    a felületet, vagy egy értéket vissza akarunk keresni a szövegmezőből.*/
    Thread playing;// folyamatos lottósorolást intéző szál (Thread objektum)
    
    LottoClient client;
    
    public LottoEvent(LottoMadness in){
        gui = in;
        client = new LottoClient();
    }
    
    public void actionPerformed(ActionEvent event){
        /*észleli az akcióeseményt, amikor a játékos megnyomja valamely gombot.
        A getActionCommand() tagfüggvény visszakerei az éppen megnyomott gomb címkéjét,
        hogy meghatározza, melyik komponenst használtuk.*/
        String command = event.getActionCommand();
        if(command == "Play"){
            startPlaying();
        }
        if(command == "Stop"){
            stopPlaying();
        }
        if(command == "Reset"){
            clearAllFields();
        }
    }
    
    void startPlaying(){
        //le tiltja a többi komponenst nehogy beleavatkozzanak a sorolásba
        //System.out.println("Playing...");
        playing = new Thread(this);
        playing.start();
        gui.play.setEnabled(false);
        gui.stop.setEnabled(true);
        gui.reset.setEnabled(false);
        gui.quickpick.setEnabled(false);
        gui.personal.setEnabled(false);
        //gui.speed.setEnabled(false); //házi
        
    }
    void stopPlaying(){
        //a Stop gomb kivételével az összes komponens használatát engedélyezi
        //System.out.println("Stopping...");
        gui.stop.setEnabled(false);
        gui.play.setEnabled(true);
        gui.reset.setEnabled(true);
        gui.quickpick.setEnabled(true);
        gui.personal.setEnabled(true);
        //gui.speed.setEnabled(true); //házi
        playing = null;
        sendResults();
    }
    
    void clearAllFields() {
        //System.out.println("Reseting...");
        //törli az alkalmazás szövegmezőinek tartalmát
        //for(int i=0;i<6;i++){
        for(int i=0;i<5;i++){ // házi
            gui.numbers[i].setText(null);
            gui.winners[i].setText(null);
        }
        gui.got3.setText("0");
        gui.got4.setText("0");
        gui.got5.setText("0");
        gui.got6.setText("0");
        //gui.speed.setText("100");//házi
        gui.drawings.setText("0");
        gui.years.setText("0");
        gui.quickpick.setSelected(false);
        gui.personal.setSelected(true);
    }
    
    public void itemStateChanged(ItemEvent event){
        /*A jelölő négyzetek bejelölésével előidézett felhasználó eseményt észleli.
        A getItem() tagfüggvény visszatérési értéke egy objektum, azé az elemé amelyiket
        bejelöltük, illetve amelyikből töröltük a jelet. Quick Pick esetén
        1 és 50 közötti váletlen számot állít elő a játékos helyett.*/
        //System.out.println("Quik picking...");
        Object item = event.getItem();
        if(item == gui.quickpick){
            //for(int i = 0;i < 6; i++){
            for(int i = 0;i < 5; i++){ //házi
                int pick;
                do {
                    //pick = (int) Math.floor(Math.random()*50+1);
                    pick = (int) Math.floor(Math.random()*90+1); //házi
                }
                while (numberGone(pick, gui.numbers, i));
                gui.numbers[i].setText("" + pick);
            }
        }
        else {
            //for (int i=0;i<6;i++){
              for (int i=0;i<5;i++){ //házi
                gui.numbers[i].setText(null);
            }
        }
    }
    
    void addOneToField(JTextField field){
        /*átalakítja a szövegmező tartalmá egész számmá, azt eggyel növeli,
        majd visszaalakítja a szövegmező tartalmává.
        Ezek a lépések szükségesek a szövegmezők számként való kezelésénél,
        mivel azok tartalma karakterláncként tárolódik.*/
        int num;
        try{
        num = Integer.parseInt("0" + field.getText());
        num++;
        field.setText("" + num);
        }
        catch (NumberFormatException e){
                System.out.println("Számot kell megadni.");
            }
        catch (ArithmeticException e) {
                System.out.println("A szám nem lehet nulla.");
        }
    }
    
    boolean numberGone(int num, JTextField[] pastNums, int count){
        /*Három argumentumot igényel, egy kihúzott lottószámot,egy JTextField objektumokat
        tartalmazó tömböt, és a count nevű egész változót. Ez a tagfüggvény biztosítja, hogy
        ne legyen két egyforma szám kihúzva ugyanabban a sorsolában.*/
        for(int i=0; i<count; i++){
            try{
            if(Integer.parseInt(pastNums[i].getText()) == num){
                return true;
            }
            }
            catch (NumberFormatException e){
                System.out.println("Számot kell megadni.");
            }
            catch (ArithmeticException e) {
                System.out.println("A szám nem lehet nulla.");
            }
        }
        return false;
    }
    
    boolean matchedOne(JTextField win, JTextField[] allPicks){
        /*két argumentum, egy JTextField objektumot és egy hatelemű JTextField objektumot
        tartalmazó tömböt. Ez a tagfüggvény állapítja meg, hoyg a játékosnak van-e találata.*/
        //for (int i=0; i<6; i++){
        for (int i=0; i<5; i++){ // házi    
            String winText = win.getText();
            if(winText.equals(allPicks[i].getText())){
                return true;
            }
        }
        return false;
    }
    
    public void run(){
        Thread thisThread = Thread.currentThread();
        while(playing == thisThread){
            addOneToField(gui.drawings);
            int draw;
            try{
            draw = Integer.parseInt(gui.drawings.getText());
            float numYears = (float)draw / 104;
            gui.years.setText("" + numYears);
            }
            catch (NumberFormatException e){
                System.out.println("Számot kell megadni.");
            }
            catch (ArithmeticException e) {
                System.out.println("A szám nem lehet nulla.");
            }
            
            int matches = 0;
            //for(int i=0;i<6;i++){
            for(int i=0;i<5;i++){ // házi
                int ball;
                do{
                    ball=(int)Math.floor(Math.random()*90+1); //házi
                    //ball=(int)Math.floor(Math.random()*50+1);
                    /*1 és 50 közötti számokat sorsol ki
                    A Math.random() függvényt kimenetét megszorozzuk 50-nel.
                    az eredményhez hozzáadunk 1-et. Majd az egészet átadjuk
                    argumentumként a Math.floor() függvénynek.
                    Az eredmény egy véletlenszerűen előállított szám 1 és 50 között.
                    Az 50 helyett más számot is írhatunk, kevesebb vagy több számmal
                    dolgozó lottosorsolás modellezéséhez.*/
                }
                while(numberGone(ball, gui.winners, i));
                gui.winners[i].setText("" + ball);
                if(matchedOne(gui.winners[i], gui.numbers)){
                    matches++;
                }
            }
            switch (matches){
                case 3:
                    addOneToField(gui.got3);
                    break;
                case 4:
                    addOneToField(gui.got4);
                    break;
                case 5:
                    addOneToField(gui.got5);
                    break;
                case 6:
                    addOneToField(gui.got6);                    
                    gui.stop.setEnabled(false);
                    gui.play.setEnabled(true);
                    playing = null;
            }
            //Sleep.pause(Integer.parseInt(gui.speed.getText()));
            int x;
            try{
                //Thread.sleep(100);
                //addOneToField(gui.speed);
                //x = Integer.parseInt(gui.speed.getText()); //házi
                x = gui.speedSlider.getValue();
                Thread.sleep(x); //házi
                //System.out.println("Sebesség: "+ x); //házi
            }
            catch(InterruptedException e){
                //semmit nem csinálunk
            }
            catch (NumberFormatException e){
                System.out.println("Számot kell megadni.");
                stopPlaying();
            }
            catch (ArithmeticException e) {
                System.out.println("A szám nem lehet nulla");
                stopPlaying();
            }
        }
    }
    
    private void sendResults(){
        try{
            int drawings = Integer.parseInt(gui.drawings.getText());
            int got3 = Integer.parseInt(gui.got3.getText());
            int got4 = Integer.parseInt(gui.got4.getText());
            int got5 = Integer.parseInt(gui.got5.getText());
            int got6 = Integer.parseInt(gui.got6.getText());
        } catch(NumberFormatException nfe){
            //nem csinálunk semmit
        }catch(Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
