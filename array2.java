import java.util.Scanner;

//make an array
//print that whether the given array is having duplicate values or not
public class array2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("The array is ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        //checking whether the array is having duplicate elements or not
        boolean yes=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    yes=true;
                    break;
                }
                else{
                    yes=false;
                }
            }
            if(yes) break;
        }
        System.out.println();
        if(yes) System.out.println("The array has duplicate elements");
        else System.out.println("No duplicate elements");
        sc.close();
    }
}