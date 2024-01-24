//takke input from user and print the corresponding char 

import java.util.Scanner;

public class Question1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println((char)a);
        sc.close();
    }
}