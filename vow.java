import java.util.Scanner;//Importing Scanner
class vow{//Class Function
	public static void main(String[]args)//Main function with String arguments
	{
		Scanner sc=new Scanner(System.in);//Scanner class Declaration
		char ch=sc.next().charAt(0);//declaring character in the name ch
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')// checking condition with the character of a,e,i,o,u
		{
			System.out.println("Is a vowel");
		}
		else
		{
			System.out.println("Not a vowel");
		}
	}
}