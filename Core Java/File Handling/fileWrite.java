import java.io.*;
import java.io.IOException;

class fileWrite {
    public static void main(String[] args){
        try {
           FileWriter f = new FileWriter("C:\\Users\\prita\\OneDrive\\Desktop\\JAVA\\Core Java\\File Handling\\DemoWrite.txt");
           try {
               f.write("This is a example of file writing");
           } finally {
               f.close();
           }
           System.out.println("File was written");
        } catch(IOException e) {
             System.out.println(e);
        }
    }
}
