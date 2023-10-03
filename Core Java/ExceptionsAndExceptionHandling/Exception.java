// class Exception {
//     public static void main(String[] args) {
//         System.out.println("Main method started");
//         int a = 45, b = 0, c;
//         c = a/b; // c=45/0
//         System.out.println(c);
//         System.out.println("Main method ended");
//     }
// }

class Exception {
    public static void main(String[] args) {
        System.out.println("Main method started");
        int a = 45, b = 0, c;
        try {
            c = a/b; // c=45/0
            System.out.println(c);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Main method ended");
    }
}