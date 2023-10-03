class Greet extends Thread {
    public void run() {
        System.out.println("Example of isAlive method");
    }
}
class IsAliveMethod {
    public static void main(String[] args) {
        Greet t1 = new Greet();
        Greet t2 = new Greet();
        
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());

        System.out.println(t2.isAlive());
        t2.start();
        System.out.println(t2.isAlive());
    }
}

