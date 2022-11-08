import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] prices = {1.99, 2.99, 3.99, 4.99};
        /** Task 1: 
         * 
         *  Create a new array afterTax with the same length as price
         * 
         */
        double[] newPrices = new double[prices.length];

        for(int i = 0; i < prices.length ; i++){
            newPrices[i] = (1 + 0.13) * prices[i];
        }

        System.out.print("The original prices are: ");
        for(double price: prices){
            System.out.print(price + " ");
        }
        System.out.print("\nThe prices after tx are: ");
        for(double newPrice: newPrices){
            System.out.print(newPrice + " ");
        }
         /** Task 2:
          * 
          *  Update each element in afterTax to be: price + 13% * price.
          *
          */

         /** Task 3:
          * 
          * Print the following messages:
          *     The original prices are: <original prices>
          *     The prices after tax are: <after tax prices>
          *
          */

    }
}
