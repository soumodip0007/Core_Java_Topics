class Greet extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        try {
            for(int i=0; i<=3; i++) {
                System.out.println(n);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
class sleepMethod {
    public static void main(String[] args) {
        Greet t1 = new Greet();
        Greet t2 = new Greet();
        Greet t3 = new Greet();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}