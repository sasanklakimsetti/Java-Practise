//arr of integers
//might contain duplicates
//of even length
//make two array and both should unique elements i.e. not  b/w two arrays, in the array itself
// it can be arr1: 1 2 3
//           arr2: 1 2 3
//but nnot   arr1: 1 1 2
 //          arr2: 1 2 3

//tc1: arr: 1 1 2 2 3 3 4 4  o/p:true
//tc2: arr: 1 1 1 1 1 1 1 1 o/p:false


import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask_ {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter length of the array: ");int n=sc.nextInt();
        if(n%2==0) {
            int[] arr = new int[n];
            System.out.println("enter the elements: ");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int[] arr1 = new int[n/2];
            int k1=0;
            int[] arr2 = new int[n/2];
            int k2=0;
            for(int i=0;i<n;i++){
                if(i%2!=0){
                    arr1[k1++]=arr[i];
                }
                else{
                    arr2[k2++]=arr[i];
                }
            }
            boolean flag1=true;
            boolean flag2=true;
            for(int i=0;i<arr1.length-1;i++){
                if(arr1[i]==arr1[i+1]){
                    flag1=false;
                    break;
                }
            }
            for(int i=0;i<arr2.length-1;i++){
                if(arr2[i]==arr2[i+1]){
                    flag2=false;
                    break;
                }
            }
            if(flag1&&flag2) System.out.println("true");
            else System.out.println("false");
        }
        else System.out.println("length should be an even number");
    }
}