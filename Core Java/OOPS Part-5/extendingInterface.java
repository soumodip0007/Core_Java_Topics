interface Joey {
    void add();
}
interface Shaun extends Joey{
    void sub();
}
class Mario implements Shaun {
    @Override
    public void add() {
        int a=10,b=16,c;
        c=a+b;
        System.out.println("Addition: " +c);
    }
    @Override
    public void sub() {
        int a=20,b=16,c;
        c=a-b;
        System.out.println("Subtraction: " +c);
    }
}
public class extendingInterface {
    public static void main(String[] args) {
        Shaun s = new Mario();
        s.add();
        s.sub();
    }
}
