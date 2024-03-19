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
//        OC obj=new OC();
//        OC.NC obj2= obj.new NC();
//        obj2.print();
//        obj2.setVal(11);
//        obj2.print();
//    }
//}