public class _03 {

    // Function to check if a number is even or odd
    public static String checkEvenOdd(int num) {
        return num % 2 == 0 ? "even" : "odd";
    }

    // Function to print the multiplication table for a given number
    public static void printTable(int num) {
        System.out.println(num + " is " + checkEvenOdd(num) + ".");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println(); // Blank line for separation
    }

    // Main function
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            printTable(i);
        }
    }
}