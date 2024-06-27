import java.util.Scanner;
class pri{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2,count=0;
		while(true)
		{
			int j=2,c=0;
			while(j<i){
				if(i%j==0){
					c++;
					break;
				}
				j++;
			}
			if(c==0)
			{
				if(count%2==0){
					System.out.println(i);
				}
				if(count==n-1)
				{
					break;
				}
				else
				{
					count++;
				}
			}
			i++;
		}
	}
}