import java.util.Scanner;

class a{
    public void disp(int num)
    {
        int Cnum=num;
        System.out.println("Car Numer "+Cnum);
    }
}
class b extends a{
    public void disp2(String name)
    {
        String Cname=name;
        System.out.println("Car Name is "+Cname);
    }
}
public class Single{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        b obj=new b();
        obj.disp(num);
        obj.disp2(name);
    }
}