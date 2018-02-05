
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x = 1;
        int sum = 0;

        System.out.println("until what?");
        int until = Integer.parseInt(reader.nextLine());
        while ( x <= until){
            sum += x;
            x++;
        }
        System.out.println(sum);
    }

}
