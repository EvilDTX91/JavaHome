package newroot;
public class NewRoot {
    public static void main(String[] args) {
        int number = 50;
        if (args.length>0)
        {
            number = Integer.parseInt(args[0]); //karakterláncból egészet hoz létre
        }
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
    }
    
}
