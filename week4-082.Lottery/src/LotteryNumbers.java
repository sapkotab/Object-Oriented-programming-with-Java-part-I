import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
//        numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        for (int i = 0; i < 7 ; i++) {
            int randInt = (random.nextInt(39)+1);
            while (this.containsNumber(randInt)){
                randInt = (random.nextInt(39)+1);
            }
            this.numbers.add(randInt);
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        for (int i:numbers) {
            if (numbers.contains(number)){
                return true;
            }
        }
        return false;
    }
}
