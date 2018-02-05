import java.util.ArrayList;
import java.util.Scanner;

class grade {
    private ArrayList<Integer> grades;
    private Scanner reader;
    private int[] gradeCount = new int[6];
    private double acceptanceRate;

    public grade(Scanner reader){
        this.reader=reader;
        this.grades= new ArrayList<Integer>();
        for (int i = 0; i < gradeCount.length; i++) {
            gradeCount[i]=0;
        }
        acceptanceRate = 0;
    }

    public void collect(){
        System.out.println("Type exam scores, -1 completes: ");
        int temp =Integer.parseInt(reader.nextLine());
        while (temp != -1){
            if(temp >= 0 && temp <= 60) {
                grades.add(temp);
            }
            temp = Integer.parseInt(reader.nextLine());
        }
    }

    public void countAndAcceptacePercent(){
        for (int a: grades) {
            if(a < 30){
                gradeCount[0]++;
            } else if (a < 35){
                gradeCount[1]++;
            }else if (a < 40){
                gradeCount[2]++;
            }else if (a < 45){
                gradeCount[3]++;
            }else if (a < 50){
                gradeCount[4]++;
            }else {
                gradeCount[5]++;
            }
        }

        int temp = 0;
        for (int i = 1; i < gradeCount.length; i++) {
            temp +=gradeCount[i];
        }
        acceptanceRate = 100*(double)temp/(temp + gradeCount[0]);
    }


    public void print(){
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i+": ");
            for (int j = 0; j < gradeCount[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Acceptance percentage: "+acceptanceRate);
    }
}
