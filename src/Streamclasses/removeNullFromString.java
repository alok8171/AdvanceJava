package Streamclasses;
import java.util.*;

import java.util.ArrayList;

public class removeNullFromString {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("ALOK",null,"PYTHON",null,"C#");
        List<String> list1=  list.stream().filter((n)->n!=null).toList();
        System.out.println(list1);
    }
}
