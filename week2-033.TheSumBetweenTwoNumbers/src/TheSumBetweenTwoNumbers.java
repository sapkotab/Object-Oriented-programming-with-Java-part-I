
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//        int first = 1;
        int sum = 0;
        System.out.println("first");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("last");
        int last = Integer.parseInt(reader.nextLine());
        while ( first <= last){
            sum += first;
            first++;
        }
        System.out.println(sum);
    }
}
