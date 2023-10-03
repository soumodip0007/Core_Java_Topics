import java.util.Scanner;

public class EvenNumbers0ToN {
    public static void main(String[] args) {
        int number, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number : ");
        number = sc.nextInt();

        for (i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}