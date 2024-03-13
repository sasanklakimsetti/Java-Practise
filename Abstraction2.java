abstract class bankHead{
    void deposit(int x){
        System.out.println("Deposited "+x+"amount in your acc");
    }
    void withdraw(int x){
        System.out.println("Deducted "+x+"amoount from your acc");
    }
    abstract String getIFSC();
}
class bankBranch1 extends bankHead{
    String getIFSC(){
        return "DELXXXX";
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        //code implementation
    }
}
