/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Tomi
 */
import javax.swing.*;
public class Cards extends BlackJack{
        
    BlackJack card = new BlackJack();
    
    private String[] cardType = new String[] {"Káró","Kör","Pikk","Treff"};
    private String[] cardValue = new String[] {"2","3","4","5","6","7","8","9","10","J","K","Q","A"};
    private ImageIcon imageKor = new ImageIcon("pictures/kor.png");
    private ImageIcon imageKaro = new ImageIcon("pictures/karo.png");
    private ImageIcon imagePikk = new ImageIcon("pictures/pikk.png");
    private ImageIcon imageTreff = new ImageIcon("pictures/treff.png");
    
    private String CardType()
    {
        String ct = cardType[(int)(Math.random() * 3)];
        //System.out.println((int)(Math.random() * 4)); // 0 és 4 közötti számot véletlenszerűen ad meg
        return ct;
    }
    private String CardNameValue()
    {
        String cv = cardValue[(int)(Math.random() * 12)];
        
        return cv;
    }
    String CardTypeCall()
    {
        return CardType();
    }
    String CardNameValueCall()
    {
        return CardNameValue();
    }
    int CardValueCall(String cnv)
    {
        return CardValue(cnv);
    }
    
    String CallCard()
    {
        return CardTypeCall() + CardNameValueCall();
    }
    
    private int CardValue(String cv)
    {
        //String cv = CardNameValueCall();
        int cvValue = 0;
        
        switch(cv)
        {            
            case "Káró2" : cvValue = 2;
                        break;
            
            case "Káró3" : cvValue = 3;
                        break;
            
            case "Káró4" : cvValue = 4;
                        break;
            
            case "Káró5" : cvValue = 5;
                        break;
            
            case "Káró6" : cvValue = 6;
                        break;
            
            case "Káró7" : cvValue = 7;
                        break;
            
            case "Káró8" : cvValue = 8;
                        break;
            
            case "Káró9" : cvValue = 9;
                        break;
            
            case "Káró10" : cvValue = 10;
                        break;
            
            case "KáróJ" : cvValue = 10;
                        break;
            
            case "KáróQ" : cvValue = 10;
                        break;
            
            case "KáróK" : cvValue = 10;
                        break;
            
            case "KáróA" : cvValue = 11;
                        break;
                        
            case "Kör2" : cvValue = 2;
                        break;
            
            case "Kör3" : cvValue = 3;
                        break;
            
            case "Kör4" : cvValue = 4;
                        break;
            
            case "Kör5" : cvValue = 5;
                        break;
            
            case "Kör6" : cvValue = 6;
                        break;
            
            case "Kör7" : cvValue = 7;
                        break;
            
            case "Kör8" : cvValue = 8;
                        break;
            
            case "Kör9" : cvValue = 9;
                        break;
            
            case "Kör10" : cvValue = 10;
                        break;
            
            case "KörJ" : cvValue = 10;
                        break;
            
            case "KörQ" : cvValue = 10;
                        break;
            
            case "KörK" : cvValue = 10;
                        break;
            
            case "KörA" : cvValue = 11;
                        break;
                        
            case "Pikk2" : cvValue = 2;
                        break;
            
            case "Pikk3" : cvValue = 3;
                        break;
            
            case "Pikk4" : cvValue = 4;
                        break;
            
            case "Pikk5" : cvValue = 5;
                        break;
            
            case "Pikk6" : cvValue = 6;
                        break;
            
            case "Pikk7" : cvValue = 7;
                        break;
            
            case "Pikk8" : cvValue = 8;
                        break;
            
            case "Pikk9" : cvValue = 9;
                        break;
            
            case "Pikk10" : cvValue = 10;
                        break;
            
            case "PikkJ" : cvValue = 10;
                        break;
            
            case "PikkQ" : cvValue = 10;
                        break;
            
            case "PikkK" : cvValue = 10;
                        break;
            
            case "PikkA" : cvValue = 11;
                        break;
                        
            case "Treff2" : cvValue = 2;
                        break;
            
            case "Treff3" : cvValue = 3;
                        break;
            
            case "Treff4" : cvValue = 4;
                        break;
            
            case "Treff5" : cvValue = 5;
                        break;
            
            case "Treff6" : cvValue = 6;
                        break;
            
            case "Treff7" : cvValue = 7;
                        break;
            
            case "Treff8" : cvValue = 8;
                        break;
            
            case "Treff9" : cvValue = 9;
                        break;
            
            case "Treff10" : cvValue = 10;
                        break;
            
            case "TreffJ" : cvValue = 10;
                        break;
            
            case "TreffQ" : cvValue = 10;
                        break;
            
            case "TreffK" : cvValue = 10;
                        break;
            
            case "TreffA" : cvValue = 11;
                        break;
        }
        
        return cvValue;
    }
    
}
