import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        Scanner reader = new Scanner(System.in);

        int x = 2;
//        System.out.println("upto what number?");
//        int upto = Integer.parseInt(reader.nextLine());
        while (x <= 100){
            System.out.println(x);
            x += 2;
        }
    }
}
