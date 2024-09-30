import java.util.Scanner;

public class MultiplicationTable {
    
    // multiplication table
    public static int[][] getMultiplicationTable(int size) {
        int[][] table = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        
        return table;
    }
    
    // print multiplication table method
    public static void printMultiplicationTable(int[][] table) {
        int size = table.length;

        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();
        
        int[][] multiplicationTable = getMultiplicationTable(size);
        
        printMultiplicationTable(multiplicationTable);
        
        // closing scanner
        scanner.close();
    }
}