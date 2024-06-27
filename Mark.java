import java.util.Scanner;
class Mark{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a>=35)
{
	if(a>=90)
	{
		System.out.println("Eligible for Medical");
	}
	else if(a>=75)
	{
		System.out.println("Eligible for IT");
	}
	else if(a<75)
	{
		System.out.println("Eligible for Arts");
	}
}
else
{
System.out.println("Not Eligible");
}
}
}