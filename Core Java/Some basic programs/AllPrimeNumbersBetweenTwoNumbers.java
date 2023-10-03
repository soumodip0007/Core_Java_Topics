import java.util.Scanner;

class AllPrimeNumbersBetweenTwoNumbers {
    public static void main(String[] args) {
        int endingNumber, startingNumber, i;
        boolean temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        startingNumber = sc.nextInt();
        System.out.print("Enter an ending Number: ");
        endingNumber = sc.nextInt();
        System.out.println("The prime numbers between the two given numbers " + startingNumber + " and " + endingNumber + " are:");
        while (startingNumber < endingNumber) {
            temp = false;
            for (i = 2; i <= startingNumber / 2; ++i) {
                if (startingNumber % i == 0) {
                    temp = true;
                    break;
                }
            }
            if (!temp && startingNumber != 0 && startingNumber != 1)
                System.out.print(startingNumber + " ");
            ++startingNumber;
        }
    }
}