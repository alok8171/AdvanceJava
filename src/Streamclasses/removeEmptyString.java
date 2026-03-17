package Streamclasses;
import java.util.*;

import java.util.Arrays;
import java.util.List;

public class removeEmptyString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("ALOK","","PYTHON","","C#");
        List<String> list1=  list.stream().filter((n)->n.length()!=0).toList();
        System.out.println(list1);
    }
}
///distict number greator than 20
//string contains o