interface Calc
{
    void calculate(int n1, int n2);
    default void calculate(int n1,int n2, int n3)
    {
        int s=n1+n2+n3;
        System.out.println("Sum"+s);
    }
    static void getinfo()
    {
        System.out.println("static");
        
    }
}
class calculator implements  Calc
{
    public void calculate(int n1, int n2)
    {
        int s=n1+n2;
        System.out.println("sum="+s);
    }

}

public class calculateInterface{
    
    public static void main(String[] args) {
        calculator c=new calculator();
        c.calculate(41,14);
    }
}
