//reorder an array such that all zeroes will come first and the rest of the array will get printed in the same order
import java.util.Scanner;
public class ReorderArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of the array: ");int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("the array before reordering is ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        reorder(arr);
    }
    public static void reorder(int[] arr){
        int n=arr.length;
        int[] nArr=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                nArr[k++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                nArr[k++]=arr[i];
        }
        System.out.print("the array after reordering is ");
        for (int i=0;i<n;i++)
            System.out.print(nArr[i]+" ");
    }
}