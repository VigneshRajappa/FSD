import java.util.Scanner;
class Al{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(a<=b)
		{
			if(a%3==0)
			{
				System.out.println("Hii");
			}
			else if(a%5==0)
			{
				System.out.println("Hello");
			}
			else
			{
				System.out.println(a);
			}
			a++;
		}
	}
}