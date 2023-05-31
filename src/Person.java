public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.seatNumber = seatNumber;
    }

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

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassport(){
        return passport;
    }

    public void setPassport(String[] passport){
        this.passport = passport;
    }

    public int getSeatNumber(){
        return seatNumber;
    }

    public void setSeatNumber(){
        this.seatNumber = seatNumber;
    }
}
