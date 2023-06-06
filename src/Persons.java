import java.util.Objects;

public class Persons {
    private String name;
    private int age;

    public Persons(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode(){
        //hash code = hash-functions
        // it calculates an array index based on the key
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }



    @Override
    public String toString(){
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
