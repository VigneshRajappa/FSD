import java.util.Scanner;
class pro{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i=1,temp=1;
		while(t!=0)
		{
			i=t%10;
			t=t/10;
			temp=i*temp;
		}
		System.out.println(temp);
	}
}