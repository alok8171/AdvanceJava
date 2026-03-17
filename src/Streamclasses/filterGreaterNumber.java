package Streamclasses;
import java.util.*;

import java.util.ArrayList;

public class filterGreaterNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(45);
        list.add(90);
        list.add(30);
        list.add(24);
        list.add(50);
        list.add(76);
        System.out.println(list);
        list.stream().filter((n)->n>60).forEach(System.out::println);
    }
}
