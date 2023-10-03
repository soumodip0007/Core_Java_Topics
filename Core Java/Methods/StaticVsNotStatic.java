class StaticVsNotStatic {
    int a = 5;
    static int b = 7;
    public static void main(String[] args) {
        StaticVsNotStatic x = new StaticVsNotStatic();
        x.Display();
        StaticVsNotStatic.show();
    }
    static void show() {
        System.out.println("Show Method " +b);
    }
    void Display() {
        System.out.println("Display Method " +a+ " " +b);
    }
}
