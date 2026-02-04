interface Area{
    double PI=3.14;
    double getArea();
}


class circle implements Area{
    double r;
    circle(double r)
    {
        this.r=r;
    }
public double getArea()
{
    return (PI*r*r);
}
public void  displayArea()
{
    System.out.println(this.getArea());
}
}


public class AreaMain {
   public static void main(String[] args) {
            circle c1=new circle(14.5);
            System.out.println(c1.getArea()); 
            Area r1=new Area() {
                public double getArea()
                {
                    int l=10,b=40;
                    return (l*b);
                }
            }; 
            System.out.println("area of rectangle"+r1.getArea());  
   }
}
