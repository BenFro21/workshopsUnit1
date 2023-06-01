public class Dealership {

    private Person[] people;


    //called a deep copy. for copying arrays in objects
    public Dealership(Person[] people){
        this.people = new Person[people.length];
        for(int i = 0; i < this.people.length; i++ ){
            this.people[i] = new Person(people[i]);
        }
    }

    public void sell(int index){
//        this.people[i];
    }
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.people.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.people[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
}
