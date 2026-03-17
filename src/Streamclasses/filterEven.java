package Streamclasses;
import java.util.*;

import java.util.Arrays;
import java.util.List;

public class filterEven {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(10,15,20,25,30,11,17,16);
        System.out.println(data);

        data.stream().filter((n)->n%2==0).forEach((n)->System.out.print(n+" "));

    }
}
