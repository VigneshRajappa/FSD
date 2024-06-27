import java.util.Scanner;
class At{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0,r=1;
		if(a>=200)
		{
			int t=a/200;
			r=a%200;
			System.out.println("Two hundred "+t);
			count=count+t;
		}	
		if(r>=100)
		{
			int h=r/100;
			r=r%100;
			System.out.println("Hundred rupees: "+h);
			count=count+h;
		}
		if(r>=50)
		{
			int f=r/50;
			r=r%50;
			System.out.println("Fifty rupees : "+f);
			count=count+f;
		}
		if(r>=20)
		{
			int tw=r/20;
			r=r%20;
			System.out.println("Twenty rupees : "+tw);
			count=count+tw;
		}
		if(r>=10)
		{
			int te=r/10;
			System.out.println("Ten rupee motes : "+te);
			count=count+te;
		}
		System.out.println(count);
	}
}
		
