import java.util.Scanner;
import java.util.Stack;

public class balancingparanthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') 
				stack.push(ch);
			else {
				if(stack.isEmpty()) {
					System.out.println("Unbalanced");
					stack.push('}');
					break;
				}
				if(ch==')') {
					char top=stack.pop();
					if(top!='(') {
						System.out.println("Unbalanced");
						break;
					}
				}
				if(ch=='}') {
					char top=stack.pop();
					if(top!='{') {
						System.out.println("Unbalanced");
						break;
					}
				}
				if(ch==']') {
					char top=stack.pop();
					if(top!='[') {
						System.out.println("Unbalanced");
						break;
					}
				}
			}
		}
		if(stack.isEmpty()) 
			System.out.println("Balanced");

        }
    }

