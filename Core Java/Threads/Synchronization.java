//Problem due to multithreading

class Spoon implements Runnable {
    int available = 1, people;
    Spoon(int people) {
        this.people = people; //people = 1
    }
    public void run() {  //t1 t2 t3
        String name = Thread.currentThread().getName();
        if(available >= people) {
            System.out.println(name +" got the spoon.");
            available = available - people;
        }
        else {
            System.out.println("Sorry spoon not available");
        }
    }
}

class Synchronization {
    public static void main(String[] args) {
        Spoon s = new Spoon(1);

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("Mario");
        t2.setName("Shaun");
        t3.setName("Luigi");
        
        t1.start();
        t2.start();
        t3.start();
    }
}


//Synchronization

// class Spoon implements Runnable {
//     int available = 1, people;
//     Spoon(int people) {
//         this.people = people; //people = 1
//     }
//     public synchronized void run() {  //t1 t2 t3
//         String name = Thread.currentThread().getName();
//         if(available >= people) {  //0 >= 1
//             System.out.println(name +" got the spoon.");
//             available = available - people;  //1-1 = 0
//         }
//         else {
//             System.out.println("Sorry spoon not available");
//         }
//     }
// }

// class Synchronization {
//     public static void main(String[] args) {
//         Spoon s = new Spoon(1);

//         Thread t1 = new Thread(s);
//         Thread t2 = new Thread(s);
//         Thread t3 = new Thread(s);

//         t1.setName("Mario");
//         t2.setName("Shaun");
//         t3.setName("Luigi");
        
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }
