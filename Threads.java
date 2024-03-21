//Threads can be created in two methods
//1.Class Thread (java in-built class)
//2. implement Runnable (java in-built interface)

//way 1 using Thread Class
//public class Threads extends Thread{
//    public void run(){
//        System.out.println("Child thread");
//    }
//    public static void main(String[] args){
//        Threads t=new Threads();
//        t.start();  //threads will start
//        System.out.println("Main thread");
//        //whenever a thread is created. first the main thread will be executed and then the child will be executed.
//
//    }
//}

//way 2 using Runnable Interface
//Runnable is actually a functional Interface
//public class Threads implements Runnable{
//    public void run(){
//        System.out.println("Child thread");
//    }
//    public static void main(String[] args){
//        Threads t=new Threads();
//        Thread T=new Thread(t);
//        T.start();
//        System.out.println("Main thread");
//    }
//}

//way 3 using lambda expression
public class Threads{
    public static void main(String[] args){
        Runnable obj = () -> {
            System.out.println("RIT");
        };
        Thread t = new Thread(obj);
        t.start();
        System.out.println("MT");
    }
}