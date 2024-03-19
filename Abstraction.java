
//Abstraction
//hide unnecessary things
//it won't be visible to outside but it has some work to do.
//user don't know what exactly is going on inside / don't know how the feature is implemented.
//ex: keyboard, laptop
//four access specifiers in java :  public
//                                  private
//                                  protected
//                                  default
//An instance of an abstract class can't be created
//it is nothing but an incomplete class


//how to perform Abstraction:
//  using "abstract" keyword before class
//  interface

//abstract class can also have concrete methods
abstract class Person2 {   //this class is an abstract class as we have used "abstract" keyword
    String name;
    char sex;
    int noFr;
    abstract int numOfFrnd();  //this is an abstract method i.e. signature is implemented but not the definition and it can be overriden by the subclass
}
class Sas extends Person2{
    //as this class inherits abstract class there are only two options for this class
    //1.become an abstract class
    //2.concrete class by  implementing the abstract method
    int numOfFrnd(){
        return this.noFr;
    }
    //by implementing this function this class has become concrete class
}
public class Abstraction {
    public static void main(String[] args){
        Sas s1=new Sas();
        s1.name="Sasank";
        s1.sex='M';
        s1.noFr=2;
        System.out.println("No.of frnds is "+s1.numOfFrnd());
    }
}