import java.util.Scanner;

public class MagicMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of matrix : ");
		
		int n=sc.nextInt();
		int mat[][]=new int[n][n];
		int previ=0;
		int prevj=(n/2);
		mat[previ][prevj]=1;
		
		for(int i=2;i<=(n*n);i++) {
			if(previ==0) 
				previ=n-1;
			else
				previ--;
			
			if(prevj==n-1) 
				prevj=0;
			else
				prevj++;
			
			if(mat[previ][prevj]!=0) {
				if(previ==n-1) 
					previ=1;
				else
					previ+=2;
				
				if(prevj==0)
					prevj=n-1;
				else
					prevj--;
			}
			mat[previ][prevj]=i;
		}
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.printf("%2d ",mat[i][j]);
			}
			System.out.println("");
		}
	}

}