//take the user input and print the pyramid pattern
import java.util.Scanner;
public class pattern2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int space=n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}