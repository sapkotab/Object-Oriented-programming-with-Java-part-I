
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        boolean loopTest = true;
        // Write your code here
        while (loopTest) {
            System.out.println("Type the password: ");
            String input = reader.nextLine();
            if (input.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                loopTest = false;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
