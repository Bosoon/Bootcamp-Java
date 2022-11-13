public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        Car dodge = new Car();

        nissan.print();

        nissan.maker = "Nissan";
        nissan.year = 2020;
        nissan.price = 5000;
        nissan.color = "red";

        dodge.maker = "Dodge";
        dodge.price = 11000;
        dodge.year = 2019;
        dodge.color = "blue";

        nissan.print();
        dodge.print();
    }
}
