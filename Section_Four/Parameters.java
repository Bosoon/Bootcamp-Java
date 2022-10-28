
public class Parameters {
    public static void main(String[] args) {
        calculatorArea(2.3, 3.6);
        calculatorArea(1.6, 2.4);
        calculatorArea(2.6, 4.2);
    }

    public static void calculatorArea(double length, double width){
        double area = length * width;
        System.out.println("Area : " + area);
    }
}
