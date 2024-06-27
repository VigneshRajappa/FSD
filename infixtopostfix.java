import java.util.Scanner;
import java.util.Stack;

public class infixtopostfix {
    static int priority(char c)
    {
        int n=0;
        switch(c)
        {
            case '$':
            case '^':
                n=4;
                break;
            case '*':
            case '/':
                n=3;
                break;
            case '+':
            case '-':
                n=2;
                break;
            case '=':
                n=1;
                break;
            default:
                n=0;
                break;
    }
    return n;
}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack<Character> stack=new Stack<>();
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isAlphabetic(ch) || Character.isDigit(ch))
            {
                System.out.println(ch+" ");
            }
            else
            {
                if(ch=='(')
                stack.push(ch);
                else if(ch==')')
                {
                    char a=')';
                    while(a!=')')
                    {
                        a=stack.pop();
                        if(a!='(' && a!=')')
                        {
                            System.out.println(a+" ");
                        }
                    }
                    else
                    {
                        
                        if (ch == '(') {
                            stack.push(ch);
                        } else if (ch == ')') {
                            char a = ')';
                            while (a != '(') {
                                a = stack.pop();
                                if(a!='('&&a!=')')
                                System.out.print(a+" ");
                            }
                        } else {
                                int f=priority(stack.peek());
                                int se=priority(ch);
                                if(f<se)
                                    stack.push(ch);
                                else{
                                    System.out.print(stack.pop()+" ");
                                    stack.push(ch);
                                }
        
                        }
        
                    }
                }
            }
        }
    }
}

