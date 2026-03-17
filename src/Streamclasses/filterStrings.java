package Streamclasses;
import java.util.*;

import java.util.ArrayList;

public class filterStrings {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Amit");
        list.add("ravi");
        list.add("vikas");
        list.add("Akash");
        System.out.println(list);
        list.stream().filter((n)->n.charAt(0)=='A').forEach((n)->System.out.println(n+" "));

    }
}
