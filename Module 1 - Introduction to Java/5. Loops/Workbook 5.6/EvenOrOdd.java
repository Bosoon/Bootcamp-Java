public class EvenOrOdd {
    public static void main(String[] args) {
        // Task 1 – Make a for loop that counts from 0 to 19. 
        for(int i = 0 ; i < 20 ; i++){
            String comment = "";
            if ( i % 2 == 0){
                comment = " - even";
            }else{
                comment = " - odd";
            }
            System.out.println(i + comment);
        }
        /* Task 2
             
            1. If the number is even, print ' – even' beside the number.
            2. If the number is odd, print ' – odd' beside the number.

         */

    }
}
