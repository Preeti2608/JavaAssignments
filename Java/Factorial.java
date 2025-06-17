public class Factorial {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("\nFactorial of " + num + " is " + factorial(num));
    }
}