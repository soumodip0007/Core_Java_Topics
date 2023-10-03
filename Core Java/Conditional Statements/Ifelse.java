import java.util.Scanner;

class Ifelse {
    public static void main(String args[])
    {
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are not eligible for vote");
        } 
    }
}
