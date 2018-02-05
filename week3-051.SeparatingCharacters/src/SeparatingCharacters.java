
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int length = name.length();
        int counter = 0;
        while (counter < length){
            System.out.println((counter+1) + ". character: "+name.charAt(counter));
            counter++;
        }
    }
}
