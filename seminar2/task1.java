package seminar2;
import java.io.*;
public class task1 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("seminar2\\n" + //
                "ote.txt")){
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char)i);
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
