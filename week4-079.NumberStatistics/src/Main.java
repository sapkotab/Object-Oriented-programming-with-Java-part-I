import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics x = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");
        int temp = Integer.parseInt(reader.nextLine());
        while (temp != -1){
            x.addNumber(temp);
            if (temp % 2 == 0) {
                even.addNumber(temp);
            }else {
                odd.addNumber(temp);
            }
            temp = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Sum: "+ x.sum());
        System.out.println("Sum of even: "+even.sum());
        System.out.println("Sum of odd: "+odd.sum());

    }
}
