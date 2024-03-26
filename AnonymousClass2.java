// we have three types of anonymous class
// 1) Anonymous class that extends a class
// 2) Anonymous class that implements interface
// 3)Anonymous class implemented in the  argument/ constructor
public class AnonymousClass2 {
    public static void main(String[] args){
        // 1) Anonymous class that extends a class
        Thread t=new Thread(){  //anonymous class
            public void run(){
                System.out.println("From the run of thread class!!!");
            }
        };
        t.start();  //internally runs run() method
        System.out.println("Main thread");

        // 2) Anonymous class that implements interface
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("From the run method of Runnable interface");
            }
        };
        Thread t1=new Thread(r);//r -> obj of runnable class

        t1.start();
        System.out.println("From the main thread");

        // 3)Anonymous class implemented in the  argument/ constructor
        Thread t2=new Thread(new Runnable(){ //here object of Runnable is the argument passed to the thread class
            public void run(){
                System.out.println("From the run of runnable interface in the argument");
            }
        });
        t2.start();
        System.out.println("Main thread 3");
    }
}