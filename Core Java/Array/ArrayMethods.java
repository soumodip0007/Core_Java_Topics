import java.util.Scanner;
import java.util.Arrays;

class ArrayMethods {
    public static void main(String[] args) {
        //sort method
        // int a[] = new int[5];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Elements in Array");
        // for(int i = 0; i<a.length; i++){
        //     a[i] = sc.nextInt();
        // }
        // Arrays.sort(a);
        // for(int i = 0; i<a.length; i++){
        //     System.out.print(a[i]+" ");
        // }
        
        //equals method
        int a[] = new int[5];
        int a2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in First Array");
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Elements in Second Array");
        for(int i = 0; i<a2.length; i++){
            a2[i] = sc.nextInt();
        }

        boolean b = Arrays.equals(a, a2);
        System.out.print("Equal or Not? " +b);
    }
}
