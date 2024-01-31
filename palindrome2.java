//checking a palindrome approach 2

import java.util.Scanner;

public class palindrome2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        char[] ch=s.toCharArray();
        int count=0;
        int length=ch.length;
        for(int i=0;i<length/2;i++){
            if(ch[i]==ch[length-i-1]){
                count++;
            }
            else{
                count--;
            }
        }
        if(count==ch.length/2) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
        sc.close();
    }
}