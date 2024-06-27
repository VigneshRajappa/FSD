//Write a Java programme to create a class called Animal with a Method called make sound.
// create a sub class called cat that overrides the make sound method to mark
class Animal{
    public void makeSound()
    {
        System.out.println("WOW");
    }
}
class cat extends Animal{
    public void makeSound()
    {
        System.out.println("BARK");
    }
}

public class Singlelevel {
    public static void main(String[]args)
    {
        cat obj=new cat();
        obj.makeSound();
        Animal obj2=new Animal();
        obj2.makeSound();
    }
    
}
