import java.util.Scanner;

// You are provided with an integer array arr.
// You are supposed to make the ans array of same length where ith product of all elements of arr except the ith index element
// tc1 :  [1,2,3,4]   ->  o/p:   [24,12,8,6]
// tc2 : [-1,1,0,-3,3]  -> o/p: [0,0,9,0,0]

public class ArrayQues {
    //bruteforce approach
    static int[] product (int[] arr){
        int[] ans=new int[arr.length];
        int n=arr.length;
        int product=1;
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!(i==j)){
                    product*=arr[j];
                }
            }
            ans[k++]=product;
            product=1;
        }
        return ans;

        //tc: O(N^2)  sc:O(1)
    }

    //approach 2
    static int[] product2(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int[] suff=new int[n];  //holding product of (i+1)th index to (n-1)th index
        suff[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suff[i]=arr[i+1]*suff[i+1];
        }
        int p=1;
        for(int i=0;i<n;i++){
            ans[i]=p*suff[i];
            p*=arr[i];
        }
        return ans;

        //tc: O(N)
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");int n=sc.nextInt();
        int[] arr=new int[n];
        int[] ans=new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("arr: ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

        //using bruteforce approach
        ans=product(arr);
        System.out.println();
        System.out.print("ans(using bruteforce approach): ");
        for (int i=0;i<n;i++)
            System.out.print(ans[i]+" ");

        System.out.println();

        //using approach 2
        int[] ans2=new int[n];
        ans2=product2(arr);
        System.out.print("ans(using approach 2): ");
        for (int i=0;i<n;i++)
            System.out.print(ans2[i]+" ");
    }
}