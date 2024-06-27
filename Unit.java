import java.util.Scanner;
class Unit{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<=200)
		{
			System.out.println("Free");
		}
		
		else if(a<=300)
		{
			a=a-200;
			double val=a*1.2;
			System.out.println(val);
		}
		else if(a<=400)
		{
			a=a-300;
			double val=(a*1.5)+120;
			System.out.println(val);
		}
		else if(a<=500)
		{
			a=a-400;
			double val=(a*2)+120+150;
			System.out.println(val);
		}
		else if(a>500)
		{
			a=a-500;
			double val=(a*5)+470;
			System.out.println(val);
		}
		
	}
}