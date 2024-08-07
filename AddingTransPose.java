import java.util.Scanner;
public class AddingTransPose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr1[][]=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int arr2[][]=new int[size][size];
        for(int j=0;j<size;j++){
            for(int i=0;i<size;i++){
                arr2[j][i]=arr1[i][j];
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");

            }
            System.out.println();
        }
    }
}
