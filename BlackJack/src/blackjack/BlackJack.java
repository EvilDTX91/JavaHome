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
import java.util.*;
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cards card = new Cards();
        //CardGameWindow window = new CardGameWindow();
        
        //--------------------------------------------------------------------\\
        
        Set<String> cardsSet = new HashSet<String>();
        
        //--------------------------------------------------------------------\\
        int playerScore = 0;
        int playerCredit = 10;
        int dealerScore = 0;
        
        
        String playerName = null;
        
            Scanner inputReader = new Scanner(System.in);
            System.out.println("Please enter your Name: ");
            playerName = inputReader.nextLine();
        
        
        while(playerCredit != 0)
        {
        
            String input = null;
            inputReader = new Scanner(System.in);
            System.out.println("Please enter: \tStart(1) \tOptions(2) \tExit(3)");

            // here is how you take the input from keyboard

            input = inputReader.nextLine();
                    // this is how you write to console
            //System.out.println("You entered: " + input + "\n"); //input ellenörzésére


            //--------------------------------------------------------------------\\

            if(input.equals("Start") || input.equals("1"))
                {

                //--------------------------------------------------------------------\\
        
                int playerCardPiece = 2;        
                int dealerCardPiece = 2;

                String aCard = "";
                int aCardValue = 0;

                String bCard = "";
                int bCardValue = 0;


                String aCardDealer = "";
                int aCardValueDealer = 0;

                String bCardDealer = "";
                int bCardValueDealer = 0;

                //int ciklus = 0;

                //while(aCardValue+bCardValue != 21) //addig futtatja a programot amig nem lesz Black Jack!
                //{
                //--------------------------------------------------------------------\\
                aCard = card.CallCard();
                aCardValue = card.CardValueCall(aCard);
                cardsSet.add(aCard);

                //--------------------------------------------------------------------\\
                bCard = card.CallCard();
                bCardValue = card.CardValueCall(bCard);

                //--------------------------------------------------------------------\\
                aCardDealer = card.CallCard();
                aCardValueDealer = card.CardValueCall(aCardDealer);

                //--------------------------------------------------------------------\\
                bCardDealer = card.CallCard();
                bCardValueDealer = card.CardValueCall(bCardDealer);

                //--------------------------------------------------------------------\\

                while(cardsSet.contains(bCard))
                {
                bCard = card.CallCard();
                bCardValue = card.CardValueCall(bCard);    
                }
                cardsSet.add(bCard);

                //--------------------------------------------------------------------\\

                while(cardsSet.contains(aCardDealer))
                {
                aCardDealer = card.CallCard();
                aCardValueDealer = card.CardValueCall(aCardDealer);    
                }
                cardsSet.add(aCardDealer);

                //--------------------------------------------------------------------\\

                while(cardsSet.contains(bCardDealer))
                {
                bCardDealer = card.CallCard();
                bCardValueDealer = card.CardValueCall(bCardDealer);    
                }
                cardsSet.add(bCardDealer);


                //--------------------------------------------------------------------\\
                /*
                System.out.println(cardsSet);
                System.out.println(cardsSet.size() + " db kártya kihzúva!"); // kezdő lapok ellenörzésére
                */
                //--------------------------------------------------------------------\\
                /*if(aCard.equals(bCard))
                {
                        System.out.println("Player: \t\t\t Dealer: ");
                        System.out.print(aCard + "(" + aCardValue + ")");
                        System.out.print("\t" + bCard + "(" + bCardValue + ")");
                        System.out.print(" |( " + aCardDealer + "(" + aCardValueDealer + ")");
                        System.out.print("\t" + bCardDealer + "(" + bCardValueDealer + ")");
                        playerScore = aCardValue + bCardValue;
                        dealerScore = aCardValueDealer + bCardValueDealer;
                        System.out.print("\n\nPlayer Score: " + playerScore);
                        System.out.println("\t\tDealer Score: " + dealerScore);
                        System.out.println("\n\nHiba: A kártyák azonosak!");
                }
                else
                {*/
                System.out.println(playerName + ": (" + playerCredit + ")\t\t\t | \t Dealer: ");
                System.out.print(aCard + "(" + aCardValue + ")");
                System.out.print("\t" + bCard + "(" + bCardValue + ")");
                System.out.print("\t\t | \t" + aCardDealer + "(" + aCardValueDealer + ")");
                System.out.print("\t" + bCardDealer + "(" + bCardValueDealer + ")");
                playerScore = aCardValue + bCardValue;
                dealerScore = aCardValueDealer + bCardValueDealer;
                System.out.print("\nPlayer Score: " + playerScore);
                System.out.println("\t\t | \tDealer Score: " + dealerScore + "\n");
                //}

                //--------------------------------------------------------------------\\

                while(playerScore < 21)
                {
                    input = null;
                    inputReader = new Scanner(System.in);

                    System.out.println("Call(1) \tHold(2) \tExit(3) -1 Credit");

                    input = inputReader.nextLine();

                            if(input.equals("1"))
                            {
                            String newCard = card.CallCard();
                            int newCardValue = card.CardValueCall(newCard);

                                while(cardsSet.contains(newCard))
                                    {
                                    newCard = card.CallCard();
                                    newCardValue = card.CardValueCall(newCard);    
                                    }
                                    cardsSet.add(newCard);
                                    playerCardPiece++;

                            playerScore += newCardValue;
                            System.out.println("Player new card: " + newCard + "(" + newCardValue + ") \t | \t Player new score: " + playerScore);
                            }
                            if(input.equals("2"))
                            {
                                break;
                            }
                            if(input.equals("3"))
                            {
                                System.out.println("Viszlát!");
                                playerCredit--;
                                System.exit(0);
                            }
                }

                //--------------------------------------------------------------------\\
                /*while(playerScore<dealerScore) // automata kártya húzó a játékos helyett
                {
                    String newCard = card.CallCard();
                    int newCardValue = card.CardValueCall(newCard);

                        while(cardsSet.contains(newCard))
                            {
                            newCard = card.CallCard();
                            newCardValue = card.CardValueCall(newCard);    
                            }
                            cardsSet.add(newCard);

                    playerScore += newCardValue;

                    System.out.println("Player new card: " + newCard + "(" + newCardValue + ") \t | \t Player new score: " + playerScore);

                    if(playerScore>22)
                    {
                        System.out.println("Sajnálom vesztettél!");
                        break;
                    }

                }*/

                //--------------------------------------------------------------------\\
                while(dealerScore<playerScore && playerScore<=21) //dealer kátya húzó
                {
                    String newCard = card.CallCard();
                    int newCardValue = card.CardValueCall(newCard);

                        while(cardsSet.contains(newCard))
                                {
                                newCard = card.CallCard();
                                newCardValue = card.CardValueCall(newCard);    
                                }
                                cardsSet.add(newCard);
                                dealerCardPiece++;

                    dealerScore += newCardValue;
                    System.out.println("Dealer new card: " + newCard + "(" + newCardValue + ") \t | \t Dealer new score: " + dealerScore);

                    if(dealerScore>22)
                    {
                        System.out.println("Gratulálok Nyertél!");
                        playerCredit++;
                        break;
                        //System.exit(0);
                    }

                }


                //--------------------------------------------------------------------\\

                if(playerScore==21 && dealerScore == 21)
                {
                    if(playerCardPiece<dealerCardPiece)
                    {
                        System.out.println("\n\n\t\t!!!!!!!Gratulálok!!!!!!!\t\n");
                        System.out.println("\t\t!!!!!!!BLACK JACK!!!!!!!\t\n");
                        playerCredit++;
                        //break;
                        //System.exit(0);
                    }
                    else if(playerCardPiece>dealerCardPiece)
                    {
                        System.out.println("\n\n\t\t!!!!!!!Sajnálom!!!!!!!\t\n");
                        System.out.println("\t\t!!!!!!!BLACK JACK!!!!!!!\t\n");
                        playerCredit--;
                        //break;
                        //System.exit(0);
                    }
                    else
                    {
                        System.out.println("\n\n\t\t!!!!!!!Döntetlen!!!!!!!\t\n");
                        System.out.println("\t\t!!!!!!!BLACK JACK!!!!!!!\t\n");
                        //break;
                        //System.exit(0);
                    }

                }
                else if(playerScore == 21 && dealerScore != 21)
                {
                        System.out.println("\n\n\t\t!!!!!!!Gratulálok!!!!!!!\t\n");
                        System.out.println("\t\t!!!!!!!BLACK JACK!!!!!!!\t\n");
                        playerCredit++;
                        //break;
                        //System.exit(0);

                }
                else if(dealerScore == 21 && playerScore != 21)
                {
                        System.out.println("\n\n\t\t!!!!!!!Sajnálom!!!!!!!\t\n");
                        System.out.println("\t\t!!!!!!!BLACK JACK!!!!!!!\t\n");
                        playerCredit--;
                        //break;
                        //System.exit(0);
                }
                
                else if(playerScore>dealerScore && playerScore<22)
                {
                    System.out.println("\n\t\tGratulálok! Nyertél!");
                    playerCredit++;
                }
                else if(playerScore>dealerScore && playerScore>21)
                {
                    System.out.println("\n\t\tSajnálom Vesztettél! Az osztó nyert!");
                    playerCredit--;
                }
                //--------------------------------------------------------------------\\
                else if(playerScore == dealerScore)
                {
                    System.out.println("\n\t\tDöntetlen!");
                }
                //--------------------------------------------------------------------\\
                else if(dealerScore>playerScore && dealerScore<22)
                {
                    System.out.println("\n\t\tSajnálom Vesztettél! Az osztó nyert!");
                    playerCredit--;
                }
                /*
                else if(dealerScore>playerScore && dealerScore>21)
                {
                    System.out.println("\n\t\tGratulálok! Nyertél!");
                    playerCredit++;
                }
                */
                //System.out.println("Futások száma: " + ciklus);
                //ciklus++;
                //}
                //System.out.println("PlayerCardPiece: " + playerCardPiece + "\tDealerCardPiece: " + dealerCardPiece);
                /*
                System.out.println(cardsSet);
                System.out.println(cardsSet.size() + " db kártya kihzúva!"); // végső kártya ellenörző
                */ 
        }
        else if(input.equals("Exit") || input.equals("3"))
            {
                System.out.println("Viszlát " + playerName + "!");
                System.exit(0);
            }
        else
            {
                System.out.println("Viszlát!");
                System.exit(0);
            }
        
        System.out.println(playerName + " Credit: " + playerCredit);
        cardsSet.clear();
        }
        
        if(playerCredit==0)
        {
            System.out.println("\nSajnálom kedves " + playerName + " elfogyott a Credited! Több szerencsét legközelebbre! Vége a játéknak!");
        }
    }
}
