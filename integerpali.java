import java.util.Scanner;
public class integerpali {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=a;
        int r,b=0;
        while(a>0)
        {
            r=a%10;
            b=b*10+r;
            a=a/10;
        }
        if(t==b)
        {
            System.out.println("Panlindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
