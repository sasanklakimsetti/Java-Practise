//FunctionalInterface
@FunctionalInterface
interface Loan1{
    int salary=10000;
    int homeLoan(int s);
//    boolean carLoan(int s);   // we can't use two abstract methods in a FunctionalInterface. It can accept only one abstract method.
    //this is the only difference between normal interface and FunctionalInterface
}
//since we can't instantiate an obj for interface we create a class that implements interface
class midClass implements Loan1{
    public int homeLoan(int s){
        return s>=salary?1:-1;
    }
}
public class Function_Interface {
    public static void main(String[] args){
        midClass obj=new midClass();
        int res=obj.homeLoan(1000000);
        System.out.println(res);
        //if we use functional interface then there is no need of any subclass
        Loan1 obj1=(int s) -> {
            //   -> is lambda expression
            //They provide a clear and concise way to represent one method interface using an expression. Lambda expressions also improve the Collection libraries making it easier to iterate through, filter, and extract data from a Collection .
            if(s>=10000) return 1;
            else return -1;
        };

        Loan1 obj2=(int s) -> (s*s);
    }
}