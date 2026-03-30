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
        empList.stream()
                .collect(Collectors.toMap(
                        Employee1::getName,   // key (duplicate remove yahin se hoga)
                        e -> e,               // value
                        (e1, e2) -> e1        // duplicate aaye to pehla rakho
                ))
                .values()
                .stream()
                .limit(5)
                .forEach(System.out::println);;
    }
}
