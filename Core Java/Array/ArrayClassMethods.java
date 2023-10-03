import java.util.Arrays;
class ArrayClassMethods { // without using loop
    public static void main(String[] args) {
        String arr[] = {"Mario", "Luigi", "Shaun"};

        System.out.println("toString() " + Arrays.toString(arr));
        System.out.println("asList() " + Arrays.asList(arr));

        int a[][] = {{10,20}, {30,40}, {50,60}};
        System.out.println("deepToString() " + Arrays.deepToString(a));
    }
}
