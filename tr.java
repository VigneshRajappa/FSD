import java.util.Scanner;
class tr{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		int t=a1+a2+a3;
		if(t==180)
		{
			System.out.println("It is a triangle");
		}
		else
		{
			System.out.println("It is not a traingle");
		}
	}
}