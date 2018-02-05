public class bird {
    private String name;
    private String latinName;
    private int observed;

    public bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }
    public bird(String name){
        this(name,"");
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObserved() {
        return observed;
    }

    public void incObserved (){
        observed++;
    }
    public String toString() {
        return name+"("+ latinName + "): "+ observed +" observations";
    }
}
