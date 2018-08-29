package wheel;
public class Wheel {
    public static void main(String[] args) {
       String phrase[] = {
       "A STITCH IN TIME SAVES NINE",
       "DON'T EAT YEALLOW SNOW",
       "JUST DO IT",
       "EVERY GOOD BOY DOES FINE",
       "I WANT MY MTV",
       "HOW 'BOUT THEM COWBOYS",
       "PLAY IT AGAIN, SAM",
       "FORSTY THE SNOWMAN",
       "ONE MORE FOR THE ROAD",
       "HOME FIELD ADVANTAGE",
       "VALENTINE'S DAY MASSACRE",
       "GROVER CLEVELAND OHIO",
       "WONDERFUL WORLD OF DISNEY",
       "COAL MINER'S DAUGHTER",
       "WILL IT PLAY IN PEORIA"
       };
       int[] letterCount = new int[26]; // az egyess betűk előfordulási számának tárolásra
       for (int count=0;count<phrase.length;count++)// annyiszor fut le ahány eleme van a tömbnek
       {
           String current = phrase[count];//szöveg változó ebben tároljuk phrase tömb aktuális elemét
           char[] letters = current.toCharArray();//karakter tömb ebben tároljuk az adott kifejezésben lévő karakterket
           for (int count2=0;count2<letters.length;count2++)//annyiszor fut le ahány karakter van az aktuális kifejezésben
           {
               char lett = letters[count2];//karakter típusú változó az adott betű értékével
               // a karakterek a szöveges értékükön kívűl számértékkel is rendelkeznek
               // a karakterek számértékét fogjuk használni a sorszám meghatározáshoz
               if((lett>='A') & (lett<='Z')) //ki szűrjük azokat a karaktereket amik nem tagjai az ábécének
               {
                   letterCount[lett - 'A']++;
                   //pl. ha lett meg kapja az 'A' betüt az 'if'-nek meg felel és meg kapja a letterCount tömb
                   //mivel az 'int' ezért az értékét kapja meg ami 'A' esetén 65 de ilyen sorszám abban a tömben nincs
                   //ezért ki kell vonni belöle az 'A' karaktert értékét ami így '0' lesz
                   //ezután letterCount 0 elem 1-el fog növekedni
                   //tömb eleme 1-gyel nő, a lett változóban található karakter értékét függően
                   //a tömb sorszáma 0-25-ig terjed
                   //a sorszám meghatározáshoz ki kell vonni az 'A' értéket lett válotozó értékből
               }
           }
       }
       for (char count = 'A'; count <='Z'; count++)//véig megy az ábécé betűin
       {
           System.out.print(count + ": " + letterCount[count - 'A'] + "\t");
           // program kiírja az aktuális beűt és hogy hányszor fordult elő a phrase tömben
           //a count értéke az pl 'A' az az 65 de a letterCount tömb 0-25-ig van
           //ezért count(A)-'A' - 65-65 lesz ami 0 és így a letterCount tömb már tudja értelmezni
           //hiszen abban a 0.ik elem az a szövegben lévő 'A' betűk száma
       }
       System.out.println();
    }
    
}
