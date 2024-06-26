//A. Helpful Maths
//time limit per test2 seconds
//memory limit per test256 megabytes
//inputstandard input
//outputstandard output
//Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.
//
//The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.
//
//You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.
//
//Input
//The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.
//
//Output
//Print the new sum that Xenia can count.
//
//        Examples
//        inputCopy
//3+2+1
//outputCopy
//1+2+3
//inputCopy
//1+1+3+1+3
//outputCopy
//1+1+1+3+3
//inputCopy
//2
//outputCopy
//2


import java.util.Scanner;

public class HelpfulMaths {
    public static String change(String input){
        char[] strArray=input.toCharArray();
        int oneCount=0;
        int twoCount=0;
        int threeCount=0;
        for(int i=0;i<strArray.length;i++){
            if(strArray[i]=='1') oneCount++;
            else if(strArray[i]=='2') twoCount++;
            else if(strArray[i]=='3') threeCount++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < oneCount; i++) {
            if (result.length() > 0) result.append('+');
            result.append('1');
        }

        for (int i = 0; i < twoCount; i++) {
            if (result.length() > 0) result.append('+');
            result.append('2');
        }

        for (int i = 0; i < threeCount; i++) {
            if (result.length() > 0) result.append('+');
            result.append('3');
        }

        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(change(input));
    }
}