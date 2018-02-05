
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        this.sum +=number;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }
    public int sum() {
        // code here
        return this.sum;
    }

    public double average() {
        // code here
        if(amountOfNumbers == 0){
            return 0;
        }
        return ((double)this.sum)/this.amountOfNumbers;
    }
}
