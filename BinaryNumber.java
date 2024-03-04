//given a binary string contains atleast one character
//return the maximum odd binary number from the given binary string
//Tc1: 0 1 0 1
//o/p: 0 0 1
//Tc2 : 0 1 1 1 0
//o/p: 1 1 0 0 1

import java.util.Scanner;

public class BinaryNumber{
    public static String makeMaxOdd(String s){
        char[] ch=s.toCharArray();
        int c=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1')c++;
            ch[i]='0';
        }
        ch[ch.length-1]='1';
        c--;
        int i=0;
        while(c-- > 0){
            ch[i]='1';
            i++;
        }
        return ch.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number: ");String str=sc.nextLine();
        String str1=makeMaxOdd(str);
        System.out.println("The maximum odd number is "+str1);
    }
}