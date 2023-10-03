class Greet extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class SetPriorityAndGetPriority {
    public static void main(String[] args) {
        Greet t1 = new Greet();
        Greet t2 = new Greet();
        Greet t3 = new Greet();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.setPriority(2);
        t2.setPriority(6);
        t3.setPriority(9);

        t1.start();
        t2.start();
        t3.start();
    }
}
