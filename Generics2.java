class G1<E>{
    E a;
    public G1(E a){
        this.a=a;
    }
    void show(){
        System.out.println(a);
    }
}
class G2<E,V>{
    E a;
    V b;
    public G2(E a, V b){
        this.a=a;
        this.b=b;
    }
    void show(){
        System.out.println(a+" "+b);
    }
}
public class Generics2 {
    public static void main(String[] args){
        G1<Integer>g1=new G1<>(5);
        G2<String, Integer> g2=new G2<>("Sasank",19);
        g1.show();
        g2.show();
    }
}