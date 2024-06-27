import java.util.Scanner;
class lp6
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int m=a/2;
		int l=m,h=m;
		for(int i=0;i<a;i++){
			int c=1;
			for(int j=0;j<a;j++){
				if(j>=l && j<=h){
					if(c==1)
					{
						System.out.print("# ");
						c--;	
					}
					else
					{
						System.out.print("  ");
						c++;
					}
				}else{
					System.out.print("  ");
				}
			}
			if(i<m){
				l--;
				h++;
			}else{
				l++;
				h--;
			}
		System.out.println();
		}
		
	}
}