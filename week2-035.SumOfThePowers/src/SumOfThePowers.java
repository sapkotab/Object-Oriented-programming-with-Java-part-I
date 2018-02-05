
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x = 0;
        System.out.println("Type a number: ");
        int entry = Integer.parseInt(reader.nextLine());
        int result = 0;

        while (x <= entry){
            result += (int)(Math.pow(2,x));
            x++;
        }

        System.out.println("The result is  "+ result);
    }
}
