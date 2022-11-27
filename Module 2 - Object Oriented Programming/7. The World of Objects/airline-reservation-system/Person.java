import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber;
    
    private String[] passport;

    public Person(String name, String nationality, String dateOfBirth){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
    }

    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public String getNationality(){
        return this.nationality;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

    public String[] getPassport(){
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public void setPassport(){
        this.passport = Arrays.copyOf(new String[]{this.getName(), this.getNationality(), this.getDateOfBirth()}, 3);
    }

    public boolean applyPassport(){
        int number = (int)(Math.random() * 2);
        switch(number) {
            case 1:
                return true;
            case 0:
                return false;
            default:
                System.out.println("No in here");
                return false;
        }
    }

    public void chooseSeat(){
        this.seatNumber = (int)(Math.random() * 11 ) + 1;
    }

    public void print(){
        System.out.println("Name: " + this.getName());
        System.out.println("Nationality: " + this.getNationality());
        System.out.println("Date of Birth: " + this.getDateOfBirth());
        System.out.println("Seat Number: " + this.getSeatNumber());
        System.out.println("Passport : " + Arrays.toString(this.getPassport()));
    }

    public String toString(){
        return "Name: " + this.getName() + "\n" + "Nationality: " + 
        this.getNationality() + "\n" + "Date of Birth: " + 
        this.getDateOfBirth() + "\n" + "Seat Number: " +
        this.getSeatNumber() + "\n" + "Passport: " + 
        Arrays.toString(Arrays.copyOf(this.getPassport(), 3)) + "\n";
    }
}
