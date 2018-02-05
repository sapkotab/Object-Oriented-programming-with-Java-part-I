
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String user1 = "alex";
        String user2 = "emily";
        String pswd1 = "mightyducks";
        String pswd2 = "cat";

        System.out.println("Type your username: ");
        String user = reader.nextLine();
        System.out.println("Type your password: ");
        String pswd = reader.nextLine();

        if((user.equals(user1) && pswd.equals(pswd1)) || (user.equals(user2) && pswd.equals(pswd2))){
            System.out.println("You are now logged into the system!");
        }else {
            System.out.println("Your username or password was invalid!");
        }

    }
}
