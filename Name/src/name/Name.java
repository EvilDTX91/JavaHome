package name;
import java.util.*;
public class Name {
    public static void main(String[] args) {
        String[] names = {"Peter","Patricia","Hunter","Sarah","Gabe","Gina","Rob",
        "John", "Zoey", "Tammy", "Robert", "Sean", "Paschal","Kathy","Neleh","Vecepia"};
        System.out.println("The original order:");
        for (int i=0;i<names.length; i++)
        {
            System.out.println(i + ": " + names[i]);
        }
        Arrays.sort(names);
        System.out.println("The new order:");
        for (int i=0;i<names.length;i++)
        {
            System.out.println(i + ": " + names[i]);
        }
    }
    
}
