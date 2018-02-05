
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<Student>();

        System.out.println("name: ");
        String name = reader.nextLine();
        System.out.println("student number: ");
        String stNumber = reader.nextLine();
        while (name.length() > 0){
            students.add(new Student(name,stNumber));
            System.out.println("name: ");
            name = reader.nextLine();
            if(name.length() < 1){
                break;
            }
            System.out.println("student number: ");
            stNumber = reader.nextLine();
        }

        for (Student x:students) {
            System.out.println(x);
        }

        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");

        for (Student x:students) {
            if (x.toString().contains(searchTerm)) {
                System.out.println(x);
            }
        }

    }
}
