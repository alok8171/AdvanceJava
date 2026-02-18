import java.util.ArrayList;

class Student {
    private int sid;
    private String name;
    private String course;

    public Student(int sid, String name, String course) {
        this.sid = sid;
        this.name = name;
        this.course = course;//class object para based
    }
     @Override
    public String toString() {
        return sid + " " + name + " " + course;
    }
}

public class StudentMain {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", "Java"));
        students.add(new Student(2, "Ankit", "Python"));
        students.add(new Student(3, "Neha", "C++"));
        students.add(new Student(4, "Pooja", "DBMS"));
        students.add(new Student(5, "alok", "DSA"));

        for (Student s : students) {
            System.out.println(s);   // toString() automatically call hoga
        }
    }
}

