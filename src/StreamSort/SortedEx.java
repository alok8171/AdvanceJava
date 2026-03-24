package StreamSort;
import java.util.*;
import java.util.stream.IntStream;

//public class SortedEx {
//    public static void main(String[] args) {
//        List <Integer> list=Arrays.asList(23,12,1,45,23,76,26,91);
//        System.out.println(list);
//        List <Integer> list2= list.stream().sorted((a,b)->b-a).toList();// it is valid
//        List<Integer> sortedList=list.stream().sorted(Comparator.reverseOrder()).toList();// it is also valid
//        System.out.println(sortedList);
//        System.out.println(list2);


        //1.sort list in ascending order
//        List<Integer> list=Arrays.asList(23,14,1,85,23,76,23,91);
//        System.out.println(list);
//        List<Integer> sortedList=list.stream().sorted((a,b)->a-b).toList();
//        System.out.println(sortedList);

        //3.sort the list and print top 3 highest number
//        List<Integer> list=Arrays.asList(23,14,1,85,23,76,23,91);
//        System.out.println(list);
//        List<Integer> sortedlist=list.stream().sorted((a,b)->b-a).limit(3).toList();
//        System.out.println(sortedlist);

        //4.sort even number
//        List<Integer> list = Arrays.asList(23, 14, 1, 85, 23, 76, 23, 91);
//        List<Integer> sortedlist = list.stream().sorted().filter(n -> n % 2 == 0).toList();
//        System.out.println(sortedlist);


        //7.second highest
//                List<Integer> list=Arrays.asList(23,14,1,85,23,76,23,91);
//               System.out.println(list);
//               Integer second=list.stream().sorted(Comparator.reverseOrder()).toList().get(1);
//               System.out.println(second);

        //8.sort gretaer than 20
//       List<Integer> list=Arrays.asList(33,14,1,85,23,76,43,91);
//       System.out.println(list);
//       List<Integer> sortedlist = list.stream().sorted().filter(n -> n >20 ).toList();
//       System.out.println(sortedlist);

//    List<String> list = Arrays.asList("ravi", "ankit", "zoya", "meena", "kunal");
//  System.out.println(list);

  // 11.
//        List<String> sortedlist = list.stream().sorted().toList();
//        System.out.println(sortedlist);

        //12.
//  List<String> sortedList=list.stream().sorted((a,b)->b.compareTo(a)).toList();
//  System.out.println(sortedList);

        // 13.
//        List<String> sortedlist=list.stream().sorted((a,b)->b.length()-a.length()).toList();
//        System.out.println(sortedlist);

  //17.
        //List<employee> list=new ArrayList();
        //list.add(new Employee(1,"Alok",200000,"IT");
       // we have 5 elements in the list : like e1,e2,e3,e4 and e5
     //   Sort the list with salary and department value;

        class Employee
        {
            int id;
            String name;
            int salary;
            String dept;

            @Override
            public String toString() {
                return "Employee{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", salary=" + salary +
                        ", dept='" + dept + '\'' +
                        '}';
            }

            Employee(int id, String name, int salary, String dept)
            {
                this.id = id;
                this.name = name;
                this.salary = salary;
                this.dept = dept;
            }


        }
public class SortedEx {
    public static void main(String[] args)
    {
        List<Employee> list=new ArrayList();
        list.add(new Employee(1,"alok",2000,"ai"));
        list.add(new Employee(2,"bob",3000,"mca"));
        list.add(new Employee(3,"alokraj",2000,"mba"));

        List<Employee> list2=list.stream().sorted(((e1,e2)->e1.salary-e2.salary)).toList();
        System.out.println(list2);

    }
}

