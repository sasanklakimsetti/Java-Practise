//You've got a 5*5 matrix, consisting of 24 zeroes and a single number one. Let's index the matrix rows by numbers from 1 to 5 from top to bottom, let's index the matrix columns by numbers from 1 to 5 from left to right. In one move, you are allowed to apply one of the two following transformations to the matrix:
//
//Swap two neighboring matrix rows, that is, rows with indexes i and i+1 for some integer i (1≤i<5).
//Swap two neighboring matrix columns, that is, columns with indexes j and j+1 for some integer j (1≤j<5).
//You think that a matrix looks beautiful, if the single number one of the matrix is located in its middle (in the cell that is on the intersection of the third row and the third column). Count the minimum number of moves needed to make the matrix beautiful.
//
//Input
//The input consists of five lines, each line contains five integers: the j-th integer in the i-th line of the input represents the element of the matrix that is located on the intersection of the i-th row and the j-th column. It is guaranteed that the matrix consists of 24 zeroes and a single number one.
//
//Output
//Print a single integer — the minimum number of moves needed to make the matrix beautiful.
//
//        Examples
//        inputCopy
//0 0 0 0 0
//        0 0 0 0 1
//        0 0 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0
//outputCopy
//3
//inputCopy
//0 0 0 0 0
//        0 0 0 0 0
//        0 1 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0
//outputCopy
//1


import java.util.Scanner;

public class BeautifulMatrix {
    public static void beautifyMatrix(int[][] arr, int r, int c){
        int onethRow= -1;
        int onethCol=-1;
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(arr[i][j]==1) {
                    onethRow=i;
                    onethCol=j;
                }
            }
        }
        if(onethRow>=0&&onethCol>=0){
            int nMoves=0;
            while(onethRow!=2){
                if(onethRow>2){
                    arr[onethRow-1][onethCol]=arr[onethRow][onethCol];
                    arr[onethRow][onethCol]=0;
                    onethRow--;
                    nMoves++;
                }
                else if(onethRow<2){
                    arr[onethRow+1][onethCol]=arr[onethRow][onethCol];
                    arr[onethRow][onethCol]=0;
                    onethRow++;
                    nMoves++;
                }
            }
            while(onethCol!=2){
                if(onethCol>2){
                    arr[onethRow][onethCol-1]=arr[onethRow][onethCol];
                    arr[onethRow][onethCol]=0;
                    onethCol--;
                    nMoves++;
                }
                else if(onethCol<2){
                    arr[onethRow][onethCol+1]=arr[onethRow][onethCol];
                    arr[onethRow][onethCol]=0;
                    onethCol++;
                    nMoves++;
                }
            }
//            System.out.println("The Beautified matrix is ");
//            for(int i=0;i<r;i++){
//                for(int j=0;j<c;j++){
//                    System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
//            }
            System.out.println(nMoves);
        }
       // else System.out.println("Can't beautify the matrix");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=5;
        int col=5;
        int[][] arr=new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
//        System.out.println("The matrix is ");
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<col;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        beautifyMatrix(arr,rows,col);
    }
}