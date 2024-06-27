import java.util.Scanner;
class Val{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int bal=100000;
System.out.println("Enter your option(D/W)");
char ch=sc.next().charAt(0);
int a,b,c,d;
if(ch=='D' || ch=='d')
{
	System.out.println("Enter the Amount");
	a=sc.nextInt();
	b=a+bal;
	System.out.println("Entered amount: "+a);
	System.out.println("Total amount: "+b);
}
else if(ch=='W' || ch=='w')
{
	System.out.println("Enter the withdraw amount");
	c=sc.nextInt();
	d=bal-c;
	if(d>c)
	{
		System.out.println("Withdraw amount : "+c);
		System.out.println("Remaining amount : "+d);
	}
	else
	{
		System.out.println("Insufficient balance");
	}
}
else
{
	System.out.println("Enter correct choice");
}
}
}