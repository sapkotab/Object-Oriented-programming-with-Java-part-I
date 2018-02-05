import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> books = new ArrayList<Person>();

    public void add(String name, String number){
        Person temp = new Person(name,number);
        books.add(temp);
    }

    public void printAll(){
        for (Person x:books) {
            System.out.println(x);
        }
    }

    public String searchNumber(String name){
        for (Person person: books) {
            if (person.getName().contains(name)){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
