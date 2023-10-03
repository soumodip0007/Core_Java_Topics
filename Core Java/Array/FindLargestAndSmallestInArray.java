import java.util.Scanner;
class FindLargestAndSmallestInArray {
    public static void main(String args[]) {
        int count, largest, smallest, i;
        int[] inputArray = new int[500];
   
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        count = sc.nextInt();
        System.out.println("Enter " + count + " elements");
         
        for(i = 0; i < count; i++) {
            inputArray[i] = sc.nextInt();
        }
   
        largest = smallest = inputArray[0];
         
        for(i = 1; i < count; i++) {
            if(inputArray[i] > largest)
                largest = inputArray[i];
            else if (inputArray[i] < smallest)
                smallest = inputArray[i];     
        }  
        System.out.println("Largest Number : " + largest);
        System.out.println("Smallest Number : " + smallest);
    }
}