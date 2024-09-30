import java.util.Scanner;

public class GetArrayMean {

    // function to get mean
    public static double getArrayMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    
   //main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        // input each array element
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            array[i] = scanner.nextInt();
        }

        // mean in double
        double mean = getArrayMean(array);
        
        System.out.printf("Mean of array is: %.2f", mean);

        scanner.close();
    }
}
