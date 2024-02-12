//take a string input from the user
//print the first unique value
//if no unique value exists then print -1

import java.util.Scanner;

public class stringTask {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] strArr=str.toCharArray();
        char unique=' ';
        boolean yes=false;
        int count=0;
        for(int i=0;i<strArr.length-1;i++){
            for(int j=0;j<strArr.length;j++){
                if(i!=j&&strArr[i]==strArr[j]) {
                    count++;
                }
            }
            if(count==0) {
                unique=strArr[i];
                yes=true;
                break;
            }
            else {
                yes=false;
                count=0;
            }
        }
        if(yes) System.out.println("the first unique charcater of the string is: "+unique);
        else System.out.println("no unique character in the string");
    }
}