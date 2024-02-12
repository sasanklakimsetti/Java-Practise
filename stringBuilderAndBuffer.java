public class stringBuilderAndBuffer {
    public static void main(String[] args){
        StringBuffer s1=new StringBuffer("Sasank");
        StringBuffer s1_1=new StringBuffer("Sasank");
        StringBuilder s2=new StringBuilder("SAsank");
        StringBuilder s2_2=new StringBuilder("Sasank");
        //s1.append(": 19");
        //s2.append(": Male");
        System.out.println(s1);
        System.out.println(s2);
        //incase of StringBUffer and builder we need to use .equals to compare them coz they both are declared using new keyword
        //if(s1==s2) System.out.println("same");      --->> this will show error during compile time
        if(s1.equals(s2)) System.out.println("same");   //this will print different though they both are same
        else if(s1.compareTo(s1_1)==0) System.out.println("same");         //if string buffer is provided then inside the compareTo it should be stringBuffer only and same with stringBuilder         //0 represents that all characters in the string are equal
        else System.out.println("diff");
        if(s2.compareTo(s2_2)==0) System.out.println("same");   //0 represents that all characters in the string are equal
        else System.out.println("diff");
    }
}