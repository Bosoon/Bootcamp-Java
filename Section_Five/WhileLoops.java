public class WhileLoops {
    public static void main(String[] args) {
        int number = 25;
        while ( number <= 30 ) {
            System.out.println("number = " + number);
            number = number + 1;
        }

        for (int i = 25 ; i <= 30; i++){
            System.out.println(" number = " + i);
        }

        double choice = 0.01;
        double guess = 0.99;
        int counter = 0;

        while (guess > choice){
            guess = Math.random();
            System.out.println("Hi in the while loop");
            System.out.println("Guess : " + guess);
            counter += 1;
        }
        System.out.println("Counter : " + counter);
    }    
}
