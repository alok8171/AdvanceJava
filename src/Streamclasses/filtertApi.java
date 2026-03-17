package Streamclasses;
import java.util.*;


import java.util.ArrayList;

public class filtertApi {
    public static void main(String[] args)
    {
        List<Integer> data=Arrays.asList(24,45,47,15,23,89,54);
        System.out.println(data);
        List <Integer> list=new ArrayList<Integer>();
        list.add(24);
        list.add(41);
        list.addAll(List.of(21,41,42,67,89,45));
        list.addAll(data);
        System.out.println(list);
        list.stream().filter((n)->n>60).forEach((n)->System.out.println(n+" "));
        List<Integer> g60=list.stream().filter((n)->n>60 &&n<90).toList();
        System.out.println();
        System.out.println(g60);

    }
}
