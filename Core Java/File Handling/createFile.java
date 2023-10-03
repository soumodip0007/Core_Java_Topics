import java.io.*;
import java.io.IOException;

class createFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\prita\\OneDrive\\Desktop\\JAVA\\Core Java\\File Handling\\notes.txt");
        if(f.createNewFile()){
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
    }
}