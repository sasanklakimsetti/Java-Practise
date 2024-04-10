//Part of Collections
//Sets
//HashSet
//LinkedHashSet
//TreeSet
import java.util.*;
public class Set {
    public static void main(String[] args){
        // HashSet
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(1);
        hs.add(3);
        hs.add(3);
        hs.add(2);
        hs.add(2);
        hs.add(2);
        hs.add(2);
        System.out.println("The hashset is "+hs); //Unique Elements
        // HashSet does not allow duplicate elements. It ensures that each element in the set is unique based on the equals() method.
        // It will be in sorted order
        System.out.println("Size is "+hs.size());// size 3
        System.out.println(hs.contains(4));  //checks whether the given element is present or not.
        hs.clear();
        System.out.println("The hashset is "+hs);  //clears everything
        System.out.println("Size is "+hs.size());  //size will be zero

        HashSet<Integer> hs2=new HashSet<>();
        hs2.add(1);
        hs2.add(3);
        hs2.add(2);
        System.out.println("The second hashset is "+hs2);
        // Unordered Collection: HashSet does not guarantee any specific order for its elements.
        HashSet<Integer> hs3=new HashSet<>();
        hs3.add(1);
        hs3.add(2);
        hs3.add(1);
        hs3.add(3);
        //traversing hashset
        //using for each loop
        System.out.print("The third hashset is ");
        for(var e : hs3){
            System.out.print(e+" ");
        }
        System.out.println();
        //using Iterators
        Iterator<Integer> it=hs3.iterator();
        //purpose of giving datatype to the iterator : It will understand how much space to provide to the Iterator
        System.out.print("The third hashset using Iterators: ");
        System.out.print(it.next());
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        // LinkedHashSet
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(-1);
        lhs.add(3);
        lhs.add(100);
        lhs.add(-1);
        System.out.println("The LinkedHashSet is "+lhs);
        //it will print in the same order that we have inserted and won't contain duplicates

        // TreeSet
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(0);
        ts.add(-1);
        ts.add(3);
        ts.add(100);
        ts.add(-1);
        System.out.println("The TreeSet is "+ts);
        // It will sort the set and print the set
        // It doesn't contain duplicates

        //Conversion of treeset into an array
        Integer arr[]=Arrays.copyOf(ts.toArray(),ts.size(),Integer[].class);
        String ts_Str=ts.toString();
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        // Conversion of TreeSet into a String
        System.out.println(ts_Str);

        //Internally HashTable is used in them
    }
}

//Time complexities for HS, TS and LHS
//add: O(1)
//    clear:O(N)
//    contains: O(1)
//    size: O(!)