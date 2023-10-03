import java.lang.Exception;
class NestedFinally {
    public static void main(String[] args) {
        try {
            String a = "mario";
            System.out.println(a.toUpperCase());
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            try {
               System.out.println(10/0);
            } 
            catch(ArithmeticException a) {
                System.out.println(a);
            }
            finally {
                System.out.println("Exceptions handled");
            }
        }
        System.out.println("Main method Ended");
    }
}