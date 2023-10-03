// Method Overloading

class CTPoly {
    void add() {
        int a=100,b=200,c;
        c=a*b;
        System.out.println("The 1st value is :"+c);
    }
    // int add() {
    //     int a=100,b=200,c;
    //     c=a*b;
    //     return c;
    // }
    void add(int x, int y) {
        int c;
        c=x*y;
        System.out.println("The 2nd value is :"+c);
    }
    void add(int x, double y) {
        double c;
        c=x*y;
        System.out.println("The 3rd value is :"+c);
    }
    public static void main(String[] args) {
        CTPoly A = new CTPoly();
        A.add();
        // int add = A.add();
        // System.out.println("The 1st value is :"+add);
        A.add(1000, 2000);
        A.add(10000, 200.20);
        
    }
}