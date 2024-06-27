import java.util.Scanner;
class hike
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		double s=sc.nextDouble();
		double p=sc.nextDouble();
		//int a=s*12;
		if(p>=80)
		{
			double h=s*0.30;
			s=s+h;
			System.out.println("Hiked amount : "+s);
		}
		else if(p<=80)
		{
			double d=(p/80)*100;
			double c=(30/100)*d;
			double f=30-c;
			double fc=s*(f/100);
			s=s+fc;
			System.out.println("Loss Amount : "+s);
		}
	}
}

