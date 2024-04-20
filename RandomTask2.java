//Give character matrix i.e. 2D array containing characters and a string with value.
//can we make get consecutive values from the character matrix which results into the value of string
// the movement will be to the adjacent values(left, right, top, bottom) not diagonal ones.
//cannot revisit the cell visited
// ex:      M A B
//          O H C
//          D I T
//String : Mohit
//Traversal can be [1,1],[2,1],[2,2],[3,2],[3,3] which results to the value of string "Mohit"

import java.util.Scanner;

public class RandomTask2 {
//    static boolean check(char[][] arr, String str){
//        int m=arr.length;
//        int n=arr[0].length;
//        char[] strArray=str.toCharArray();
//        int k=0;
//        boolean ans=false;
//        for (int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(arr[i][j]==strArray[k]) {
//                    ans = true;
//                    k++;
//                    if (!(k>arr.length)) {
//                        if ((arr[i - 1][j] == strArray[k]) && (i > 0)) {
//                            k++;
//                            ans = true;
//                        } else if (arr[i + 1][j] == strArray[k]) {
//                            k++;
//                            ans = true;
//                        } else if ((arr[i][j - 1] == strArray[k]) && (j > 0)) {
//                            k++;
//                            ans = true;
//                        } else if (arr[i][j + 1] == strArray[k]) {
//                            k++;
//                            ans = true;
//                        } else {
//                            ans = false;
//                        }
//                    }
//                }
//                else ans=false;
//            }
//        }
//        return ans;
//    }
    // teacher approach
    static boolean check2(char mat[][], int i, int j, String str, int si){
        if(i<0||j<0||i>= mat.length||j>=mat[0].length ||mat[i][j]!=str.charAt(si)) return false;
        char ch=mat[i][j];
        mat[i][j]='0';
        boolean ans=false;
        ans=ans||check2(mat, i+1,j,str,si+1);
        ans=ans||check2(mat, i-1,j,str,si+1);
        ans=ans||check2(mat, i,j+1,str,si+1);
        ans=ans||check2(mat, i,j-1,str,si+1);
        mat[i][j]=ch;
        return ans;
    }
    static boolean check2(char mat[][], String str){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==str.charAt(0)){
                    if(check2(mat,i,j,str,0)) return true;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("no.of rows of the matrix: ");int m=sc.nextInt();
        System.out.print("no.of columns of the matrix: ");int n=sc.nextInt();
        char[][] arr=new char[m][n];
        System.out.println("Enter the values of matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        sc.nextLine();
        System.out.print("Enter the string: "); String str=sc.nextLine();
//        System.out.println("The matrix is ");
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        boolean ans=check2(arr,str);
        if(ans) System.out.println("The pattern exists");
        else System.out.println("The pattern doesn't exist");
    }
}