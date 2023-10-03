import java.lang.System;
import java.lang.String;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class fileReader {
   public static void main(String[] args) {
      try {
         File r = new File("C:\\Users\\Soumodip Das\\Desktop\\JAVA\\Packages\\PreDefined\\NODE.txt");
         Scanner sc = new Scanner(r);
         while(sc.hasNextLine()) {  // It will return true if the existing data has available data, otherwise it will return false
            System.out.println(sc.hasNextLine());
            System.out.println(sc.nextLine()); // It will return the data of a file
            System.out.println(sc.hasNextLine());
         }
      }
      catch(IOException e) {
            System.out.println("Exception Hanndled...!");
      }

   }
}