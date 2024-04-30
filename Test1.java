import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=25&&i!=0) {
                //System.out.println("Not found");
                break;
            }
            else if(arr[i]==25&&i==0){
                System.out.println("not found");
                break;
            }
            else System.out.println(arr[i]);
        }
    }
}