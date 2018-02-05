public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int i = amount;
        while (i > 0){
            System.out.print("*");
            i--;
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int i = sideSize;
        while (i > 0){
            printStars(sideSize);
            i--;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int time = height;
        while (height > 0){
            printStars(width);
            height--;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int time = size;
        while (time > 0){
            printStars(size - time + 1);
            time --;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
