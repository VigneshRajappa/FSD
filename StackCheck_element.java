import java.util.Scanner;
import java.util.Stack;
public class StackCheck_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
	    boolean flag=false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            stack.push(c);
        }
        for(int i=0;i<s.length();i++)
        {
            char n=stack.pop();
	    
            if(n==ch)
            {
                flag=true;
            }
        }
	if(flag)
	{
		System.out.println("Found");
	}
	else
	{
		System.out.println("Not Found");
	}
    }
}
