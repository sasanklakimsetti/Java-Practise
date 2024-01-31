//take i/p from the user and then do the digit sum of that num, but u can only add even digit with and odd digit with odd sum
//1234 : 2+4=6 ; 1+3=4

import java.util.Scanner;

public class SumOfDigits{
    public void sum(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even_sum=0;
        int odd_sum=0;
        while(n>0){
            int d=n%10;
            if((d&1)==0) even_sum+=d;
            else odd_sum+=d;
            n/=10;
        }
        System.out.println("Even sum: "+even_sum+"\n odd sum: "+odd_sum);
        sc.close();
    }
    public static void main(String[] args){
        SumOfDigits s1=new SumOfDigits();
        s1.sum();
    }
}