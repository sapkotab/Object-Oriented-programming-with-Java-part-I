import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        // indexes:    0  1  2  3   4
        int[] values = {3, 2, 5, 4, 8};

        System.out.println( Arrays.toString(values) );

        swap(values, 1, 0);
        System.out.println( Arrays.toString(values) );

        swap(values, 0, 3);
        System.out.println( Arrays.toString(values) );
    }

    public static int smallest(int[] array) {
        // write the code here
        int[] temp = new int[array.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i]= array[i];
        }
        sort(temp);
        return temp[0];
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int smallest = Integer.MAX_VALUE;
        int smallIndex = 0;
        for (int i = 0; i< array.length; i++ ) {
            if (array[i] < smallest){
                smallest = array[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        // code goes here
        int smallest = Integer.MAX_VALUE;
        int smallIndex = index;
        for (int i = index; i< array.length; i++ ) {
            if (array[i] < smallest){
                smallest = array[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfTheSmallestStartingFrom(array,i);
            swap(array,i,smallestIndex);
        }
    }

}
