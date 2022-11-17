public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 5000, 2018, "red");
        Car dodge = new Car("Dodge", 11000, 2019, "blue");

        nissan.print();
        dodge.print();

        System.out.println(nissan.getColor());
        nissan.setColor("Black Light");
        nissan.setPrice(nissan.getPrice()/2);
        nissan.print();
        
    }
}
