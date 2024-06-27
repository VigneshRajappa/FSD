import java.util.Scanner;
class Shape{
    public void getArea(int a)
    {
        int len=a;
        System.out.println("The Square of it is "+len*len);
    }
}
class Rectangle extends Shape{
    public void getArea(int l,int b)
    {
        int len=l;
        int bre=b;
        System.out.println("The area of Rectangle is "+l*b);
    }
}
public class SingleLevel2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        Shape obj=new Shape();
        Rectangle obj1=new Rectangle();
        obj.getArea(l);
        obj1.getArea(l,b);
    }
    
}
