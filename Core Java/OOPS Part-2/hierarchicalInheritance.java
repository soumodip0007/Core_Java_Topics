class Greet {   //super class 
    void input() {
        System.out.println("Enter your name");
    }
}
class Mario extends Greet {
    void show() {
        System.out.println("Your name is Mario");
    }
}
class Luigi extends Greet {
    void display() {
        System.out.println("Your name is Luigi");
    }
}
class hierarchicalInheritance {
    public static void main(String[] args) {
        Mario A = new Mario();
        Luigi B = new Luigi();
        A.input();
        A.show();
        B.input();
        B.display();
    }
}