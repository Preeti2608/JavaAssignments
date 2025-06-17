package Buildinfunctions;

public class StringFunctions {
    public static void main(String[] args) {
        String str = "Hello Java";

        System.out.println("\nLength: " + str.length()); // length of the string
        System.out.println("Uppercase: " + str.toUpperCase()); // convert to upper case
        System.out.println("Lowercase: " + str.toLowerCase()); // convert to lower case
        System.out.println("Substring: " + str.substring(6)); // substring from index 6
        System.out.println("Char at index 1: " + str.charAt(1)); // character at index 1
    }
}
