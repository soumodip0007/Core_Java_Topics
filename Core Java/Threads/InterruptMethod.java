class Greet extends Thread {
    public void run() {
        try {
            for(int i=0; i<=5; i++) {
                System.out.println("t1 thread is running");
                Thread.sleep(1000); //waiting
            }
        }
        catch(InterruptedException e) {
            System.out.println("t1 thread terminated");
        }
    }
}
class InterruptMethod {
    public static void main(String[] args) {
        Greet t1 = new Greet();

        t1.start();
        // t1.interrupt();
    }
}
