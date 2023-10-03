class Greet {   //super class
    int a,b,c;
    void add(){
        a=100; b=200;
        c=a+b;
        System.out.println("Addition is:" +c);
    }
    void sub(){
        a=200; b=100;
        c=a-b;
        System.out.println("Subtraction is:" +c);
    }
}
class Mario extends Greet {   //first sub class
    void mult(){
        a=100; b=200;
        c=a*b;
        System.out.println("Multiplication is:" +c);
    }
    void div(){
        a=1000; b=200;
        c=a/b;
        System.out.println("Division is:" +c);
    }
}
class Luigi extends Mario {   //Second sub class
    void rem(){
        a=100; b=30;
        c=a%b;
        System.out.println("Remainder is:" +c);
    }
}
class multilevelInheritance {
    public static void main(String[] args) {
        Luigi A = new Luigi();
        A.add();
        A.sub();
        A.mult();
        A.div();
        A.rem();
    }
}