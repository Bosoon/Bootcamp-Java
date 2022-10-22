import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nHello. What is your name?");
        String name = scan.nextLine();

        System.out.println("\nHi " + name + "! I'm JavaBot. Where are you from?");
        String hometown = scan.nextLine();

        System.out.println("\nI hear it's beautiful at " + hometown + " I'm from a place called Oracle.");
        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("So you're " + age + " I'm 400 year olds.");
        System.out.println("This mean I'm " + (400/age) + " time older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python.)");
        String language = scan.nextLine();
        System.out.println(language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See Ya!");

        scan.close();
    }
}
