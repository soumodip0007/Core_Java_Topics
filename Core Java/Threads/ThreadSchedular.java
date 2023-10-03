class Mario extends Thread {
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i = 0; i <= 3; i++) {
             System.out.println(n);
        }
    }
}
class ThreadSchedular {
    public static void main(String[] args) {
        Mario m1 = new Mario();
        Mario m2 = new Mario();
        Mario m3 = new Mario();

        m1.setName("Thread 1");
        m2.setName("Thread 2");
        m3.setName("Thread 3");

        m1.start();
        m2.start();
        m3.start();
    }
}