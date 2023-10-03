class MultipleTryCatch {
    public static void main(String[] args) {
        try {
             int a=10,b=0,c;
             c=a/b;
             System.out.println(c);
        }
        catch(ArithmeticException a) {
            System.out.println(a);
        }
        try {
            int a[] = {1,2,3,4};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Main method ended");
    }
}