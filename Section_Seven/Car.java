import java.util.Arrays;

public class Car {

    private String maker;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(String maker, double price, int year, String color, String[] parts) {
        this.maker = maker;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source){
        this.maker = source.maker;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMaker(){
        return this.maker;
    }

    public void setMaker(String maker){
        this.maker = maker;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    
    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color ;
    }

    public void print(){
        System.out.println("This " + this.maker + " is worth $"
        + this.price + ". It was built in " + this.year +
        ". It is " + this.color + ".\n");
    }

    public void drive(){
        System.out.println("\nYou bought the beatiful " + this.year + " " + this.color + " " + this.maker + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }
    @Override
    public String toString(){
        return "Make: " + this.maker + ".\n" 
        +  "Price: " + this.price + ".\n"
        +  "Year: " + this.year + ".\n"
        +  "Color: " + this.color + ".\n"
        +  "Parts: " + Arrays.toString(parts) + ".\n";
    }
}
