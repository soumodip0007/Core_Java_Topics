class Greet extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
            for(int i=0; i<=3; i++) {
                System.out.println(n);
            }
    }
}
class SuspendAndResume {
    public static void main(String[] args) {
        Greet t1 = new Greet();
        Greet t2 = new Greet();
        Greet t3 = new Greet();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();

        t2.start();
        t2.suspend(); //pause

        t3.start();

        t2.resume();  //restart
    }
}

