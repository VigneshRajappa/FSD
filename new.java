import java.util.Scanner;
class new{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r,b=0;
        while(a>0)
        {
            r=a%10;
            b=b*10+r;
            a=a/10;
        }
        System.out.println(b);
    }
}