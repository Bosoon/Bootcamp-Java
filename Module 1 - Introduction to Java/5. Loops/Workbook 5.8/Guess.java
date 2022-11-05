import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */
        int secret = (int)(Math.random() * 5) + 1;
        // System.out.println(secret);

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
        Scanner scan = new Scanner(System.in);
       

        /* Task 2 
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '

            2. Once they guess it, print: You got it!
        */       
        while(!(secret == scan.nextInt())){
            System.out.print("Guess again: ");
        }
        scan.close();
    }

}
