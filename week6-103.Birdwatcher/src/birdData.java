import java.util.ArrayList;

public class birdData {
    private ArrayList<bird> birds;

    public birdData(){
        birds = new ArrayList<bird>();
    }

    public void Add(bird b){
        birds.add(b);
    }

    public boolean Observation(bird b){
        boolean found = false;
        for (bird x: birds) {
            if (x.getName().equals(b.getName())){
                x.incObserved();
                found = true;
                break;
            }
        }
        return found;
    }

    public void Statistics(){
        for (bird x: birds ) {
            System.out.println(x);
        }
    }

    public void Show(bird b){
        for (bird x:
             birds ) {
            if (x.getName().equals(b.getName())){
                System.out.println(x);
            }
        }
    }


}
