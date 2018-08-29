/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package masodik;

/**
 *
 * @author Tomi
 */
public class Masodik {
    
    private int a;
    private int b;
    
    public Masodik(int a_,int b_)
    {
    a=a_;
    b=b_;
    }
    public int terulet()
    {
        return a*b;
    }
    public int kerulet()
    {
    return 2*(a+b);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Masodik tegla = new Masodik(2,3);
        System.out.print("A négyszet területe: "+tegla.terulet()+"\n");
        System.out.print("A négyszet területe: "+tegla.kerulet()+"\n");
    }
}
