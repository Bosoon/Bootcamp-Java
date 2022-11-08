import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int sumOfCards = 0;

        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");

        scan.nextLine();

        int draw1 = drawRandomCard();
        int draw2 = drawRandomCard();
        System.out.println("\nYou get a \n" + cardString(draw1) + "\nand a \n" + cardString(draw2));

        sumOfCards = Math.min(draw1, 10) + Math.min(draw2, 10);
        System.out.println("your total is: " + sumOfCards);
        
        int dealer1 = drawRandomCard();
        int dealer2 = drawRandomCard();

        System.out.println("The dealer shows \n" + cardString(dealer1) + "\nand has a card facing down \n" + faceDown() );
        System.out.println("The dealer's total is hidden");
        int dealerOfTotal = Math.min(dealer1, 10) + Math.min(dealer2, 10);
        while(true){
            String option = hitOrStay();
            if (option.equals("stay")){
                break;
            }
            int temp = drawRandomCard();
            System.out.println("\nYou get a \n" + cardString(temp));
            sumOfCards += Math.min(temp, 10);
            System.out.println("your new total is " + sumOfCards);
            if (sumOfCards >= 22){
                System.out.println("Bust! Player lose!");
                System.exit(0);
            }
        }

        System.out.println("\nDealer's turn");
        System.out.println("\nThe Dealer's card are\n" + cardString(dealer1) + "\nand a \n" + cardString(dealer2));
        
        while(dealerOfTotal <=17){
            int dealtemp = drawRandomCard();
            dealerOfTotal += Math.min(dealtemp, 10);
            System.out.println("\nDealer gets a\n" + cardString(dealtemp));
            System.out.println("\nDealer's total is " + dealerOfTotal);
        }
        
        if (dealerOfTotal > 21) {
            System.out.println("Bust! Dealer lose!");
            System.exit(0);
        }
        
        System.out.println("Your total is " + sumOfCards);
        System.out.println("Dealer's total is " + dealerOfTotal);
        if (sumOfCards > dealerOfTotal){
            System.out.println("Your wins!");
        } else {
            System.out.println("Dealer wins!");
        }
        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();

    }

    public static int drawRandomCard(){
        int randomCard = (int)(Math.random() * 13) + 1;
        return randomCard;
    }
    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber){
        String result = "";
        switch(cardNumber){
            case 1:
                result = "   _____\n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";
                break;
            case 2:
                result =  "   _____\n"+              
                            "  |2    |\n"+ 
                            "  |  o  |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____Z|\n";
                break;
            case 3:
                result = 
                "   _____\n" +
                "  |3    |\n"+
                "  | o o |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____E|\n";
                    break;
            case 4:
                    result =
                    "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";
                    break;
            case 5:
                    result =
                    "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
                    break;
                case 6:
                    result =
                    "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
                    break;
                case 7:
                    result =
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
                    break;
                case 8:
                    result =     
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
                    break;
                case 9:
                    result =
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
                    break;
                case 10:
                    result = 
                    "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
                    break;
                case 11:
                    result = 
                    "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
                    break;
                case 12:
                    result =
                    "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
                    break;
                case 13: 
                    result =
                    "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
                    break;
        }
        return result;
    }
    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay(){
        String option = "";
        while(true){
            System.out.println("Would you like to hit or stay!");
            option = scan.nextLine().toLowerCase();
            if(option.equals("hit") || option.equals("stay")){
                break;
            }
        }
        return option;
    }
}

