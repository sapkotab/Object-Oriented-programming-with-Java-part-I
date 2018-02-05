public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int x = amount;
        while (x > 0){
            System.out.print("*");
            x--;
            // 40.1
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        int x = amount;
        while (x > 0){
            System.out.print(" ");
            x--;
            // 40.1
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int whiteSpace = size -1;
        int time = size;
        while (time > 0){
            printWhitespaces(whiteSpace);
            printStars(size - whiteSpace);
            whiteSpace--;
            time--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        // 40.2
        int whiteSpace = height -1;
        int time = height;
        int star = 1;
        while (time > 0){
            printWhitespaces(whiteSpace);
            printStars(star);
            whiteSpace--;
            time--;
            star += 2;
        }
        printWhitespaces((star-5)/2);
        printStars(3);
        printWhitespaces((star-5)/2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
