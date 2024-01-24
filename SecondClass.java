//write a program to take two integer values as an input and after rotating one nd two bits respectively and print their hexadecimal value will be equal or not?

import java.util.Scanner;

public class SecondClass{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=Integer.rotateLeft(a,1);
        b=Integer.rotateLeft(b,2);
        String hexA=Integer.toHexString(a);
        String hexB=Integer.toHexString(b);
        if(hexA.equals(hexB)||hexB.equals(hexA)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        sc.close();
    }
}