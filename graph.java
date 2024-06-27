import java.util.Scanner;
class graph{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>0 && y>0)
		{
			System.out.println("A");
		}
		else if(x>0 && y<0)
		{
			System.out.println("B");
		}
		else if(x<0 && y<0)
		{


			System.out.println("C");
		}
		else
		{
			System.out.println("D");
		}
	}
}