package ASSIGNMENT;
/*
7. Classroom Attendance Tracker
You are building a system for a school to track student attendance. Create a Java program that:
• Uses an array to store the names of students present in the class on a particular day.
• Allows the user to enter a student's name and check if they attended the class.
 */
import java.util.Arrays;
import java.util.Scanner;

public class ClassRoom {
    public static void main(String[] args) {

        String[] Students = {"Mike","Peter","John","Sara","Veronica","Tonny"};

        ClassRoom s1 = new ClassRoom();
        System.out.println("Students of classroom: " + Arrays.toString(Students));
        s1.attendance();

    }

    String[] Students = {"Mike","Peter","John","Sara","Veronica","Tonny"};

    public void attendance(){
    System.out.println();
    System.out.println("Enter name to check attendance: ");
    Scanner scanner = new Scanner(System.in);
    String StudentName = scanner.next();
    for (int i = 0; i < 6; i++) {
        if(Students[i].equals(StudentName)){
            System.out.println(StudentName + " is present.");
            return;
        } else if (Students[i] != (StudentName)) {
            System.out.println(StudentName + " is not student of classroom.");
            return;
        }
    }
    System.out.println(StudentName + " is absent.");
    }
}
