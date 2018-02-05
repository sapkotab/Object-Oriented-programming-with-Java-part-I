import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;

    // Initialize the variable
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String x = "";
        for (int i = 0; i < length; ++i){
            x +="abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
        }
        return x;
    }
}
