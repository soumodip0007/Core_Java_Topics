import java.util.Scanner;

class TakeCharacterInputFromUser {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a character: ");
            char c = sc.next().charAt(0);
            System.out.println("You have entered " + c);
        }
    }
}
