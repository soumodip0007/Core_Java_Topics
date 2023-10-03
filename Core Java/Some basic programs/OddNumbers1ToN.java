import java.util.Scanner;

class OddNumbers1ToN {
    public static void main(String[] args) {
        int number, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number : ");
        number = sc.nextInt();

        for (i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
