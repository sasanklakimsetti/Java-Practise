//Interface
//syntax : interface
//to inherit into class : implements
//it will only have abstract methods, no concrete methods
//by default, the datatypes/ methods are public final
//we can achieve multiple inheritance in java using interface


import java.util.Scanner;

abstract class Branch{
    int noStaff;
    abstract void ifsc();
}
interface Loan{
    int homeLoan(int amount);
    int edLoan(int amount);
}
interface creditCard{
    void premium(int salary);
    void standard(int salary);
    void basic(int salary);
}
class DelhiBranch implements Loan,creditCard{
//    void ifsc(){
//        System.out.println("del1234");
//    }
    Scanner sc=new Scanner(System.in);
    int homeLoan(int amount){
        System.out.print("enter amount: ");int am=sc.nextInt();
    }
}

public class Interface {
    public static void main(String[] args){

    }
}