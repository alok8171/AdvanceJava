package Streamclasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceEx {
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(34,12,45,56,78,43,49);
//        double avg =list.stream().reduce(0, (a,b)->a+b)/list.size();
//        System.out.println("Avg="+avg);
//    }


    //write a java program to find the sum of all using reduce()[10,20,30,40,50]

//    public static void main(String[] args) {
//              List<Integer> list = Arrays.asList(10,20,30,40,50);
//              int sum=list.stream().mapToInt(n->n).sum();
//              System.out.println(sum);
//    }

    //write java program to find smallest element in list using reduced
    //public static void main(String[] args) {
            //          List<Integer> list = Arrays.asList(10,20,30,40,50);
                     // int min=list.stream().min(Integer::compareTo).get();
                     // System.out.println(min);
        //maximum element
//        int max= list.stream().reduce(Integer.MIN_VALUE, (a, b) -> a >b ? a : b);
//        System.out.println(max);

    //count element in list
//    public static void main(String[] args) {
//                  List<Integer> list = Arrays.asList(10,20,30,40,50);c
//                  int count=list.stream().reduce(0, (a,b)->a+1);
//                  System.out.println("count="+count);
//    }

    //java program to convert list elements into a single string using reduced().
//    public static void main(String[] args) {
//                List<String> list = Arrays.asList("java","Stream","API","Reduce");
//                String result=list.stream().reduce("",(a,b)->a+" "+b);
//                System.out.println(result);
//    }

//    public static void main(String[] args) {
//                         List<Integer> list = Arrays.asList(1,2,3,4,5);
//                    int squares=list.stream().mapToInt(n->n*n).sum();
//                    System.out.println(squares);
//    }

    //second highest element
//    public static void main(String[] args) {
//               List<Integer> list = Arrays.asList(10,20,30,40,50);
//        int min= list.stream().reduce(Integer.MAX_VALUE, (a, b) -> a <b ? a : b);
//        int secmin = list.stream().filter(x -> x != min)
//                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
//        System.out.println(secmin);
//
//    }

    //FIND LONGEST STRING
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("java","Stream","API","Reduce");
//        String longest = list.stream()
//                .reduce("", (a, b) -> a.length() > b.length() ? a : b);
//
//        System.out.println("Longest String = " + longest);
//    }
    // write a java program to find the total sum of digits using reduce().[12,34,56,78]
//    public static void main(String[] args) {
//       // int num = 123456;
//        int num = 123456;
//
//        int sum = String.valueOf(num)
//                .chars()                     // stream of characters
//                .map(c -> c - '0')          // char → digit
//                .reduce(0, (a, b) -> a + b);
//
//        System.out.println("Sum of digits = " + sum);
//
//
//
//
//    }

    public static void main(String[] args) {
        int n=5;
        int fact= IntStream.rangeClosed(1,n).reduce(0,(a, b)->a*b);
        System.out.println(fact);
    }
}
