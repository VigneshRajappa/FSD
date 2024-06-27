import java.util.Scanner;
class Ta{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int l=sc.nextInt();
		int i=1;
		while(i<=l)
		{
			System.out.println(l+" * "+t+" = "+l*t);
			l--;
		}
	}
}