import java.util.Scanner;
class BankAccount{
    public void deposit(int a)
    {
        int am=a;
        int bal=10000;
        System.out.println("Your Balance is "+(am+bal));
        //break;
    }
    public void withdraw(int d)
    {
        int de=d;
        int bal=10000;
        System.out.println("Your remaining balance is "+(bal-10000));
        //break;
    }
}
class SavingsAccount extends BankAccount{
    public void withdraw()
    {
        System.out.println("The amount less than 100 cant be process");
        //break;
    }
}
public class Inheritance_Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your option \n1.Deposit\n2.Withdraw");
        int ch=sc.nextInt();
        System.out.println("Enter Deposit Amount ");
        int a=sc.nextInt();
        int bal=10000;
        BankAccount obj=new BankAccount();
        SavingsAccount obj1=new SavingsAccount();
        while(true)
        {
            switch(ch)
            {
                case 1:
                {
                
                    obj.deposit(a);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter Deposit Amount :");
                    int de=sc.nextInt();
                    if(de>100)
                    {
                        obj.withdraw(de);
                        break;
                    }
                    else{
                        obj1.withdraw();
                        break;
                    }
                }
                default:
                {
                    System.out.println("Enter Valid Option");
                    break;
                }
            }
        }
    
    }
}
    

