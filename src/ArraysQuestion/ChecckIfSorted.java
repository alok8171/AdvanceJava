package ArraysQuestion;

public class ChecckIfSorted {
    public static void main(String[] args) {

        int[] arr={12,14,16,23,47,52};
        boolean flag=true;
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    flag=false;
                    break;
                }
            }
        }
        if(flag==true)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }



    }
}
