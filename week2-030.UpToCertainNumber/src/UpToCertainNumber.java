
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        Scanner reader = new Scanner(System.in);

        int x = 1;
        System.out.println("upto what number?");
        int upto = Integer.parseInt(reader.nextLine());
        while (x <= upto){
            System.out.println(x);
            x++;
        }
    }
}
