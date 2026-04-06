package INTERVIEWquestions;

import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
    int id;
    String name;
    Integer salary;
    int age;
    String department;

    public Employee1(int id, String name, Integer salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public Integer getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
//Sample ArrayList (used in questions)
public class Employee
{
    public static void main(String[] args) {

        ArrayList<Employee1> empList = new ArrayList<>(Arrays.asList(
                new Employee1(101, "Amit", 50000, 25, "IT"),
                new Employee1(102, "Neha", 60000, 28, "HR"),
                new Employee1(103, "Ravi", 45000, 24, "IT"),
                new Employee1(104, "Karan", 70000, 30, "Finance"),
                new Employee1(105, "Pooja", 55000, 27, "HR"),
                new Employee1(106, "Rohit", 80000, 32, "IT"),
                new Employee1(107, "Simran", 65000, 29, "Finance"),
                new Employee1(108, "Amit", 50000, 25, "IT")
                //   Optional<Employee1> result=empList.stream().min((a,b)->a.compareTo(b);
        ));
// find minimum salary wale ka naam?
//        Optional<Employee1> result = empList.stream()
//                .min((a, b) -> (int)(a.getSalary() - b.getSalary()));
//        System.out.println(result);
//        //.find maximum salaary emp name
//        Optional<Employee1> result2 = empList.stream()
//                .max((a, b) -> (int)(a.getSalary() - b.getSalary()));
//        System.out.println(result2);
//        // 3. youngest emp from the list
//        Optional<Employee1> result3= empList.stream()
//                .min((a, b) -> (int)(a.getAge() - b.getAge()));
//        System.out.println(result3);
//        //4. oldest emp name
//        Optional<Employee1> result4 = empList.stream()
//                .max((a, b) -> (int)(a.getAge() - b.getAge()));
//        System.out.println(result4);

//        //5. second highest salary employee
//        Optional<Employee1> result5 = empList.stream()
//                .sorted((a, b) -> b.getSalary() - a.getSalary()) // descending
//                .skip(1)
//                .findFirst();
//        System.out.println(result5);

        //6.  find second lowest salaray employee
//        Optional<Employee1> result6= empList.stream()
//              .sorted((a, b) -> a.getSalary() - b.getSalary()) // descending
//            .skip(1)
//               .findFirst();
//      System.out.println(result6);

        //7.  print the top 3 highest salary employees
//        List<Employee1> top3 = empList.stream()
//                .sorted((a, b) -> b.getSalary() - a.getSalary()) // high → low
//                .limit(3)
//                .toList();
//        System.out.println(top3);

        //8. print the lowest 3 salary
//        List<Employee1> top3 = empList.stream()
//             .sorted((a, b) -> a.getSalary() - b.getSalary()) // high → low
//              .limit(3)
//              .toList();
//      System.out.println(top3);

        //9.remove duplicate employee based on name
//        empList.stream()
//                .collect(Collectors.toMap
//                        ( Employee1::getSalary,e->e,(e1,e2)->e1))
//                .values()
//                .forEach(System.out::println);
        //11.find the employee with the minimum salary in IT department
//        Optional<Employee1> result = empList.stream()
//                .filter(x -> x.getDepartment().equals("IT")) // correct comparison
//                .min(Comparator.comparing(Employee1::getSalary));
//        result.ifPresent(e -> System.out.println(result));

        //12. find the employee with the maximum salary in HR department
//        Optional<Employee1> result = empList.stream()
//              .filter(x -> x.getDepartment().equals("HR")) // correct comparison
//                .max(Comparator.comparing(Employee1::getSalary));
//       result.ifPresent(e -> System.out.println(result));

        //13.FIND THE minimum salary employee whose age is greator than 25
//        Optional<Employee1> result = empList.stream()
//            .filter(x -> x.getAge()>25) // correct comparison
//               .min(Comparator.comparing(Employee1::getSalary));
//      result.ifPresent(e -> System.out.println(result));

        //14.  FIND THE max salary employee whose age is greator than 25
//        Optional<Employee1> result = empList.stream()
//         .filter(x -> x.getAge()>25) // correct comparison
//                .max(Comparator.comparing(Employee1::getSalary));
//     result.ifPresent(e -> System.out.println(result));

        //15. print the first 5 employees using stream API
//        List<Employee1> top5= empList.stream().limit(5).toList();
//        System.out.println(top5);

        //16.  skip the first 3 employees and print remaining employees
//               List<Employee1> top5= empList.stream().skip(3).toList();
//               System.out.println(top5);
        //17.  print the top 2 youngest employees
//        List<Employee1> top2 = empList.stream()
//                .sorted(Comparator.comparing(Employee1::getAge)) // small age first
//                .limit(2)
//                .toList();
//        System.out.println(top2);

        //18. skip the first 2 youngest employees and print the next 2 employees
//        List<Employee1> top2 = empList.stream()
//               .sorted(Comparator.comparing(Employee1::getAge))
//                .skip(2)// small age first
//             .limit(2)
//               .toList();
//        System.out.println(top2);
        //

        //19. top 3 highest salry from it department
//        empList.stream().filter(e->e.getDepartment().equals("IT"))
//               .sorted(Comparator.comparing(Employee1::getSalary).reversed())
//                // small age first
//             .limit(3).forEach(System.out::println);

        // System.out.println(top2);
//20. remove duplicate employee and print the first 5 employees
//        empList.stream()
//                .collect(Collectors.toMap(
//                        Employee1::getName,   // key (duplicate remove yahin se hoga)
//                        e -> e,               // value
//                        (e1, e2) -> e1        // duplicate aaye to pehla rakho
//                ))
//                .values()
//                .stream()
//                .limit(5)
//                .forEach(System.out::println);;

        //4.fibd the largest even number using stream API
//        List<Integer> list=Arrays.asList(21,18,33,44,55,60,17);
//        List< Integer> result=list.stream().filter(n->n%2==0).max((a,b)->a-b)).toList());
//        System.out.println(result);
//    }
//}//5. sort the list and remove the first 2 largest value then print the remaining elements
//List<Integer> list=Arrays.asList(10,50,30,20,60,40,70);
//    list.stream().
        //7.find the sum of number between 10 and 40
//        List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
//        int sum = list.stream()
//                .filter(n -> n >= 10 && n <= 40) // 10 se 40 ke beech
//                .reduce(0, (a, b) -> a + b);     // sum
//
//        System.out.println(sum);

        //8 .find the third largest number
       // List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
//        Optional<Integer> result = list.stream()
//                .sorted(Comparator.reverseOrder()) // descending
//                .skip(2)                           // 3rd largest
//                .findFirst();
//
//        System.out.println(result.get());
        // 9.convert numbers into squares and print only the top 4 values
//        List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
//               List<Integer> result = list.stream().map(n->n*n).limit(4).toList();
//               System.out.println(result);


        //10. find the sum of smallest 4 number
//        List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
//        int sum=list.stream().mapToInt(x->x).sum();
//        System.out.println(sum);

        //12. find the smallest odd number greator than 20
//              List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
//              List<Integer> sum=list.stream().filter(n->n%2!=0 && n>20).sorted().toList();
//              System.out.println(sum)
//              ;
        //13. find the product of all number greator than 5
//        List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
//        int prod = list.stream()
//                .filter(n -> n > 5)
//                .reduce(1, (a, b) -> a * b);
//
//        System.out.println(prod);

        //14. sort the list ,skip the first 2 smallest number then find the minimum value
//                     List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
//        int res = list.stream().sorted().skip(2).toList().getFirst();
//        System.out.println(res);

        //17 skip the largest 3 numbers and find the minimum value
        List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
        Optional<Integer> result = list.stream()
                .sorted(Comparator.reverseOrder()) // descending
                .skip(3)                           // skip largest 3
                .min(Integer::compareTo);          // find min

        System.out.println(result.get());

    }
    }

