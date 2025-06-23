package OOPs;

// Class with parameterized constructor to add numbers
class Adder {
    int num1, num2;

    // Parameterized constructor
    Adder(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // Method to return sum
    int getSum() {
        return num1 + num2;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object and pass numbers to constructor
        Adder addObj = new Adder(15, 25);

        // Call method to get sum
        int result = addObj.getSum();

        // Print result
        System.out.println("\nSum = " + result);
    }
}
