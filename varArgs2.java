//take any number of arguments of string type and print them
public class varArgs2 {
    void Print(String... s){
        for(var e:s){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        varArgs2 v=new varArgs2();
        v.Print("Hi,","My","name","is","Sasank");
    }
}