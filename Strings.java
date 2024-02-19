import java.util.Scanner;

//various use cases of string in java
public class Strings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String emptyString=new String();    //creates an empty string
        System.out.println(emptyString);
        String str2=new String(str);   //stores a string into new string
        System.out.println(str2);
        char[] ch={'H','e','l','l','o'};
        String chStr=new String(ch);   //stores a char array into string
        System.out.println(chStr);
        System.out.println(chStr.length());  //prints length of the string
        System.out.print("enter index: ");int index=sc.nextInt();
        System.out.println(chStr.charAt(index));      //prints the specific character of the mentioned index in the string
        String sub=chStr.substring(3); //stores the substring from index 3 to last
        String sub2=chStr.substring(2,4);  //stores the substring from index 2(inclusive) to index 4(exclusive)

        String c1="Sasank";
        String c2="Lakimsetti";
        String c3=c1.concat(c2);   //concatenation of two strings
        System.out.println(c3);

        char oc=sc.next().charAt(0);
        System.out.println(chStr.indexOf(oc));   //prints the first or last occurrence of the mentioned character in the string      -1 indicates that the character is not present in the actual string

        //conversion of string into primitive datatypes
        String con="123";
        System.out.println(con);
        int con1=Integer.parseInt(con);
        System.out.println(con1);
        double con2=Double.parseDouble(con);
        System.out.println(con2);
        long con3=Long.parseLong(con);
        System.out.println(con3);
    }
}