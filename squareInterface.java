// @FunctionalInterface
interface Calc {
    String vote(int n1);
}

public class squareInterface {
    public static void main(String[] args) {

        Calc a1 = n1 -> {
            if (n1 > 18) {
                return "You can vote";
            } else {
                return "You cannot vote";
            }
        };
        

        String result = a1.vote(19);
        System.out.println(result);
    }
    
}//next period kis chiz ka hai?
