import java.util.Scanner;

public class maximumUsingVarArgs {
    //using varArgs
    //varArgs are used to store any no.of inputs who won't lead to memory leak
    public int maximum(int... val){
        int maxi=0;
        for(var e:val){
            maxi=Math.max(maxi,e);
        }
        return maxi;
    }
    public static void main(String[] args){
        maximumUsingVarArgs m1=new maximumUsingVarArgs();
        System.out.println(m1.maximum(1,2,3,4,5,6,7,8,9));
    }
}