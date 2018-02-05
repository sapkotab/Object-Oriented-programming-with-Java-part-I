
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        this.value++;
        if(this.value > upperLimit){
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        if(this.value < 10){
            return "0"+this.value;
        }
        return ""+this.value;
    }

    public int getValue() {
        // write here code that returns the value
        return this.value;
    }

    public void setValue(int myVal){
        if(myVal >= 0 && myVal <= this.upperLimit){
            this.value = myVal;
        }
    }
}
