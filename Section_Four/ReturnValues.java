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
        double area = length * width;
        return area;
    } 
 
}
