import java.util.Scanner;
class che{
	public static void main(String[]args)	
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println("Is a Digit");
		}
		else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("Is a Alphabet");
		}	
		else
		{
			System.out.println("Is a symbol");
		}
	}
}	