//fibonnacci series
//n to be taken as user-input
//print the nth number of the fibonacci series

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s1=0;
        int s2=1;
        for(int i=2;i<=n;i++){
            int sum=s1+s2;
            s1=s2;
            s2=sum;
        }
        System.out.println(s2);
        sc.close();
    }
}