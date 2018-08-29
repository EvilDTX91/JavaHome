/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

/**
 *
 * @author Tomi
 */
public class JUnitTestNumbers {
    
    private int primNumber(int number)
    {
        int x=0;
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                x++;
                if(x>2)
                {
                    x=0;
                    break;
                }
            }
        }
        
        return x;
    }
    private boolean primeNumberTrueFalse(int number)
    {
        if(primNumber(number)==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean primNumberCall(int number)
    {
        return primeNumberTrueFalse(number);
    }
    
    /*-------------------------------------------------------------------------*/
    
    private int sumNum(int a, int b)
    {
        return a+b;
    }
    public int callsumNum(int a, int b)
    {
        return sumNum(a,b);
    }
    
    /*-------------------------------------------------------------------------*/
    
    private int subNum(int a, int b)
    {
        return a-b;
    }
    public int callsubNum(int a, int b)
    {
        return subNum(a,b);
    }
    
    /*-------------------------------------------------------------------------*/
    
    private int multNum(int a, int b)
    {
        return a*b;
    }
    public int callmultNum(int a, int b)
    {
        return multNum(a,b);
    }
    
    /*-------------------------------------------------------------------------*/
    
    private int divNum(int a, int b)
    {
        return a/b;
    }
    public int calldivNum(int a, int b)
    {
        return divNum(a,b);
    }
    
}
