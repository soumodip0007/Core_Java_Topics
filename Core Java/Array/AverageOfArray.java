import java.util.Scanner;

class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        double total = 0;
        double array[] = new double[n];
        System.out.println("Enter the elements one by one:");
        for (int s = 0; s < array.length; s++) {
            array[s] = sc.nextDouble();
        }
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        double average = total / n;
        System.out.println("The averag value is:" + average);

    }
}
