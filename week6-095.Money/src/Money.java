
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added){
        Money temp = new Money(this.euros+added.euros,this.cents+added.cents);
        return temp;
    }

    public boolean less(Money compared){
        if(this.euros < compared.euros){
            return true;
        }
        return this.euros == compared.euros && this.cents < compared.cents;

    }

    public Money minus(Money decremented){
        int tempEuro = this.euros-decremented.euros;
        int tempCent = this.cents-decremented.cents;
        if(tempCent < 0 && tempEuro > 0){
            tempCent += 100;
            tempEuro -= 1;
        }else {
            tempCent = 0;
        }
        if(tempEuro < 0){
            tempEuro = 0;
        }
        Money temp = new Money(tempEuro,tempCent);
        return temp;
    }

}
