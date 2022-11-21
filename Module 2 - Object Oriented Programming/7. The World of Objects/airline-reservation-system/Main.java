import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person bo = new Person("Bo Soon Park", "South Korea", "15/01/76");
        bo.setSeatNumber(1);
      
        bo.print();
    
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
        Person twin = new Person(person);
        twin.setSeatNumber(3);
        twin.setName("Jad Slim");

        person.print();
        twin.print();
    }
}
