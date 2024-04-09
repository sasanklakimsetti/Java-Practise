//Exception : Unwanted/unexperted behavior of program
//Java has one of the best exception handling mechanism
public class Exception1 {
    int div(int v1, int v2) {
         return v1/v2;
    }
    //throw : throws an exception into the program at very point
    int div2(int v1, int v2) throws Exception{  //throws will tell the compiler that this function is throwing an exception
        //this is telling the compiler that this function is throwing Exception
        if(v2==0) throw new Exception("You can't divide a number a zero");
        return v1/v2;
    }
    public static void main(String[] args){
        Exception1 obj=new Exception1();
        // System.out.println(obj.div(1,0));  //throws an error which is an exception and will terminate our program but we don't want program to terminate
        //System.out.println("hey that was the result of division");  //this line will not be printed in this case bacause the program gets terminated when the compiler tries to perform division of 1 by 0
        //exception handling
        try{
            System.out.println(obj.div(1,0));
        } catch(ArithmeticException ex){   //catch(type of exception object of exception)   // Arithmetic Exception is about the exceptions occur due to arithmetic operations
            System.out.println(ex);  //prints the type of exception
            ex.printStackTrace();   //prints the exception stack (text in red)
            ex.getMessage();  //prints the exception message
        }
        System.out.println("hey that was the result of division");  //now it will print this message though the division of 1 by 0 not possible

        //there can multiple catches with one try
        //general exception "Exception" catch block should always be the last block when there are multiple catch blocks for a try because generic exception will handle all the exceptions
        //finally block : always executable block i.e. it should be executed at the end of the program

        //ex 2
        Exception1 obj2=new Exception1();
        try{
            System.out.println(obj.div(1,0));
        }catch(ArithmeticException ex2){
            System.out.println(ex2);
            System.exit(0);  //this will terminate the program immediately after this catch block
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally in the block!!");
        } //this block will not be executed since there is exit statement in the catch block
        //if there is no exit statement, it will run for sure
        System.out.println("hey that was the div result 2");

//        Exception1 obj3=new Exception1();
//        try {
//            System.out.println(obj3.div(1,0));
//        }catch (ArithmeticException ex3){
//
//        }
    }
}