import java.io.*;
import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse it...");
        String Str = sc.nextLine();
        String rev = "";

        for (int i = Str.length() - 1; i >= 0; i--) {
            rev = rev + Str.charAt(i);
        }
        System.out.println(rev);

    }
}