import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new File("output.txt"));
            pw.println("Hello world!");
            pw.close();
        } catch(FileNotFoundExcepton e) {
            System.out.println("Something went wrong writing to output.txt.");
        }
    }
}