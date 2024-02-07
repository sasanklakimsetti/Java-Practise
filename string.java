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
    }
}