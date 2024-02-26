//check whether the array is symmetrical or not
import java.util.Scanner;
public class SymmetricalArrayCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of the array: ");int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("enter the range to check the symmetry: ");int k=sc.nextInt();
        boolean res=check(arr,k);
        if(res) System.out.println("The array is symmetrical");
        else System.out.println("The array is not symmetrical");
    }
    public static boolean check(int[] arr, int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[arr.length-n+i]) count++;
        }
        boolean flag=false;
        if(count==n) flag=true;
        return flag;
    }
}