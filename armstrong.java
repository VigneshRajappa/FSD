import java.util.Scanner;
public class armstrong {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        double r,c=0,b=0;
        long t=a;
        while(a>0)
        {
            c++;
            a=a/10;
        }
        a=t;
        while(a>0)
        {
            r=a%10;
            b=b+Math.pow(r,c);
            a=a/10;
        }
        if(t==b)
        {
            System.out.println("Armstorng Number");
        }
        else{
            System.out.println("Not a armsstrong Number");
        }
    }
}
