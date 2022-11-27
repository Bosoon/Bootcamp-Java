import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person bo = new Person("Bo Soon Park", "South Korea", "15/01/76");
        bo.setSeatNumber(1);
      
        bo.print();
    
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111");

        person.chooseSeat();

        person.applyPassport();
        if (person.applyPassport()){
            person.setPassport();
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
        } else {
            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");
        }
        person.print();
        System.out.println(person);


        
    }
}
