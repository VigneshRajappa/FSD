import java.util.Scanner;
class pr{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=2;
		int b=0;
		while(i<a)
		{
			if(a%i==0)
			{
				b++;
				break;				
			}
			i++;
		}
		if(b==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
	}
}