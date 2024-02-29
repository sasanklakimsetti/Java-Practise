//arr of integers
//might contain duplicates
//of even length
//make two array and both should unique elements i.e. not  b/w two arrays, in the array itself
// it can be arr1: 1 2 3
//           arr2: 1 2 3
//but nnot   arr1: 1 1 2
//           arr2: 1 2 3

//tc1: arr: 1 1 2 2 3 3 4 4  o/p:true
//tc2: arr: 1 1 1 1 1 1 1 1 o/p:false
//tc3: arr: 1 2 3 4 1 2 3 4 o/p: true
//tc4: arr: 1 2 1 3 4 1 2 3 o/p:false


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
            //approach 1
            //from testcases we can say that for every element there should only be one duplicate, not more than one
            //that's why we are sorting so that we can place them in different arrays
            Arrays.sort(arr);
            int[] arr1 = new int[n/2];
            int k1=0;
            int[] arr2 = new int[n/2];
            int k2=0;
            //as the array elements should be unique, we can store alternate indices in each array
            for(int i=0;i<n;i++){
                //odd indices in arr1
                if(i%2!=0){
                    arr1[k1++]=arr[i];
                }
                //even indices in arr2
                else{
                    arr2[k2++]=arr[i];
                }
            }
            boolean flag1=true;
            boolean flag2=true;
            //checking whether the array contains unique elements or not
            for(int i=0;i<arr1.length-1;i++){
                if(arr1[i]==arr1[i+1]){
                    flag1=false;
                    break;
                }
            }
            //checking whether the array contains unique elements or not
            for(int i=0;i<arr2.length-1;i++){
                if(arr2[i]==arr2[i+1]){
                    flag2=false;
                    break;
                }
            }
            System.out.print("using 1st approach: ");
            if(flag1&&flag2) System.out.println("true");
            else System.out.println("false");

            //time complexity of this approach : O(n logn)
            //sorting : O(nlogn) and loops: O(n)
            //space complexity : O(n)
            //we are unnecessarily creating two arrays where the required output whether the division is possible or not.
            //so we have coded approach 2

            //using 2nd approach
            boolean yes=isDividable2(arr);
            System.out.print("using 2nd approach: "); System.out.println(yes);
        }
        else System.out.println("length should be an even number");
    }

    //approach 2
    static boolean isDividable2(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==arr[i+2]) return false;
            //an element can have only one repeated element so if it has extra elements then they will be got to know from 2 indices or more of the present element
        }
        return true;
    }
    //tc: O(n logn) because of sorting
    //we are doing this approach because the previous is having more space complexity than this
    // i.e. we need to create two more arrays of half of the actual which results in another O(n)
    //but there may not be much difference just constant gets changed. in the previous one, it will be 2*O(n).
    //in this, it will be 1*O(n)
    //so there is no major difference in memory consumption in both and both time complexities are same
}