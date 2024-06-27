import java.util.Scanner;
class eve{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int i=1;
		if(a%2!=0)
		{
			a+=1;
		}
		while(i<=c)
		{
			
				System.out.println(a);
				a+=2;
			i++;
		}
	}
}