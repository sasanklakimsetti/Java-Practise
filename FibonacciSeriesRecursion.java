//printing the nth element of the fibonacci series using recursive method

import java.util.Scanner;

public class FibonacciSeriesRecursion{
    public int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            int nth = fib(n-1)+fib(n-2);
            return nth;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FibonacciSeriesRecursion fib1=new FibonacciSeriesRecursion();
        int ans=fib1.fib(n);
        System.out.println(ans);
        sc.close();
    }
}