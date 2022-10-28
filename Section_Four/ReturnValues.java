public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculatorArea(2.3, 3.6);
        double area2 = calculatorArea(1.6, 2.4);
        double area3 = calculatorArea(2.6, 4.2);

        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
    }

    public static double calculatorArea(double length, double width){
        if (length < 0 || length < 0){
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language){
        switch(language){
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la logueur * la largeur.";
            case "Spanish":
                return "area es igual a largo * chcho";
            default:
                return "Language not available";
        }
    }

    public static void printArea(double length, double width, double area){
        System.out.println("A retangle with a length of " + length + " and a width of " 
        + " has an area " +  area );
    }
 
}
