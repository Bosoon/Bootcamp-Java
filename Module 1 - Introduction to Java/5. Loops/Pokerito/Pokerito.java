import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" >>Let's play Pokerito. Type anything when you're ready.\n");
        System.out.println(">>It's like Poker, but a lot simpler.\n>>");
        System.out.println(">> • There are two players, you and the computer.");
        System.out.println(">> • The dealer will give each player one card.");
        System.out.println(">> • Then, the dealer will draw five cards (the river)");
        System.out.println(">> • The player with the most river matches wins!");
        System.out.println(">> • If the matches are equal, everyone's a winner!\n>>");
        System.out.println(">> • Ready? Type anything if you are.");

        System.out.println("Hear's your card:");
        String playerCard = randomCard();
        System.out.println(playerCard);

        String computerCard = randomCard();
        System.out.println("\nHere's the computer's card:");         
        System.out.println(computerCard);

        int yourMatches = 0;
        int computerMatches =0;

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");

        String[] cards = new String[5];
        for(int i=0; i < 5; i++){
            cards[i] = randomCard();
            System.out.println("Card " + (i + 1));
            System.out.println("\n\n" + cards[i]);
        }

        for(String card: cards){
            if(card.equals(playerCard)){
                yourMatches++;
            }
            if(card.equals(computerCard)){
                computerMatches++;
            }
        }
        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (yourMatches == computerMatches){
            System.out.println("everyone wins!");
        }else if (yourMatches > computerMatches){
            System.out.println("You win!");
        }else{
            System.out.println("The computer wins!");
        }



         scan.close();
    }

    public static String randomCard(){
        int randomNumber = (int)(Math.random() * 13) + 1;
        String result = "";
        switch(randomNumber){
            case 1:
                result = 
                   "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
                break;
             case 2:
                result =
                    "   _____\n"+              
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
            default:
                result = "No valid";
                break;
        }
        return result;
    }
}
