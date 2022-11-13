import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person bo = new Person();
        bo.name = "Bo Soon Park";
        bo.nationality = "South Korea";
        bo.dateOfBirth = "15/01/76";
        bo.passport = new String[]{bo.name, bo.nationality, bo.dateOfBirth};
        bo.seatnumber = 1;
      
        System.out.println(bo.name);
        System.out.println(bo.nationality);
        System.out.println(Arrays.toString(bo.passport));
        System.out.println(bo.seatnumber);
    }
}
