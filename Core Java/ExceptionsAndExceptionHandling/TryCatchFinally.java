class TryCatchFinally {
    public static void main(String[] args) {
        try {
             System.out.println("Operations");
             int a=20,b=0,c;
             c=a/b;
             System.out.println(c);
             System.out.println("Result");
        }
        catch(ArithmeticException e) {
             System.out.println("cannot divide by zero");
        }
        finally {
             System.out.println("finally block");
        }
        System.out.println("Main method ended");
    }
}