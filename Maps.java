// Parts of Collections
//Maps
// They are key, value pairs
//HashMap : order of insertion is not maintained
//TreeMap : sorting of the data is maintained
//LinkedHashMap : order of insertion is maintained
import java.util.HashMap;
import java.util.Map;
public class Maps {
    public static void main(String[] args){
        // HashMap
        HashMap<String, Integer> hm=new HashMap<>();
        // hm.put(key,value)
        hm.put("Sasank",10);
        hm.put("Karthikeya",21);
        System.out.println("The HashMap is "+ hm);
        System.out.println("The size of HashMap is "+hm.size());
        hm.remove("Sasank");
        System.out.println("The HashMap is "+ hm);
        System.out.println("The size of HashMap is "+hm.size());
        // will remove the key Sasank
        hm.put("Sasank",10);
        hm.clear();  // clears the whole HashMap
        System.out.println("The HashMap is "+ hm);
        System.out.println("The size of HashMap is "+hm.size());
        hm.put("Sasank",10);
        hm.put("Karthikeya",21);
        System.out.print("The HashMap is ");
        //traversal of HashMap using for each loop
        for(Map.Entry<String,Integer> e:hm.entrySet()){
            System.out.print(e.getKey()+" "+e.getValue()+" ");
        }

        // HashMap internally use Hash Tables
    }
}

