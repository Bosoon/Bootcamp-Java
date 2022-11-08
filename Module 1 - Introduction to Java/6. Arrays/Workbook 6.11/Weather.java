import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celsius);
        //Task 2, call celsiusToFahrenheit and store the result in the fahrenheit array. 
        fahrenheit = celciusToFahrenheit(celsius);
        //Task 4, Call printTemperatures for celsius and fahrenheit.
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }


    /** Task 1
     * Function name: celciusToFahrenheit. 
     * @param celsius ( double[] )
     * @return fahrenheit ( double[] )
     * 
     * Inside the function: 
     *    1. Create an array 'fahrenheit' with the same length as 'celsius'.
     *    2. Copy all the values from celsius into the fahrenheit array.
     *    3. Update all the values in the array according to: F = (C/5 * 9) + 32.
     *    4. return the fahrenheit array.
     */   
    public static double[] celciusToFahrenheit(double[] celsius){
        double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        for(int i = 0; i < fahrenheit.length; i++){
            fahrenheit[i] = ( fahrenheit[i] * 9 / 5) + 32;
        }
        return fahrenheit;
    }
    /** Task 3
     * Function name - printTemperatures
     * @param temp ( double[] )
     * @param type ( String ) can be either Celsius or Fahrenheit
     * 
     * Inside the function:
     *   1. Uses a for loop to print the temperature values on the SAME line.
     *       Example:  Celsius: [Celsius values separated by a space]
     *   2. Adds a new line of space after printing the contents of the array.
     *   3. (Task 5) Rounds every temperature value to two decimal places. 
     */
    public static void printTemperatures(double[] temps, String type){
        if (!((type.equals("Celsius")) || (type.equals("Fahrenheit")))){
            System.out.print("Invalid type");
        } else if (type.equals("Celsius")){
            System.out.print(type + ":");
            for(double temp:temps){
                System.out.printf(" %.2f", temp);
            }
            System.out.println();
        }else {
            System.out.print(type + ":");
            for(double temp:temps){
                System.out.printf(" %.2f", temp);
            }
            System.out.println();
        }
    }

}
