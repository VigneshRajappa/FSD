import java.util.Scanner;
public class strongnum {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,r;
        int j=0;
        int t=a;
        while(a>0)
        {
            i=1;
            
            r=a%10;
            while(r>0)
            {
                i=i*r;
                r--;
            }
            j+=i;
            a=a/10;
        }
        //System.out.println(j);

        if(t==j)
        {
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }

}
