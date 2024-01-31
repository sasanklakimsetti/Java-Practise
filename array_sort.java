import java.util.Arrays;
import java.util.Scanner;

//sorting an array
public class array_sort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of the array: ");int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("the array is ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        //sorting the array using inbuilt function
        Arrays.sort(arr);
        //sorted array
        System.out.println();
        System.out.print("the sorted array is ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}