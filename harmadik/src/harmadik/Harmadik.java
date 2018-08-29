/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadik;


/**
 *
 * @author Tomi
 */
public class Harmadik {

    private double a;
    private double b;
    private double c;
    private double s;
    
    public Harmadik(double a_,double b_,double c_,double s_)
    {
    a=a_;
    b=b_;
    c=c_;
    s=s_;
    }
    
    public double szerk()
    {
        if ( (a+b>c) && (a+c>b) && (c+b>a))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public double s()
    {
    return (a+b+c)/2;
    }    
    
    public double terulet()
    {
       return Math.sqrt(a*a+b*b);
    }
    public double kerulet()
    {
        return a+b+c;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Harmadik haromszog = new Harmadik(12,4,9,0);
        System.out.print("Háromszög területe: "+haromszog.terulet()+"\n");
        System.out.print("Háromszög kerülete: "+haromszog.kerulet()+"\n");
        if (haromszog.szerk()>0)
        {
            System.out.print("A háromszög szerkeszthető!\n");
        }
        else
        {
            System.out.print("A háromszög NEM szerkeszthető!\n");
        }
    }
}
