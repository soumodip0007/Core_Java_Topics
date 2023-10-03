class ExtendingThreadClasses extends Thread {
   public void run() {
      try {
         for (int i = 0; i < 5; i++) {
            System.out.println("Mario");
            Thread.sleep(1000);
         }
      } catch (InterruptedException e) {
         System.out.println("Exception handled");
      }
   }
}
class ExtendingThreadClassesObject {
   public static void main(String[] args) throws InterruptedException {
      ExtendingThreadClasses e = new ExtendingThreadClasses();
      e.start();
      for (int i = 0; i < 5; i++) {
         System.out.println("Greet");
         Thread.sleep(1000);
      }
   }
}
