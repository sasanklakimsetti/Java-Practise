import java.util.Scanner;
public class SelectionSortUsingLargestElement {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of the array: ");int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("the array before sorting is ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        //selection sort
        int max=0;
        for(int i=n-1;i>=0;i--){
            max=i;
            for(int j=0;j<=i;j++){
                if(arr[j]>arr[max])
                    max=j;
                //swapping
                int temp=arr[max];
                arr[max]=arr[i];
                arr[i]=temp;
            }
        }
        //printing the sorted array
        System.out.println();
        System.out.print("the array after sorting is ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}