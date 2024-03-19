//Threads can be created in two methods
//1.Class Thread (java in-built class)
//2. implement Runnable

public class Threads extends Thread{
    public void run(){
        System.out.println("Child thread");
    }
    public static void main(String[] args){
        Threads t=new Threads();
        t.start();  //threads will start
        System.out.println("Main thread");
    }
}