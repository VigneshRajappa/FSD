import java.util.Scanner;
class Shape{
    public void getPerimeter(int l,int b)
    {
        System.out.println("Perimeter is "+(l+b));
    }
    public void getArea(int l,int b)
    {
        System.out.println("The Area is "+(l*b));
    }
}
class Rectangle extends Shape{
    public void getPerimeter(int l,int b)
    {
        System.out.println("The Perimeter "+(l+b));
    }
    public void getArea(int l,int b)
    {
        System.out.println("The Area is "+(l*b));
    }
}
public class Inhertance_Area_Peri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        Rectangle obj=new Rectangle();
        Shape obj1=new Shape();
        obj.getArea(l,b); 
        obj.getPerimeter(l,b);
        obj1.getArea(l,b);
        obj1.getPerimeter(l,b);
    }
    
}
