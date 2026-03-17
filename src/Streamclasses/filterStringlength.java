package Streamclasses;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class filterStringlength {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("ALOK","JAVA","PYTHON","NODEJS","C#");
       // ArrayList<String> data=new ArrayList<>();
      // list.addAll(list);
      // System.out.println(data);
        list.stream().filter((n)->n.length()>4).forEach((n)->System.out.println(n+" "));

    }
}
