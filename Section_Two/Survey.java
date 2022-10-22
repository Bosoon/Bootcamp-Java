import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, Thank you for taking the survey");

        int counter = 0;
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("How much money do you spend on fastfood?");
        double fastFoodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fastfood?");
        int fastFoodAmount = scan.nextInt();
        counter++;
        
        System.out.println("\nThanks you " + name + " for answering all " + counter +" questions");
        System.out.println("Your fast food expenses are " + (fastFoodPrice / coffeePrice) + " times your coffee price.");
        System.out.println("Weekly you spend $" + (coffeeAmount * coffeePrice) + " on coffee");
        System.out.println("Weekly you spend $" + (fastFoodAmount * fastFoodPrice) + " on fastfood.");

        scan.close();
    }
}
