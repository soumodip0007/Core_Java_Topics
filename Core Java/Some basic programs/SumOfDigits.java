import java.util.InputMismatchException;
import java.util.Scanner;

class SumOfDigits {
    public static void main(String args[]) throws InputMismatchException{
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}
