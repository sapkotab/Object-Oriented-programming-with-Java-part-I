import java.security.PublicKey;
import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        starsInLastPrint = 0;
    }

    public NightSky(int width, int height){
        this(0.1,width,height);
    }
    public NightSky(double density){
        this(density,20,10);
    }

    public void printLine(){
        for (int i = 0; i < width; i++) {
            Random random = new Random();
            double x =random.nextDouble();
            if (x <= density){
                System.out.printf("*");
                starsInLastPrint++;
            }else {
                System.out.printf(" ");
            }
        }
        System.out.println("");
    }

    public void print(){
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint(){
        int x = starsInLastPrint;
        this.starsInLastPrint = 0;
        return x;
    }

}
