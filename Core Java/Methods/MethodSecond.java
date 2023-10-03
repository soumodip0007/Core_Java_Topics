import java.util.Scanner;
class MethodSecond {
    int a,b,value;
    public static void main(String[] args) {
        MethodSecond val = new MethodSecond();
        val.input();
        val.run();
        val.output();
    }
    void input(){
       System.out.println("Enter two numbers");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       b = sc.nextInt();
    }
    void run() {
       value = a + (a + b * ( a / b) % b);
    }
    void output() {
       System.out.println("The final value is: " +value);
    }
}
