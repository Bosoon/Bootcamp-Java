public class Car {

    String maker;
    double price;
    int year;
    String color;

    public Car(String maker, double price, int year, String color) {
        this.maker = maker;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public void print(){
        System.out.println("This " + this.maker + " is worth $"
        + this.price + ". It was built in " + this.year +
        ". It is " + this.color + ".\n");
    }

}
