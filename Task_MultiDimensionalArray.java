import java.util.Scanner;

//given a matrix
//wherever a zero is appeared in the matrix we need to replace the entire row and column to 0
// example
/*
     1 2 3     --->>  1 2 0
     4 5 0     --->>  0 0 0
     6 7 8     --->>  6 7 0
 */
public class Task_MultiDimensionalArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no.of rows: ");int r=sc.nextInt();
        System.out.print("enter no.of columns: ");int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("enter the elements of the matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("original matrix is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int[][] nArr=new int[r][c];
        //checking where are the zeroes and doing the required changes
        int r_c=0;
        int c_c=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<r;k++) nArr[k][j]=-1;
                    for(int k=0;k<c;k++) nArr[i][k]=-1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(nArr[i][j]==-1) nArr[i][j]=0;
                else nArr[i][j]=arr[i][j];
            }
        }
        //the modified array is
        System.out.println("the modified matrix is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(nArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}