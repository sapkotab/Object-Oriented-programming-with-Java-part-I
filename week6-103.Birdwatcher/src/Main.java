import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        String command = "";
        birdData myBirds = new birdData();
        while (!command.equals("Quit")){
            System.out.print("? ");
            command = reader.nextLine();
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                bird x = new bird(name,latinName);
                myBirds.Add(x);
            }else if (command.equals("Observation")) {
                System.out.println("What was observed:? ");
                String name = reader.nextLine();
                bird x = new bird(name);
                boolean found = myBirds.Observation(x);
                if (!found) {
                    System.out.println("Is not a bird!");
                }
            }else if (command.equals("Statistics")) {
                myBirds.Statistics();
            }else if (command.equals("Show")) {
                System.out.print("What? ");
                String name = reader.nextLine();
                bird x = new bird(name);
                myBirds.Show(x);
            }

        }
            
    }

}
