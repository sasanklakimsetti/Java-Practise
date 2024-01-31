//take user input and check whether the number is palindrome or not
//121 -> palindrome
//144 -> not palindrome

import java.util.Scanner;

public class palindrome {

    boolean checkPalindrome(int n){
        int r=n;
        int nn=0;
        while(n>0){
            int d=n%10;
            nn=nn*10+d;
            n/=10;
        }
        return nn==r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindrome p1=new palindrome();
        boolean ans=p1.checkPalindrome(n);
        if(ans) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
        sc.close();
    }
}