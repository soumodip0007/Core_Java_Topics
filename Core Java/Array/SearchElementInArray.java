import java.util.Scanner;

class SearchElementInArray {
    public static void main(String[] args) {
        int a[] = new int[5]; int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Array");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("\nEnter Search Elements");
        n = sc.nextInt();
        for(int i=0; i<a.length; i++){
            if(a[i] == n){
                count++;
            }
        }
        if(count>0){
            System.out.println("Item Found");
        } else {
            System.out.println("Item Not Found");
        }

    }
}
