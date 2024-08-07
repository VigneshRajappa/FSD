import java.util.*;
class duplicate
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n=in.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=in.nextInt();
	    }
		boolean b;
	    for(int i=0;i<n;i++)
	    {
			b=true;
	        for(int j=0;j<n;j++)
	        {
	            if(i!=j && a[i]==a[j])
	            {
					b=false;
					break;
	            }
	        }
			if(b)
			{
				System.out.println(a[i] +" ");
			}
	    }
	}
}