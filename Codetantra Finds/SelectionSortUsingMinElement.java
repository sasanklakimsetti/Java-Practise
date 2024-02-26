import java.util.Scanner;
public class SelectionSortUsingMinElement {
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
        int min=0;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
                //swapping
                int temp=arr[min];
                arr[min]=arr[i];
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