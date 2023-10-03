class msg {
    public synchronized void show(String name) {
        ;;;;;; //100 LOC

        synchronized(this) {
            for(int i = 1; i <= 3; i++) {
                System.out.println("How are you? " +name);
            }
        }
        ;;;;;; //100 LOC
    }
}
class NewThread extends Thread {
    msg m;
    String name;
    NewThread(msg m, String name) {
        this.m = m;
        this.name = name;
    }
    public void run() {
        m.show(name);
    }
}
class BlockLevel {
    public static void main(String[] args) {
        msg m = new msg();
        NewThread t1 = new NewThread(m, "Mario");
        NewThread t2 = new NewThread(m, "Shaun");
        t1.start();
        t2.start();
    }
}
