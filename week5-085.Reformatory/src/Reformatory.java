public class Reformatory {

    private int weightCount;
    Reformatory(){
        weightCount = 0;
    }
    public int weight(Person person) {
        // return the weight of the person
        this.weightCount++;
        return person.getWeight();

    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return weightCount;
    }

}
