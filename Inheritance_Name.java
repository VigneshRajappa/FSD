import java.util.Scanner;
class Person{
    public void GetFirstName(String n)
    {
        String name=n;
        System.out.println("My name is "+name);
    }
    public void GetLastName(String Ln)
    {
        String lastN=Ln;
        System.out.println("Last Name is "+lastN);
    }
}
class Employee extends Person{
    public void GetLastName(String ln,String po)
    {
        String L=ln;
        String P=po;
        System.out.println("Last Name is "+L);
        System.out.println("Position is "+P);
    }
}
public class Inheritance_Name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String f=sc.nextLine();
        String l=sc.nextLine();
        String p=sc.nextLine();
        Person obj=new Person();
        Employee obj1=new Employee();
        obj.GetFirstName(f);
        obj.GetLastName(l);
        obj1.GetLastName(l,p);
    }
    
}
