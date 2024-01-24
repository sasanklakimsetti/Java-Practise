//take three numbers as input and print their sum

import java.util.Scanner;

public class FirstClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");int a=sc.nextInt();
        System.out.print("Enter b: ");int b=sc.nextInt();
        System.out.print("Enter c: ");int c=sc.nextInt();
        int sum=a+b+c;
        sc.close();
        System.out.println("The sum is "+sum);
    }
}