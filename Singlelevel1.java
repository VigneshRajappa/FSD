import java.util.Scanner;
class Vehicle{
    public void drive()
    {
        System.out.println("Car is Repaired");
    }
}
class Car extends Vehicle{
    public void drive()
    {
        System.out.println("Repairing a car");
    }
}


public class Singlelevel1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vehicle obj=new Vehicle();
        Car obj1=new Car();
        obj.drive();
        obj1.drive();
    }
}
