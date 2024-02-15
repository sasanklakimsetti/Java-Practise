//find whether a number is even or odd without using any arithmetic operator
package Instagram;

import java.util.Scanner;

public class EvenOrOdd {
    public static int evenOrodd(int n){
        int result = n & 1;   //AND operator will give 1 only if both are 1
        //even number actually have 0 at the end everytime.
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=evenOrodd(n);
        if(result==0) System.out.println("The number is even");
        else System.out.println("The number is odd");
    }
}