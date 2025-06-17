public class Instance {
    public static void main(String[] args) {
        String name = "Preeti"; // non-primitive data type
        boolean result;

        // Check if name is an instance of String
        result = name instanceof String;

        System.out.println("\nIs 'name' an instance of String? " + result);
    }
}
