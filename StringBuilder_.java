import java.util.Scanner;

//various use cases of String Builder in java
public class StringBuilder_ {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb);
        System.out.print("Enter any string to append: ");String ap=sc.nextLine();
        sb=sb.append(ap);
        System.out.println(sb);
        sb.insert(sb.length()-1,'!');   //inserts a new character or string at specified offset
        System.out.println(sb);
        sb=sb.delete(6,11);   //deletes part of string b/w specified indices
        System.out.println(sb);
        sb=sb.reverse(); //reverses the string
        System.out.println(sb);
        str = sb.toString();   //converts a string builder into string
        System.out.println(str);
    }
}