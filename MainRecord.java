//java 16
record  Student(int sid,String name,String course){};
public class MainRecord {
    public static void main(String[] args) {
        
        Student s=new Student(1,"student 1","McA");
        System.out.println(s.sid());
        System.out.println(s.name());
        System.out.println(s.course());
        System.out.println(s);
        

        
    }
}
