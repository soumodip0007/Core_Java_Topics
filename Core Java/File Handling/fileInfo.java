import java.io.*;

class fileInfo {
    public static void main(String[] args) throws IOException{
        File f = new File("C:\\Users\\prita\\OneDrive\\Desktop\\JAVA\\Core Java\\File Handling\\Demo.txt");
        if(f.exists()){
            System.out.println("File name is :" +f.getName());
            System.out.println("File location is :" +f.getAbsolutePath());
            System.out.println("Checking file writable or not :" +f.canWrite());
            System.out.println("Checking file readable or not :" +f.canRead());
            System.out.println("File size is :" +f.length() + " bytes");
            System.out.println("Delete the file :" +f.delete());
        } else {
            System.out.println("File doesn't exists");
        }
    }
}
