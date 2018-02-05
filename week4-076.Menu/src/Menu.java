
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String newMenu){
        if (!meals.contains(newMenu)){
            meals.add(newMenu);
        }
    }

    public void printMeals(){
        for (String meal: meals
             ) {
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        meals.clear();
    }
}
