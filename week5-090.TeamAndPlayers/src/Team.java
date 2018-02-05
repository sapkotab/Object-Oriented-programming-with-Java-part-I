import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name){
        this.name = name;
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }

    public void addPlayer(Player newPlayer){
        if(players.size() < maxSize) {
            players.add(newPlayer);
        }
    }

    public void printPlayers(){
        for (Player x: players) {
            System.out.println(x.getName() + ", goals "+ x.goals());
        }
    }

    public int goals(){
        int temp = 0;
        for (Player x: players) {
            temp += x.goals();
        }
       return temp;
    }
}
