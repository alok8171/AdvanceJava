
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//package streamapi;

public class StreamAPI
{
  public static void main(String[] args) {
    ArrayList <Integer> list=new ArrayList<>();

    list.add(10);
    list.add(15);
    list.addAll(List.of(10,24,47,67,54,53));
   // System.out.print(list);
    Stream listStream=list.stream(); 
  //  System.out.println(listStream);
  list.stream().filter(n->n>60).forEach((element)->System.out.print(element+" "));
  System.out.println( "Count=" +list.stream().filter((item)->item > 60 ).count());
 // list.stream().forEach(System.out::println);
  }
}
