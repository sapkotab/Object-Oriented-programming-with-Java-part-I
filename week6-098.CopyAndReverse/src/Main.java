import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }

    public static int[] copy(int[] array){
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i]=array[i];
        }
        return temp;
    }
    public static int[] reverseCopy(int[] array){
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i]=array[array.length-i-1];
        }
        return temp;
    }
}
