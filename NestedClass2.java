//non-static
class OC1{
    int val=10;
    class IC{
        void print(){
            System.out.println("The value is "+val);
        }
    }
}
public class NestedClass2 {
    public static void main(String[] args){
        OC1 obj=new OC1();
        OC1.IC obj2=obj.new IC();
        obj2.print();
    }
}