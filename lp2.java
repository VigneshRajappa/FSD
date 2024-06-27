import java.util.Scanner;
class lp2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=0;j<=a-i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}
			