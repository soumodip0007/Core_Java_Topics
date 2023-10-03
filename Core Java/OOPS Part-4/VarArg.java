 class Mario {
    void add(int ... a) { //var-args method
        int sum = 0;
        for(int x:a){
            sum = sum + x;
        }
        System.out.println("Sum of numbers: " +sum);
    }
}
class VarArg {
    public static void main(String[] args) {
        Mario m = new Mario();
        m.add();
        m.add(10);
        m.add(10,20);
        m.add(10,20,30);
        m.add(10,20,30,40);
        m.add(10,20,30,40,50);
    }
}
