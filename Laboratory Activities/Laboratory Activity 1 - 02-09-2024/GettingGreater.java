import java.util.Scanner;

class GettingGreater {

    public static void main(String[] args) {
        Scanner chValue = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        // Use to get first value only at index 0
        char ch1 = chValue.next().charAt(0);
        System.out.print("Enter the second character: ");
        // Use to get first value only at index 0
        char ch2 = chValue.next().charAt(0);
        char greaterChar = (char) Math.max(ch1, ch2);
        // Show Output
        System.out.println("___________________________________________");
        System.out.println("The character with greater value is: " + greaterChar);
        System.out.println("___________________________________________");
        // Show the ASCII
        System.out.println("Showing the ASCII Codes");
        System.out.println(ch1 + " : " + (int) ch1);
        System.out.println(ch2 + " : " + (int) ch2);
    }
}
