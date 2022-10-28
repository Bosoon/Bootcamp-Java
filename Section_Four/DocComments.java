public class DocComments {
    public static void main(String[] args) {
        greet();
        printText("Bo", 46);
        double area = calculatorArea(12.5, 4.0);

        System.out.println(area);

    }

    /**
     * Function name: greet
     * 
     * Inside the function:
     *  1. prints "Hi"
     * 
     */
    public static void greet(){
        System.out.println("Hi");
    }

    /**
     * Function name: printText
     * @param name (String)
     * @param age (int)
     * 
     * Inside the function:
     *  1. print the name and age as part of a text
     */
    public static void printText(String name, int age){
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    /**
     * Function name: caculatorArea
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the fucntion:
     *  1. calcuate the rectangle area with length and width
     *  2. return the area
     */
    public static double calculatorArea(double length, double width){
        double area = length * width;
        return area;
    }
}
