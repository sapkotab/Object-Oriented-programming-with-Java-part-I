
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());
        System.out.println("\nType your name: ");
        String nName = reader.nextLine();
        System.out.println("Type your age: ");
        int nAge = Integer.parseInt(reader.nextLine());
        System.out.println("\n" + name + " and " + nName + " are " + (age + nAge) + " years old in total.");

    }
}
