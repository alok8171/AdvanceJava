import java.util.*;
class Sum{
        
        Sum(int a,int b)
         {
           
         System.out.println((a+b));
        }
    }
    class divide
    {
        void result(int a,int b)
        {
            System.out.println(a/b);
        }
    }
// design question parameter passing in constructor and passing parameter in function

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 number");
        int a=sc.nextInt();
        System.out.println("enter 2 number");
        int b=sc.nextInt();
       Sum s=new Sum(a,b);
       divide d=new divide();
       d.result(a, b);

    }

}
    