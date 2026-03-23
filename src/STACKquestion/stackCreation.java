package STACKquestion;
import java.util.*;

class MyStack {
    static int[] stack;
    static int top = -1;

    MyStack(int size){
        stack = new int[size];
    }

    static void push(int data){
        if(top == stack.length - 1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = data;
    }

    static int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = stack[top];
        top--;
        return val;
    }

    static void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i = top; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class stackCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack st = new MyStack(10);

        while(true){
            int n = sc.nextInt();

            switch(n){
                case 1:
                    int val = sc.nextInt();
                    st.push(val);
                    break;

                case 2:
                    System.out.println(st.pop());
                    break;

                case 3:
                    st.display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid");
            }
        }
    }
}