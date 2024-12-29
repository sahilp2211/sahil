
public class GradingClass {
    public static void main(String[] args) {

        /*
        100-90 -A+
        90-80 - A
        80-70 - B+
        70-60 - B
        60-50 - C+
        50-40 - C
        40-00 - FAIL
         */

        int marks = 75;

        if (marks <= 40) {
            System.out.println("YOU'RE FAIL");
        } else if ((marks > 40) && (marks <= 50)) {
            System.out.println("score is C");
        } else if ((marks > 50) && (marks <= 60)) {
            System.out.println("score is C+");
        } else if ((marks > 60) && (marks <= 70)) {
            System.out.println("score is B");
        } else if ((marks > 70) && (marks <= 80)) {
            System.out.println("score is B+");
        } else if ((marks > 80) && (marks <= 90)) {
            System.out.println("score is A");
        } else {
            System.out.println("score is A+");
        }
    }
}




