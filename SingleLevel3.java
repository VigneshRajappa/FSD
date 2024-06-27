class Employee{
    public void getSalary()
    {
        System.out.println("The salary for the employee.");
    }
    public void work()
    {
            System.out.println("First work of the employee.");
    }
}
class HRManager{
    public void work(){
        System.out.println("The final work of employee");
    }
    public void AddEmployee()
    {
        System.out.println("First function for adding a employee.");
    }
}
public class SingleLevel3 {
    public static void main(String[] args) {
        Employee obj=new Employee();
        HRManager obj1=new HRManager();
        obj1.AddEmployee();
        obj.work();
        obj.getSalary();
        obj1.work();
    }
}
