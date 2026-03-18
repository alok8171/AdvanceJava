import java.util.*;

public class StreamApiEx1 {
    public static void main(String[] args) {
        ArrayList <String> list= new ArrayList<String>();
        list.add("alok");
        list.add("aman");
        list.add("arpit");
        list.add("aryan");
       // list.stream().forEach((element)->System.out.print(element+" "));
        list.stream().forEach(System.out::println);
       System.out.println( "Count=" +list.stream().count());

    }
}
