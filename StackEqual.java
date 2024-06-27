import java.util.Scanner;
import java.util.Stack;
public class StackEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        int count=1;
        System.out.println("Enter Stack 1 Elements :");
        for(int i=0;i<5;i++)
        {
            stack1.push(sc.nextInt());
        }
        System.out.println("Enter 2nd Stack Elements : ");
        for(int i=0;i<5;i++)
        {
            stack2.push(sc.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            int n=stack1.get(i);
            int n1=stack2.get(i);
            if(n==n1)
            {
                count++;
            }

        }
        if(count>5)
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
