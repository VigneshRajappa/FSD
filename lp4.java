import java.util.Scanner;
class lp3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int m=a/2;
		int l=m,h=m;
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				if(j>=l && j<=h){
					System.out.print("# ");
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