import java.util.Scanner;

public class W3resoursequestion3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println("The Number 1 is greater");
        }
        else if(number2>number1 && number2>number3){
            System.out.println("The Number 2 is greater");
        }
        else{
            System.out.println("The Number 3 is greater");
        }
    }
    
}
