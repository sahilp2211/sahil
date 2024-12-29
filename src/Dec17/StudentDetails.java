package Dec17;

public class StudentDetails {

    String name;
    String age;
    String grade;
    String course;

    public StudentDetails() {
        System.out.println("default constructor");
    }

    public StudentDetails(String name) {
        //this("Mark", "26", "95");
        this.name = name;
    }

    public StudentDetails(String name, String age) {
       // this("Mark");
        this.name = name;
        this.age = age;
    }

    public StudentDetails(String name, String age, String grade) {
       // System.out.println("hello I am constructor 3.");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public StudentDetails(String name, String age, String grade, String course) {
        //this("Mark", "26");
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.course = course;
    }
}
