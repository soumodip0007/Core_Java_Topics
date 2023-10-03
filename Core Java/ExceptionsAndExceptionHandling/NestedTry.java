class NestedTry {
   public static void main(String[] args) {
    try {
        try {
          int arr[] = {1,2,3,4};
          System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException a) {
          System.out.println(a);
        }
        System.out.println(10/0);
     }
     catch(ArithmeticException e){
      System.out.println(e);
     }
     System.out.println("Ended");
   }
}