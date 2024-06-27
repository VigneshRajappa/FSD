public class fibanossi {
    public static void main(String[]args)
    {
        int a=0;
        int b=1;
        int f,n=7;
        System.out.println(a+"\n"+b);
        for(int i=2;i<n;i++)
        {
            f=a+b;
            a=b;
            b=f;
            System.out.println(b);
        }
    }
}
