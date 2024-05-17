import java.util.Scanner;

public class PrimeNumberCheck {
    static boolean checkPrime(int n){
        boolean yes=true;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0&&i!=1){
                yes=false;
                break;
            }
        }
        return yes;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");int n=sc.nextInt();
        if(n==1) System.out.println(n+" is neither composite nor prime");
        else {
            boolean prime = checkPrime(n);
            if (prime) System.out.println(n + " is a prime number");
            else System.out.println(n + " is a composite number");
        }
    }
}
