import java.util.Scanner;
class find{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a%3==0 && a%5!=0)
{
System.out.println("Hii");
}
else if(a%3!=0 && a%5==0)
{
System.out.println("Hello");
}
else if(a%3==0 && a%5==0)
{
System.out.println("Welcome");
}
else
{
System.out.println("quit");
}
}
}