//Nested classes helps in encapsulation which is the pillar of oops
//these are divided into two types:
//1.Static
//2.Non-static : local, anonymous: (a class without name, only single instance can be created) (either extend a class or implement an interface at a time. can't do both at single time) (can't declare static initializers, if there is any static member, it needs to be declared as final)

//features of nested classes
//nested classes are bounded in the scope of outer class i.e. whatever it can do, can do inside the outer class only
//nested classes are closely coupled to outer class i.e. first instantiate Outer class OC and then with reference of OC instantiante object NC.
class OC{
    //nested class / inner class
    class NC{
        int val=10;
        void print(){
            System.out.println("The value is "+val);
        }
        void setVal(int x){
            this.val=x;
        }
    }
}
class OC2{
    static int val=10; //if it is not static, when we try to access it. it will throw an error
    //coz static class can access only static variables
    //static nested class
    static class NC2{
        void print(){
            System.out.println("the value is "+val);
        }
        void setVal(int x){
            val=x;
        }
    }
}
//example for creating a nested class when the nested class is static
public class NestedClass {
    public static void main(String[] args){
        OC2.NC2 obj= new OC2.NC2();
        obj.print();
        obj.setVal(12);
        obj.print();
    }
}

//example for creating a nested class when the nested class is non-static
//public class NestedClass {
//    public static void main(String[] args){
//        //to instantiate a nested class
//        //first instantiate Outer class OC and then with reference of OC instantiante object NC.
//example of closely coupling
//        OC obj=new OC();
//        OC.NC obj2= obj.new NC();
//        obj2.print();
//        obj2.setVal(11);
//        obj2.print();
//    }
//}