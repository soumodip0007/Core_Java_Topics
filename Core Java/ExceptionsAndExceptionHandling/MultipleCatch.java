import java.lang.Exception;
// class MultipleCatch {
//     public static void main(String[] args) {
//         try {
//             int a=10,b=2,c;
//             c=a/b;
//             System.out.println(c);

//             int arr[] = {1,2,3,4};
//             System.out.println(arr[1]);

//             String str = "Greet";
//             System.out.println(str.toUpperCase());
//         }
//         catch(ArithmeticException e) {
//             System.out.println("Arithmetic Exception");
//         }
//         catch (ArrayIndexOutOfBoundsException a) {
//             System.out.println("ArrayIndexOutOfBounds Exception");
//         }
//         catch(NumberFormatException n) {
//             System.out.println("NumberFormat Exception");
//         }
//         catch(Exception x) {
//             System.out.println("All types of exception handled");
//         }
//           System.out.println("Main method ended");
//     }
// }

class MultipleCatch {
        public static void main(String[] args) {
            try {
                int a=10,b=0,c;
                c=a/b;
                System.out.println(c);
    
                int arr[] = {1,2,3,4};
                System.out.println(arr[9]);
    
                String str = null;
                System.out.println(str.toUpperCase());
            }
            catch(ArithmeticException e) {
                System.out.println("Arithmetic Exception");
            }
            catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("ArrayIndexOutOfBounds Exception");
            }
            catch(NumberFormatException n) {
                System.out.println("NumberFormat Exception");
            }
            catch(Exception x) {
                System.out.println(x);
            }
            System.out.println("Main method ended");
        }
    }