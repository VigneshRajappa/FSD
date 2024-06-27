import java.util.Scanner;
import java.util.Stack;
public class StackSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements : ");
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<5;i++)
        {
            stack.push(sc.nextInt());
        }
        int n=stack.pop();
        int n1=stack.pop();
        stack.push(n);
        stack.push(n1);
        System.out.println("After Swapping :");
        for(int i=0;i<5;i++)
        {
            System.out.print(stack.get(i)+" ");
        }

    }
}
