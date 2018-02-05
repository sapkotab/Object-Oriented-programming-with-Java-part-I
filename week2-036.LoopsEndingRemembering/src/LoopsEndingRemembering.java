import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int number = 0;
        int result = 0;
        int even = 0;
        int odd = 0;
        System.out.println("type numbers");
        number = Integer.parseInt(reader.nextLine());
        while (number != -1){
            result += number;
            if (number%2 == 0){
                even++;
            }else {
                odd++;
            }
            number = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+ result);
        System.out.println("How many numbers: "+ (even+odd));
        System.out.println("Average: " + (double)result/(even + odd));
        System.out.println("Even numbers: "+ even);
        System.out.println("Odd numbers: "+ odd);
    }
}
