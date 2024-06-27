import java.util.Scanner;
public class Sub_stringequal {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String s1=a.substring(a.length()-2);
        String s2=b.substring(b.length()-2);
        if(s1.equals(s2))
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
    
}
