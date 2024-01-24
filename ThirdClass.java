public class ThirdClass{
    public static void fun(){
        System.out.println("HI");
    }
    public static void fun2(){
        fun();
    }
    public static void main(String[] args){
        fun2();
    }
}