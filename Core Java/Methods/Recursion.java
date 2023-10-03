import java.util.Scanner;
class Recursion {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number to find it's factorial");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Recursion r = new Recursion();
        int value = r.factorial(n);
        System.out.println("Factorial is: "+ value);
    }
    int factorial(int n){
        if(n==1){
            return 1;
        } else {
            return n*factorial(n-1); // calling itself
        }
    }
}
