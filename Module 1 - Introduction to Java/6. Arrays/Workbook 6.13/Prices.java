public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        double[][] prices = new double[3][5];
        // Task 2 - Populate your 2D array with values from the table (see article)
        prices[0][0] = 12.99;
        prices[0][1] = 8.99;
        prices[0][2] = 9.99;
        prices[0][3] = 10.49;
        prices[0][4] = 11.99;

        prices[0][0] = 0.99;
        prices[1][1] = 1.99;
        prices[1][2] = 2.49;
        prices[1][3] = 1.49;
        prices[1][4] = 2.99;

        prices[2][0] = 8.99;
        prices[2][1] = 7.99;
        prices[2][2] = 9.49;
        prices[2][3] = 9.99;
        prices[2][4] = 10.99;

        // Task 3 - Print the prices for each department. See the article for the expected output.
        String[] items = {"Baking", "Beverage", "Cereals"};
        for(int i = 0 ; i < prices.length; i++){
            System.out.print(items[i] + ":");
            for(int j=0; j < prices[0].length; j++){
                System.out.print(" " +prices[i][j]);
            }
            System.out.println();
        }

    }
}