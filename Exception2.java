//Customize Exception: customizing a pre-defined exception
class myException extends Exception{
    public myException(String msg){
        super();
    }
    public String getMessage(){
        return "Baane extra lu mingutunnav ga";
    }
}
public class Exception2 {
    public Exception2() {

    }
    int D(int v) throws myException{
        if(v==0) throw new myException("Learn Mathematics first");
        return v;
    }

    public static void main(String[] args){
        Exception2 obj=new Exception2();
        try{
            obj.D(0);
        }catch(myException ex){
            System.out.print("myException will say this: "+(ex.getMessage()).toUpperCase());

        }
    }
}