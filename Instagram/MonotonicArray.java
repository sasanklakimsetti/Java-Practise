import java.util.Scanner;

//Monotic array
//an array is said to be monotonic if all the elements are either in increasing or decreasing order
//ex: 1 2 3 4 5
//ex: 5 4 3 2 1
//ex: 1 2 2 3 4
//ex: 5 4 2 2 1
// 1 2 3 5 1    ---->>> not a monotonic array
public class MonotonicArray {
    boolean IncDec(int[] a){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1])
                dec=false;
            if(a[i]>a[i+1])
                inc=false;
        }
        return inc||dec;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of the array: ");int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("the array is { ");
        for(int i=0;i<n;i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print("}");
        MonotonicArray m1=new MonotonicArray();
        boolean result=m1.IncDec(a);
        if(result) System.out.print(" and it is a monotonic array");
        else System.out.print("and it is not a monotonic array");
        sc.close();
    }
}