import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;
// constructor
    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        // set up arrays like this to avoid refference trap
        this.passport = Arrays.copyOf(passport, passport.length);
        this.seatNumber = seatNumber;
    }
//Copy constructor
    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
        this.seatNumber = source.seatNumber;
    }
// getters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
     this.nationality = nationality;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }
// setters
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassport(){
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public void setPassport(String[] passport){
        this.passport = Arrays.copyOf(passport, passport.length);
    }

    public int getSeatNumber(){
        return seatNumber;
    }

    public void setSeatNumber(){
        this.seatNumber = seatNumber;
    }

    public void drive(){
        System.out.println("\nYou Added the beauftiful " + this.name + " to the list");
    }

    public String toString() {
        return "Name" + this.name + ".\n"
                + "Nationality" + this.nationality + ".\n";
    }
}
