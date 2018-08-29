package lottomadness;
public class Sleep {
    static void pause(int duration){
    try{
        Thread.sleep(duration);
    } catch(InterruptedException e){
    //do nothing
        }
    catch (NumberFormatException e){
                System.out.println("Számot kell megadni.");
                //stopPlaying();
        }
    catch (ArithmeticException e) {
                System.out.println("A szám nem lehet nulla.");
                //stopPlaying();
        }
    } 
}
