//anonymous class: (a class without name, only single instance can be created) (either extend a class or implement an interface at a time. can't do both at single time) (can't declare static initializers, if there is any static member, it needs to be declared as final)

interface Square{
    int square(int x);
}
public class AnonymousClass {
    public static void main(String[] args){
        //anonymous class implementing interface Sqaure
        Square obj =new Square() {
            public int square(int x) {
                return x*x;
            }
        }; //scope of anonymous class is upto here only
        System.out.println(obj.square(10));
        //we haven't created any class to implement interface but able to implement it.

        //anonymous class extending class Thread
        Thread t=new Thread(){
            public void run(){
                System.out.println("Anonymous thread 1");
            }
        }; //scope of anonymous class is upto here only
        t.start();
        System.out.println("Main thread 1");

        //we haven't created any other class to extend the class Thread but able to extend it

        //Anonymous class implementing Runnable interface
        Runnable r1=() -> {
                System.out.println("Anonymous Thread 2");
        };
        Thread t1=new Thread();
        t1.start();
        System.out.println("Main Thread 2");
    }
}

//we can instantiate only one object for an anonymous class since it has no name and it's scope is upto the braces only. So if we create any object we have no idea that this object belongs to this class.
//So we can only instantiate one object only.

