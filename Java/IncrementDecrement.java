public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("\nx = " + x);
        System.out.println("x++ = " + (x++)); // prints 5, then x becomes 6
        System.out.println("x-- = " + (x--)); // prints 6, then x becomes 5
        System.out.println("Final x = " + x + "\n");
    }
}

