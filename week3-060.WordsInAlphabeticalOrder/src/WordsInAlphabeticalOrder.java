
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a letter: ");
        String word = reader.nextLine();
        while (word.length() > 0){
            words.add(word);
            System.out.println("Type a letter: ");
            word = reader.nextLine();
        }
        System.out.println("You typed the following words: ");
        Collections.sort(words);
        for (String myWord: words) {
            System.out.println(myWord);
        }
    }
}
