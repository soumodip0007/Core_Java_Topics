import java.io.File;
import java.io.IOException;

public class renameFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\prita\\OneDrive\\Desktop\\JAVA\\Core Java\\File Handling\\Rename.txt");
        File r = new File("C:\\Users\\prita\\OneDrive\\Desktop\\JAVA\\Core Java\\File Handling\\RenameOne.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        } else {
            System.out.println("File doesn't exists");
        }
    }
}
