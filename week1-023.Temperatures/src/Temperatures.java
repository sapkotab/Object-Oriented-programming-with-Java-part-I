
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        while (true){
            System.out.println("Enter the co-ordinate: ");
            double myCo = Double.parseDouble(reader.nextLine());
            if(myCo >= -30 && myCo <= 40) {
                Graph.addNumber(myCo);
            }
        }
    }
}
