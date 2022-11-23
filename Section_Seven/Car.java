public class Car {

    private String maker;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String maker, double price, int year, String color, String[] parts) {
        this.maker = maker;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = parts;
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

}
