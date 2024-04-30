import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class FileHandling2 {
    public static void main(String[] args) {
        try{
            File f1=new File("file1.txt");
            if(f1.createNewFile()){
                System.out.println("File is created at "+f1.getAbsolutePath());
            }
            else System.out.println("File already exists at "+f1.getAbsolutePath());
            if(f1.canWrite()){
                System.out.println("We can write in the file");
                FileWriter w1=new FileWriter("file1.txt");
                w1.write("Hello, this is Sasank");
                w1.close();
                System.out.println("Successfully written into the file");
            }
            else{
                System.out.println("We can't write into the file");
            }
            if(f1.canRead()){
                System.out.println("We can read the file");
                Scanner myReader=new Scanner(f1);
                while (myReader.hasNextLine()){
                    String data=myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            }
            else System.out.println("We can't read the file");
            if (f1.exists()){
                System.out.println("File Details");
                System.out.println("File Name: "+f1.getName());
                System.out.println("File path: "+f1.getAbsolutePath());
                System.out.println("Writable: "+f1.canWrite());
                System.out.println("Readable: "+f1.canRead());
                System.out.println("File Size: "+f1.length());
            }
            else System.out.println("File doesn't exist");
            if(f1.delete()) System.out.println("File1 got deleted successfully");
            else System.out.println("Couldn't delete the file");
        }catch (FileNotFoundException e){
            System.out.println("Exception caught");
            System.out.println(e);
        } catch(IOException e){
            System.out.println("Exception caught");
            System.out.println(e);
        }
    }
}