public class NestedLoops{
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0; j < 3 ; j++){
                counter++;
                System.out.println("Counter : " + counter + " ( " + i + ", " + j + ")");
            }
        }
    }
}