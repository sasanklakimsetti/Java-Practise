//Inheritance : child/derived/sub class acquiring properties from base/parent class
//advantages:
//reusability i.e. by using common properties like functions, methods
//remove redundancy i.e. again by using common properties like functions, methods
//better readability
//easier to maintain and make coding faster
//makes debugging faster

//we can perform inheritance in java using keyword "extends"
//syntax: derived_class extends parent_class

import java.util.Scanner;

class Parent{
    int a;
    Parent(){
        System.out.println("Default constructor of Parent class");
    }
    Parent(int a){
        System.out.println("Parameterized class of Parent class");
        this.a=a;
    }
}
//when we extend parent class to derived class there will be a creation of object of parent class in the derived class in backend when the compilation takes place
//so if we use only parameterized constructor then in java we face issues  when we create object without parameter. so the same takes place when there is a creation of object in derived class since derived class takes the properties in default way but not in parameterized way
//so if  the parent class has only parameterized constructor, there will be error in making inheritance between derived and parent class
class Child1 extends Parent{
    Child1(){
        System.out.println("Default constructor of Child class");
    }
    Child1(int a){
        System.out.println("Parameterized constructor of Child class");
        this.a=a;
    }
}
public class Inheritance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Child1 c1=new Child1();
        Child1 c2=new Child1(1);
    }
}