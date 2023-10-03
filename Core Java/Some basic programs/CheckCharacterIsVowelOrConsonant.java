import java.util.Scanner;

class CheckCharacterIsVowelOrConsonant {
    public static void main(String[] args) {
        System.out.print("Please enter a character: ");
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);

        if (chr == 'a' || chr == 'e' || chr == 'i'
                || chr == 'o' || chr == 'u') {
                    System.out.println(chr + " is vowel.");
            } else {
                    System.out.println(chr + " is consonant.");
            }
    }
}
