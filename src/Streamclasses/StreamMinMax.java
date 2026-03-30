package Streamclasses;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class StreamMinMax {
//    public static void main(String[] args) {
//        {
//            List<Integer> list = Arrays.asList(12,1,4,100,200,150,45,67,99);
//            Optional<Integer>result=list.stream().min((a,b)->a-b);
//            result.ifPresent(System.out::println);
//
//        }
//    }
public static void  main(String[] args)
{

    //1. find the minimum number using streamApi
//             List<Integer> list = Arrays.asList(10,20,5,40,15);
//              Optional<Integer>result=list.stream().min((a,b)->a-b);
//               result.ifPresent(System.out::println);

    //2. find maximum number using strramapi
//    List<Integer> list = Arrays.asList(10,20,5,40,15);
//             Optional<Integer>result=list.stream().max((a,b)->a-b);
//           result.ifPresent(System.out::println);

    //3. remove duplicate using api
//    List<Integer> list = Arrays.asList(10,20,5,5,40,15);
//          List <Integer>result=list.stream().distinct().toList();
//        System.out.println(result);

    //4. print first 4 elements using limit()
//    List<Integer> list = Arrays.asList(10,20,5,5,40,15);
//         List <Integer>result=list.stream().limit(4).toList();
//         System.out.println(result);

    //5. skip first 3 elements
//    List<Integer> list = Arrays.asList(10,20,5,5,40,15);
//       List <Integer>result=list.stream().skip(3).toList();
//       System.out.println(result);

    //6.  find second minimum
//    List<Integer> list=Arrays.asList(23,14,1,85,23,76,23,91);
//              System.out.println(list);
//            Integer second=list.stream().sorted(Comparator.reverseOrder()).toList().get(1);
//              System.out.println(second);

    // 9.print lowest 3 number
//    List<Integer> list=Arrays.asList(10,50,30,80,20,90,40);
//    List<Integer> result=list.stream().sorted().limit(3).toList();
//    System.out.println(result);

    //10. remove dplicates and find maximum
//    List<Integer> list=Arrays.asList(10,20,30,40,50,50,30);
//    Optional<Integer> result=list.stream().distinct().max((a,b)->a-b);
//    System.out.println(result);

    //11. skip first 5 elemnt and print next 3
//      List<Integer> list=Arrays.asList(23,14,1,85,23,76,23,91);
//      List<Integer> result=list.stream().skip(5).limit(3).toList();
//    System.out.println(result);
   //12. find mimimum string from arraylist
//    List<String> list=Arrays.asList("ram","shyam","amittt","alok");
//    Optional<String> result=list.stream().min((a,b)->a.compareTo(b));
//    System.out.println(result);

    //13.  find maximum string from arraylist
//    List<String> list=Arrays.asList("ram","shyam","amittt","alok");
//    Optional<String> result=list.stream().max((a,b)->a.compareTo(b));
//    System.out.println(result);

    //14. removes duplicates names from arraylist
       List<String> list=Arrays.asList("ram","shyam","amittt","alok","ram","shyam");
       List <String> result=list.stream().map(n->n).toList();
       System.out.println(result);
}
}

