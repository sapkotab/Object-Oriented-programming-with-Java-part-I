public class Counter {
    int startValue;
    boolean check;


    public Counter(int startingValue, boolean check){
        this.startValue = startingValue;
        this.check = check;
//        if(check) {
//            if (this.startValue < 0) {
//                this.startValue = 0;
//            }
//        }
    }

    public Counter(int startingValue){
        this(startingValue,false);
    }

    public Counter(boolean check){
        this(0,check);
    }

    public Counter(){
        this(0,false);
    }

    public int value(){
        return this.startValue;
    }

    public void increase(){
        this.increase(1);
    }

    public void increase(int number){
        if(number > 0) {
            this.startValue += number;
        }
    }
    public void decrease(){
        this.decrease(1);
    }
    public void decrease(int number){
        if(number > 0) {
            this.startValue -= number;
        }
        if(check) {
            if (this.startValue < 0) {
                this.startValue = 0;
            }
        }
    }

}
