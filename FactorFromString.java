import java.util.Scanner;
//take a number input from user in string format and find the maximum factor of last two digits of the number that user has inputted
//this question has been asked in a coding examination in my college
public class FactorFromString {
        public static long maxFactor(long n){
               long fact=0;
               boolean yes=false;
               for(long i=2;i<n;i++){
                       if(n%i==0){
                               fact=i;
                       }
                       else
                           fact=n;
               }
               return fact;
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                char s1=s.charAt(s.length()-2);
                char s2=s.charAt(s.length()-1);
                String s3 = String.valueOf(s1)+String.valueOf(s2);
                long n=Long.parseLong(s3);
                long result=maxFactor(n);
                System.out.println("The highest factor of last two digits of the number "+s+" is "+result);
        }
}