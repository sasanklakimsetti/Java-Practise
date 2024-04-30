import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//
//// take two files, if exists find the word with minimum length
//public class FileHandling3 {
//    static int minWord(String str){
//        int length=str.length();
//        return length;
//    }
//    public static void main(String[] args){
//        try{
//            File f1=new File("C://lpu//4th sem//CSE310//Code//file1.txt");
//            File f2=new File("C://lpu//4th sem//CSE310//Code//file2.txt");
//            Scanner s1=new Scanner(f1);
//            Scanner s2=new Scanner(f2);
//
//            int length1=1;
//            int length2=1;
//            StringBuilder data1=new StringBuilder();
//            StringBuilder data2=new StringBuilder();
//            while (s1.hasNext()){
//                StringBuilder data= new StringBuilder(s1.next());
//                int newLength1=minWord(String.valueOf(data));
//                if(newLength1<length1) {
//                    data1=data;
//                }
//            }
//            System.out.println("The smallest word in file1: "+data1);
//            while (s2.hasNext()){
//                StringBuilder data=new StringBuilder(s2.next());
//                int newLength2=minWord(String.valueOf(data));
//                if(newLength2<length2) {
//                    data2= data;
//                }
//            }
//            System.out.println("The smallest word in file2: "+data2);
//        } catch (FileNotFoundException e){
//            System.out.println("Exception caught");
//            System.out.println(e);
//        }catch (IOException e){
//            System.out.println("Exception caught");
//            System.out.println(e);
//        }
//    }
//}
public class FileHandling3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String fname1=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        try{
            FileReader f1=new FileReader(fname1);
            BufferedReader br=new BufferedReader(f1);
            String line;
            while((line=br.readLine())!=null){
                sb.append(line);
            }
            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String sentence=sb.toString();
        String smallest=findMin(sentence);
        System.out.println(smallest);
        System.out.println(smallest.length());
    }
    public static String findMin(String str){
        String[] words=str.split("\\s+");
        String smallest="";
        for(String word:words){
            if(word.length()>smallest.length()){
                smallest=word;
            }
        }
        return smallest;
    }
}