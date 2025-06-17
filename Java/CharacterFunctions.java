public class CharacterFunctions {
    public static void main(String[] args) {
        char ch1 = '5';
        char ch2 = 'A';
        char ch3 = 'a';

        // Check if ch1 is a digit
        System.out.println("\nIs '5' a digit? " + Character.isDigit(ch1));

        // Check if ch2 is a letter
        System.out.println("Is 'A' a letter? " + Character.isLetter(ch2));

        // Convert lowercase to uppercase
        System.out.println("Uppercase of 'a': " + Character.toUpperCase(ch3));
    }
}

