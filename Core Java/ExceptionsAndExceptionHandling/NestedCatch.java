import java.lang.Exception;
class NestedCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch(Exception e) {
            System.out.println(e);
            try {
                String a = "A";
                System.out.println(a.toLowerCase());
            }
            catch(NullPointerException n) {
                System.out.println("Null value cannot be converted");
            }
            
        }
        System.out.println("Main method Ended");
    }
}
