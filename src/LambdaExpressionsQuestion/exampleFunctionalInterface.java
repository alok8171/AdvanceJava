package LambdaExpressionsQuestion;
import java.util.*;

@FunctionalInterface
interface ISample
{
    public void print();
}

class MySample implements ISample
{
    @Override
    public void print() {
        System.out.println("Hello World");
    }
}
public class exampleFunctionalInterface {
    public static void main(String[] args) {
        MySample s=new MySample();
        s.print();
    }
//    public static void doPrinting(ISample ms)    //both works
//    {
//        ms.print();
//    }
}
