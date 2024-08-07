import java.util.Scanner;
public class StringDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char prev=str.charAt(0);
        for(int i=0;i>str.length();i++){
            char ch=str.charAt(i);
            for(int j=0;j<str.length();j++){
                if(i!=j && prev==ch){
                    break;
                }
            }
            System.out.print(ch);
            prev=ch;

        }
    }
}
