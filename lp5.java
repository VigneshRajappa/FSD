import java.util.Scanner;
class lp5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int m=a/2;
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				if(i==j)
				{
					System.out.print("# ");
				}
				else if(j==(a-i-1))
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}