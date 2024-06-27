import java.util.Scanner;
import java.util.Stack;
public class StackInfix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='0' && c<='9')
            {
                stack.push(c-'0');
            }
            else{
                int n=stack.pop();
                int n1=stack.pop();
                if(c=='+')
                {
                    
                    stack.push(n+n1);
                }
                else if(c=='-')
                {
                    stack.push(n-n1);
                }
                else if(c=='*')
                {
                    stack.push(n*n1);
                }
                else
                {
                    stack.push(n/n1);
                }
            }
        }
        System.out.println(stack);
    }
}
