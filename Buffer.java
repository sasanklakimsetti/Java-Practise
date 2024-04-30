import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Buffer {
    public static void main(String[] args){
        try{
            File f1=new File("file1.txt");
            if(f1.createNewFile()) System.out.println("File created successfully at "+f1.getAbsolutePath());
            else System.out.println("File wasn't created");
            if(f1.canWrite()){
                System.out.println("We can write into the file");
                FileWriter w1=new FileWriter(f1);
                BufferedWriter bw=new BufferedWriter(w1);
                Scanner sc=new Scanner(System.in);
                System.out.println("Writing into the file by taking input from the console");
                System.out.println("Enter the input to be written into the file(type 'exit' if you want to stop): ");
                while (true){
                    String input=sc.nextLine();
                    if(input.equalsIgnoreCase("exit")) break;
                    bw.write(input);
                    bw.newLine();
                }
                bw.close();
                System.out.println("Data written into the file successfully");
                sc.close();
                w1.close();
            }
            else System.out.println("We can't write into the file");
        }catch (IOException e){
            System.out.println("Exception caught");
            System.out.println(e);
        }
    }
}