// Collections in java
// ArrayList
import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer>arr=new ArrayList<>();   //this will only accept integer variable since we provided Integer wrapper class in arrow
        ArrayList<Integer>arr2=new ArrayList<>(5);
        // ArrayList are dynamic no matter what we have provided in initial capacity
        arr2.add(0,3);
        arr2.add(1,3);
        System.out.println(arr+" "+arr2);  //this will print an empty arrayList and an arrayList with array elements
        //in normal way
        for(int i=0;i<arr2.size();i++)   //using size() instead of length()
            System.out.print(arr2.get(i)+" ");  //using get(i) instead of arr2[i]
        int[] arr3=new int[10];
        System.out.println(arr3);  //address will be printed
        List<Integer>arr4=new ArrayList<>();   //we can do this as well just like inheritance
        arr4.add(1);
        System.out.println(arr4);
    }
}