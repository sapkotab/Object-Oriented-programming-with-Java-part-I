import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int first = 1;
        int sum = 1;
//        System.out.println("first");
//        int first = Integer.parseInt(reader.nextLine());

        System.out.println("Type a number: ");
        int last = Integer.parseInt(reader.nextLine());
        while ( first <= last){
            sum *= first;
            first++;
        }
        System.out.println("Factorial is " + sum);

    }
}
