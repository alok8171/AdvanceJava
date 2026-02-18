package alok;

@FunctionalInterface
interface Calc {
    void operation(double a, double b);
}

class Arithmetic {

     Arithmetic()
      {
        System.out.println("this is constructor");
    }

    Arithmetic(double  n1,double n2)
    {
System.out.println(n1-n2);
    }

    

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}

public class methodRef {

    public static void main(String[] args) {

        // Calc addRef = Arithmetic::add;
        // Calc subRef = Arithmetic::subtract;
        // Calc mulRef = Arithmetic::multiply;
        // Calc divRef = Arithmetic::divide;

        // System.out.println("Add: " + addRef.operation(10, 5));
        // System.out.println("Subtract: " + subRef.operation(10, 5));
        // System.out.println("Multiply: " + mulRef.operation(10, 5));
        // System.out.println("Divide: " + divRef.operation(10, 5));
        Calc a1=Arithmetic::new;
        a1.operation(71,52 );
    }
}
