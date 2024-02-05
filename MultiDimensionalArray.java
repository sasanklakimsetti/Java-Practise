import java.util.Scanner;

//multi-dimensional array : 2 or more dimensions
public class MultiDimensionalArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no.of rows: ");int r=sc.nextInt();
        System.out.print("enter no.of columns: ");int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("enter elements of the array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix/2d array is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}