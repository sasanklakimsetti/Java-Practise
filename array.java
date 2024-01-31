import java.util.Scanner;

//take size of length as user input
//make an int array of that length by user input
//calculate the average of the array and print it.
public class array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //printing the array
        System.out.print("The array is ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //calculating the average
        int avg=0;
        for(int i=0;i<n;i++){
            avg+=a[i];
        }
        avg=avg/n;
        System.out.println("The average of array elements is "+avg);
        sc.close();
    }
}