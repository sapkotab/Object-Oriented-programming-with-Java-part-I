
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);

        // write your code here
        Scanner reader = new Scanner(System.in);


        System.out.println("first");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("last");
        int last = Integer.parseInt(reader.nextLine());
        while (first <= last){
            System.out.println(first);
            first++;
        }

    }
}
