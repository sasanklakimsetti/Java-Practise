//print all elements that in the array that are surrounded by left and right elements and not equal to left and risht elements
import java.util.Scanner;
public class CheckSurroundedElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of the array: ");int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.print("elements are ");
        CheckElement(arr);
    }
    public static void CheckElement(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]&&arr[i]!=arr[i-1])
                System.out.print(arr[i]+" ");
        }
    }
}