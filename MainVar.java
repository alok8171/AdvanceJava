//package java10;
//local variable type inference
public class MainVar {
    public static void main(String[] args) 
    {
        int a=10;
         var b = 20;
        var nam="kiet mca";
        var c=0.0;
        c=36.4;
        String name=new String("this is string");
        var name1=new String("this is string with var");
        int[] arr={1,2,3};
        for(var n: arr)
        {
            System.out.println(n);
        }
    }
}
