import java.util.Arrays;
import java.util.Scanner;

//given an integer array having repetitive num
//one num is getting repeated n/2 times
//print the majority num from the array(the number getting repeated more than n/2 times)
public class ArrayTask {
    //approach 2
    //time complexity O(1)
//    static void majority(int[] arr){
//        Arrays.sort(arr);
//        int mid=(arr.length-1)/2;
//        System.out.println(arr[mid]);
//    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("the array is ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

        int count=0;
        int max=0;
        //time complexity -> O(n^2)
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count==n/2){
                max=arr[i];
                break;
            }
            else
                count=0;
        }
        System.out.println("\nThe num getting repeated n/2 times is "+max);
//        System.out.print("The num getting repeated n/2 times using approach 2 is ");
//        majority(arr);
    }
}