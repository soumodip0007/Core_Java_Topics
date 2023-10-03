class StringMethods {
    public static void main(String[] args) {
        String nameOne = "Mario";
        String nameTwo = "Luigi";
        String nameThree = "     Shaun     ";
        String nameFour = "";

        System.out.println(nameOne.toLowerCase());
        System.out.println(nameTwo.toUpperCase());

        System.out.println(nameOne.concat(nameTwo));
        System.out.println(nameOne.length());

        System.out.println(nameThree.trim());
        System.out.println(nameFour.isEmpty());

        System.out.println(nameOne.charAt(3));
        System.out.println(nameTwo.indexOf("u"));

        System.out.println(nameOne.equals(nameTwo));
        System.out.println(nameOne.replace('o','x'));

    }
}
