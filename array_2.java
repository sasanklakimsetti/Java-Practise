import java.util.Scanner;

//given an array of length n , all elements in the array is in range(1,n)
// in the array due to error one element got repeated and one got missing
//tell the missing and repeated element from the array
//ex: arr = [1,2,3,3,4,5] -> missing = 6;rep=3
//[1,2,3,3,5,6] -> missing=4;rep=3

//it will work only if the array is sorted i.e. even the repetitions occur they should be in sorted order
//ex: [1,2,3,3,5] or [1,2,3,3,4]
// it won't work if the array is like [1,2,3,6,6] because it can handle only one error
public class array_2 {
    //technique2
    void findMissRepeat(int arr[]){
        int r=0;
        int m=0;
        int[] freq=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
            if(freq[arr[i]]==2) r=arr[i];
        }
        for(int i=1;i<=arr.length;i++){
            if(freq[i]==0) {
                m = i;
                break;
            }
        }
        System.out.print("\nThe repeated element is "+r+"\nthe missing element is "+m);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("the array is ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        int rep=0;
        int miss=0;
        //checking the error and repeated element
        for(int i=0;i<n;i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    rep = arr[j];
                    if ((j<n-1)&&(arr[j + 1] > arr[j] + 1)) {
                        miss = arr[j] + 1;
                    } else if ((j<n-1)&&(arr[j + 1] == arr[j] + 1)) {
                        miss = arr[n - 1] + 1;
                    }
                    else if(j==n-1){
                        miss=arr[n-1]+1;
                    }
                }
            }
        }
        System.out.println("\nThe missing element is "+miss+"\nthe repeated element is "+rep);
        System.out.println("using technique2: ");
        array_2 a1=new array_2();
        a1.findMissRepeat(arr);
        sc.close();
    }
}