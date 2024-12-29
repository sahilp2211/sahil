package Dec03;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.Student("sahil","sahil2204@gmail.com","java");

        System.out.println("name:" + (student.name) + "  email:" + (student.email));
        System.out.println(student.email);
        System.out.println(student.course);
        System.out.println(student.name + "   "+ student.email);
    }
}
