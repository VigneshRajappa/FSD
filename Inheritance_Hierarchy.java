import java.util.Scanner;
class vehicle{
    public void disp1()
    {
        System.out.println("The Vehicles are \n1.Truck\n2.Car\n3.Motorcycle");
    }
}
class Truck extends Vehicle{
    public void disp2()
    {
        System.out.println("The Details About the Truck :\n1.Make : China\n2.Model : 2012\n3.Fuel Type : Diesel\n4.Fuel Efficiency : 12 lt/km\n5.Distance Travelled : 12000 kms\n6.Maximum Speed : 70 kms/hr");
    }
}
class Car extends Vehicle{
    public void disp3()
    {
        System.out.println("The Details About the Car :\n1.Make : USA\n2.Model : 2022\n3.Fuel Type : Petrol\n4.Fuel Efficiency : 25 kms/lt \n5.Distance Travelled : 130000\n6.Maximum Speed : 120 kms/hr");
    }
}
class Motor extends Vehicle{
    public void disp4()
    {
        System.out.println("The Details About the Motorcycle :\n1.Make : India\n2.Model : 2018\n3.Fuel Type : Petrol\n4.Fuel Efficiency : 50 kms/lt \n5.Distance Travelled : 3000\n6.Maximum Speed : 180 kms/hr");
    }
}
public class Inheritance_Hierarchy {
    public static void main(String[] args) {
        
    }
    
}
