public class SubtractionCalculator {

    // Function to calculate subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 7;

        int result = subtract(num1, num2);
        System.out.println("\nResult of subtraction: " + result);
    }
}