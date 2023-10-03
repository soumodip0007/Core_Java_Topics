class nfe {
    public static void main(String[] args) {
        String str = "Hello";
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch(NumberFormatException e) {
            // System.out.println(e);
            System.out.println("String " +str+ " cannot be converted to integer");
        }
        System.out.println("String NumberFormatException");
    }
}