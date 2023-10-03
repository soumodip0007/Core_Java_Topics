class Greet extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
            for(int i=0; i<=3; i++) {
                System.out.println(n);
                Thread.yield();
            }
    }
}
class Mario extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
            for(int i=0; i<=3; i++) {
                System.out.println(n);
            }
    }
}
class YieldMethod {
    public static void main(String[] args) {
        Greet t1 = new Greet();
        Mario t2 = new Mario();

        t1.setName("thread 1");
        t2.setName("thread 2");

        t1.start();
        t2.start();
    }
}

