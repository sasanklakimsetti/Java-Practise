import java.util.Scanner;
//The Tribonacci sequence is a sequence of numbers where each number is the sum of the three preceding ones. The sequence usually starts with 0, 1, and 1.
// just like fibonacci series. the difference is the gap
public class TribonacciSeries {
    //approach 1
    static int tribonacci1(int n){
        int[] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        for(int i=3;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
        return arr[arr.length-1];
    }
    //tc: O(N)
    // extra space required for the array
    //approach 2
    static int tribonacci2(int n){
        int n1=0;
        int n2=1;
        int n3=1;
        int sum=0;
        for(int i=3;i<n;i++){
            sum += n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=sum;
            sum=0;
        }
        return n3;
    }
    //approach 3
    static int tribonacci3(int n){
        if(n==1) return 0;
        else if(n==2||n==3) return 1;
        int n1=tribonacci3(n-1);
        int n2=tribonacci3(n-2);
        int n3=tribonacci3(n-3);
        return n1+n2+n3;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");int n=sc.nextInt();
        int element=tribonacci1(n);
        System.out.println("The nth element of the tribonacci series with n="+n+" using 1st approach is "+element);
        int element2=tribonacci2(n);
        System.out.println("The nth element of the tribonacci series with n="+n+" using 2nd approach is "+element2);
        int element3=tribonacci3(n);
        System.out.println("The nth element of the tribonacci series with n="+n+" using 3rd approach is "+element3);
    }
}