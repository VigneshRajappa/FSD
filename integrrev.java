import java.util.Scanner;
class integrrev {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0,r;
        while(a>0)
        {
            r=a%10;
            b=b*10+r;
            a=a/10;

        }
        System.out.println(b);
    }
}
