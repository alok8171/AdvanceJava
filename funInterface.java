@FunctionalInterface   // only one abstract method
interface Calc {
   // int calculate(int n1, int n2);
    void calculate(int n1,int n2);

    
}

public class funInterface {
    public static void main(String[] args) {

      Calc a1=(int n1,int n2)->
      {
        // int a=12;
        // int b=13;
        System.out.println("sum = "+(n1+n2));
      };
      a1.calculate(10,12);
    }
}
