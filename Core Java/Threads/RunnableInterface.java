class Mario implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("My child thread");
        }
    }
}
class RunnableInterface {
    public static void main(String[] args) {
        Mario m = new Mario();

        Thread t = new Thread(m);
        t.start();

        for(int i=1; i<=5; i++) {
            System.out.println("Main thread");
        }
    }
}
