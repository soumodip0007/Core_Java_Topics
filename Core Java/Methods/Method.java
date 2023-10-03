class Method {
    public static void add() {
        int a=5,b=7;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Method a =  new Method();
        a.Display();
        Method.add();
        Method.add();
        Method.add();
        Method.add();
    }
    void Display() {
        System.out.println("First Method");
    }
}
