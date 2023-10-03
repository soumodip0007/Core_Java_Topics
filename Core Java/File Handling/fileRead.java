import java.io.*;
class fileRead {
    public static void main(String[] args) throws IOException {
        try {
           FileReader f = new FileReader("C:\\Users\\prita\\OneDrive\\Desktop\\JAVA\\Core Java\\File Handling\\DemoRead.txt");
           try {
               int i;
               while((i=f.read()) != -1){
                 System.out.print((char)i);
               }
           } finally {
               f.close();
           }
        } catch(IOException e) {
             System.out.println(e);
        }
    }
}
