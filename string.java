import java.util.Locale;

public class string {
    public static void main(String[] args){
        String s="Hello";
        System.out.println(s.length());
        s=s.concat(", this is Sasank");
        s=s.toLowerCase();
        System.out.println(s);
        s=s.toUpperCase();
        System.out.println(s);
        String sub1=s.substring(1);   //if only begin index is provided it will consider the substring from there upto last
        System.out.println(sub1);
        String sub2=s.substring(0,4);  //but here it will consider from 0th and goes till 3rd index and exclude 4th index
        System.out.println(sub2);
        //to check whether two strings are same
        String str1="Sasank";
        String str2=new String("Sasank");
        String str3="Sasank";
        String str4="SASANK";
        if(str1==str2) System.out.println("Same");
        else if(str1.equals(str2)) System.out.println("Same");
        else System.out.println("Different");
        if(str1==str3) System.out.println("same");
        else System.out.println("different");

        //if we declare a string in compile time then they both will be situated in the same string pool so then s1 == s2 works to compare two strings.
        //whereas when we declare a string on run time then there will be seperated memory address created for it and then the address gets changed so s1 == s2 doesn't work. we need to use s1.equals(s2)
        //in java, strings will be compared according to their addresses if we use == operator whereas if we use s1.equals(s2) then the compiler will compare their values.
        if(str1.equals(str4)) System.out.println("Same");   //consider whether uppercase or lowercase
        else if(str1.equalsIgnoreCase(str4)) System.out.println("Same");   //doesn't consider uppercase or lowercase
        else System.out.println("different");
    }
}