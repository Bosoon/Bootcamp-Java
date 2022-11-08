import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        /* Task 1: Create an array that stores each aisle:
             apples – bananas – candy – chocolate – coffee – tea

             Then, use a for loop to print each element in the array. 
        */
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        int counter = 0;
        for ( String aisle: aisles){
            System.out.println(aisle);
            if (aisle.equals("coffee")){
                System.out.println("\nWe have that in aisle: " + counter );
                break;
            }
            counter++;
        }

        System.out.println("\nDo you sell coffee?");
        /* Task 2:
           1. System.out.println("\nDo you sell coffee?");

           2. Using the for loop from task 1:
            • check if Java Grocer sells coffee.
            • if so, break the loop and print: \nWe have that in aisle: <index>

        */

        scan.close();
    }
}
