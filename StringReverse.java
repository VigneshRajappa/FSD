import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    }
}
