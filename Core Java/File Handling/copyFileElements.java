import java.io.*;
import java.io.IOException;
class copyFileElements {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\prita\\OneDrive\\Desktop\\JAVA\\Core Java\\File Handling\\Copy.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\prita\\OneDrive\\Desktop\\JAVA\\Core Java\\File Handling\\Paste.txt");
        
        int i;
        while((i = r.read()) != -1){
            w.write((char)i);
        }    
        System.out.println("Successfully copied");
    }
}