// Method overriding
class Greet {
    int c;
    void show(int a, int b) {
        c = a*b;
        System.out.println("The 1st value is: "+c);
    }
}
class Mario extends Greet {
    int c;
    @Override
    void show(int a, int b) {
        c = a/b;
        // super.show(a,b);
        System.out.println("The 2nd value is: "+c);
    }
}
class RTPoly {
    public static void main(String[] args) {
        Greet A = new Mario(); // We will make object of sub class using the reference of super class
        A.show(1000,200);
    }
}