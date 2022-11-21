public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber;
    
    private String[] passport = {this.name, this.nationality, this.dateOfBirth};

    public Person(String name, String nationality, String dateOfBirth){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
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
        return this.passport;
    }

    public void print(){
        System.out.println("Name: " + this.getName());
        System.out.println("Nationality: " + this.getNationality());
        System.out.println("Date of Birth: " + this.getDateOfBirth());
        System.out.println("Seat Number: " + this.getSeatNumber());
    }
}
