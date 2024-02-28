//Polymorphism : maany forms of the same thing
//ex : a man can be a father to a child
//                       son to a father
//                       husband to his wife
//                       brother to his sister
// two types:  run-time polymorphism, compile-time polymorphism
//runtime polymorphism :  decided at runtime
//compile-time polymorphsim :  decided at the time of compilation
//method overloading is called compile-time polymorphism

class Animal{
    void speak(){
        System.out.println("animal speaks!");
    }
}
class Dog extends Animal{
    //redefined in child class
    //method overriding
    void speak(){
        System.out.println("Dog barks!");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Cat meows!");
    }
}
public class Polymorphism {
    //compile time polymorphism
    //it is achieved by method overloading
//    int max(int a, int b){
//        return a>b?a:b;
//    }
//    int max(int a, int b, int c){
//        return max(max(a,b),c);
//    }

    //runtime polymorphism
    //it is achieved by method overriding
    public static void main(String[] args){
        Animal a=new Animal();
        Dog d = new Dog();
        a.speak();
        d.speak();
        Animal dog=new Dog(); //this is called upcasting
        // we can do this, this will not give any error
        //the compiler doesn't assume that it is the object of any particular class when the program runs then it will decide which class does the object belong to and  inherits that class' methods
        //in prev versions of java, we need to write @Override annotation before the method which the child and parent commonly have so that the compile does the job during runtime
        // but in modern versions, there is no need of the annotation it won't assume anything directly everything happens at runtime iself.
        //that's why it is called runtime polymorphism

        dog.speak();
        Animal cat=new Cat();
        cat.speak();
        //Cat c=new Animal();
        //this is called downcasting
        //but this can't be done and it will throw an error coz a child can inherit parent's prop but no parent can inherit child's prop
    }
}