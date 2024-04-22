import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling{
    public static void main(String[] args) throws IOException {
        try {
            File f = new File("file1.txt");
            if(f.createNewFile())
                System.out.println("File created successfully");
            else System.out.println("File already exists");
            if (f.canWrite()) System.out.println("we can write into the file");
            else System.out.println("we can't write into the file");
            if (f.canRead()) System.out.println("we can read the file");
            else System.out.println("we can't read the file");
            System.out.println(f.getName());  //name of the file
            System.out.println(f.getAbsolutePath());  // path of the file
            System.out.println(f.length()); //length of the file
            if (f.delete()) System.out.println("file is deleted");  // the file will be deleted.
            else System.out.println("file can't be deleted");
        }catch(IOException e){
            System.out.println("Error in generating file.");
        }
        // f.createNewFile() will throw an exception so that to avoid that we have used try catch block
        // instead we can import java.io.Exception without using try catch block
        // in this we can't know whether  the file is created or not coz we are creating and deleting at the same time.

        try{
            File f2=new File("file2.txt");
            if(f2.createNewFile()) System.out.println("File2 is created");
            else System.out.println("File2 already exists");
            FileWriter w1=new FileWriter("file2.txt");
            if (f2.canWrite()){  // writes into the file
                System.out.println("we can write into the file");
                w1.write("Hello all");
                w1.close();  // important to do this otherwise you can't see whether it was written or not coz it thinks that we are still writing into the file.
            }
            else System.out.println("Error in writing into the file. can't write");
        } catch (IOException e){
            System.out.println("Error in creating the file");
        }
        //reading the file
        try{
            File obj=new File("file2.txt");
            Scanner sc=new Scanner(obj);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch (IOException e){
            System.out.println("Error in reading the file");
        }
        String str="Hai";
        // flush() in java
        try{
            FileWriter w2=new FileWriter("file2.txt");
            w2.write(str);
            w2.flush();
            // In Java, when you write data to a FileWriter, the data is not immediately written to disk. Instead, it’s stored in a buffer in memory. This is done for performance reasons, as writing to disk is much slower than writing to memory.
            // The flush() method is used to force all the buffered data to be written to disk immediately. This is useful in situations where you need to ensure that your data is saved to disk, even if your program crashes or is terminated unexpectedly.
            //After calling flush(), any data that was written to the FileWriter but not yet saved to disk will be saved. This is why it’s generally a good practice to call flush() before closing a FileWriter with close(). If you don’t call flush(), any unsaved data will be lost when the FileWriter is closed.
            w2.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
