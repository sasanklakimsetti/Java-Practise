//You are provided with an integer 'n'. you are supposed to find the pivot 'x' such that the sum from 1 to x is equal to x to n.
//
//
//        if no number satisfies this condition, return -1
//
//arr: 1,2,3,...,x,....,n

import java.util.Scanner;
public class PivotElement {
    //approach 1
    static int findPivot(int n){
        int ts= (n*(n+1))/2;  //sum of n natural numbers
        int cs=0;
        for (int i=1;i<n;i++){
            cs+=i;
            if(cs==(ts-cs)+i) return i;
        }
        return -1;
    }
    //approach 2 using binary search
    static int findPivot2(int n){
        int s=1;
        int e=n;
        int ts=(n*(n+1))/2;
        while(s<=e){
            int mid=(s+e)/2;
            int cs=(mid*(mid+1))/2;
            if(cs==(ts-cs)+mid) return mid;
            else if(cs<(ts-cs)+mid) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n=sc.nextInt();
        int result=findPivot(n);
        if(result==-1) System.out.println("No pivot element");
        else System.out.println(result);
        int result2=findPivot2(n);
        if(result2==-1) System.out.println("No pivot element");
        else System.out.println(result2);
    }
}