package Streamclasses;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;
//date 18-03-2026

class Student
{
    String name;
    int marks;
    public Student(String name,int marks)
    {
        this.name=name;
        this .marks=marks;
    }
//    public void display()
//    {
//        System.out.println("Name: "+name);
//        System.out.println("Marks: "+marks);
//    }
    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks;
    }

}

public class filterstudentDataClass {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Jack",10));
        students.add(new Student("alok",74));
        students.add(new Student("aman",64));
        students.add(new Student("atul",62));
        students.add(new Student("arpit",72));

      //  students.stream().filter(s->s.marks>60).forEach(s->s.display()).toList();

List<Student> result=students.stream().filter(s->s.marks>60).toList();
System.out.println(result+" ");
    }
}
