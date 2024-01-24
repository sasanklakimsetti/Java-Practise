//take input from the user and tell whether the number is even or odd

import java.util.Scanner;

public class Question1Class4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // if(a%2==0)
        //     System.out.println("Number is even");
        // else
        //     System.out.println("Number is odd");
        //using ternary operator
        // String ans=((a%2)==0?"Even":"Odd");
        //using AND operator
        //String ans=((a&1)==0?"Even":"Odd");     
        //exp: even numbers will have '0' at last when converted into binary. if we do AND operation with 1 then it will return 0 so it will be even if not it will be odd
        //using XOR 
        String ans=((a^1)==a+1?"Even":"Odd");
        //exp: xor of an even number with 1 will be one number greater than the number whereas the xor of odd will be one number less than the number
        System.out.println(ans);
        sc.close();
    }
}