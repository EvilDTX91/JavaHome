package gyakoszt;
public class GyakOszt {
    public static void main(String[] args) {
    // szám 1-100 között
    int grade = 80;
    char lettergrade;
    
    //simán If-el
    /*
    if (grade >= 89)
    {
        System.out.println("'A' osztályzat kitűnő! Irány a NASA! (5)");
    }
    else if (grade >= 75)
    {
        System.out.println("'B' osztályzat szép munka! (4)");
    }
    else if (grade >= 65)
    {
        System.out.println("'C' osztályzat megfelelő! (3)");
    }
    else if (grade >= 50)
    {
        System.out.println("'D' osztályzat elégséges! (2)");
    }
    else
    {
        System.out.println("'F' osztályzat borzasztó! (1)");
    }*/
    
    //switch case megoldás
    if (grade >= 89)
    {
        lettergrade = 'A';
    }
    else if (grade >= 75)
    {
        lettergrade = 'B';
    }
    else if (grade >= 65)
    {
        lettergrade = 'C';
    }
    else if (grade >= 50)
    {
        lettergrade = 'D';
    }
    else
    {
        lettergrade = 'F';
    }
    switch (lettergrade)
    {
            case 'A' :
            System.out.println("'A' osztályzat kitűnő! Irány a NASA! (5)");
            break;
            case 'B' :
            System.out.println("'B' osztályzat szép munka! (4)");
            break;
            case 'C' :
            System.out.println("'C' osztályzat megfelelő! (3)");
            break;
            case 'D' :
            System.out.println("'D' osztályzat elégséges! (2)");
            break;
             case 'F' :
            System.out.println("'F' osztályzat borzasztó! (1)");
            break;
    }
    }
}
