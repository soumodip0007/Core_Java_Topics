import java.util.Scanner;

interface user {
    void input(); // abstract + public

    void output(); // abstract + public
}

class Interface implements user {
    String name;
    int age;
    double tax;
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Enter your tax: ");
        tax = sc.nextDouble();

    }
    public void output() {
        System.out.println("Your details is => "+ "name="+name+ ", age="+ " " +age+ ", tax="+ tax);
    }

    public static void main(String[] args) {
        user u = new Interface();
        u.input();
        u.output();

    }
}
