class Show<E>{
    E a;
    E b;
    Show(E a, E b){
        this.a=a;
        this.b=b;
    }
    void show(){
        System.out.println(a+" "+b);
    }
}
class PersoN<E,V>{
    E name;
    V age;
    PersoN(E name, V age){
        this.name=name;
        this.age=age;
    }
    void intro(){
        System.out.println("My name is "+name+" and my age is "+age);
    }
}
public class Generics1 {
    public static void main(String[] args){
        Show<Double> obj=new Show<>(5.55,5.55);
        obj.show();

        PersoN<String,Integer> p1=new PersoN<>("Sasank",19);
        PersoN<String,Integer> p2=new PersoN<>("Karthikeya",18);
        p1.intro();
        p2.intro();
    }
}
//E means generic class
//If we use Generic class, we can use any primitive data types but we need to declare the primitive data type in main inside the diamond operator <> of object delcaration.