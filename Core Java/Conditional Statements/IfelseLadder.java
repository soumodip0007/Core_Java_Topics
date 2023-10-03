import java.util.Scanner;

class IfelseLadder {
    public static void main(String args[])
    {
        int gameScore;
        System.out.println("Enter Your Game Score");
        System.out.println("Top score is 1000");
        Scanner sc = new Scanner(System.in);
        gameScore = sc.nextInt();
        if (gameScore >= 800) {
            System.out.println("You are pro");
        } else if(gameScore >= 600) {
            System.out.println("Moderate");
        } else if(gameScore >= 400) {
            System.out.println("Ok Fine!");
        } else {
            System.out.println("lol - noob!");
        }
    }
}
