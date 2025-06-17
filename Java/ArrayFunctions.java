import java.util.Arrays;

public class ArrayFunctions {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4};

        // Sort the array in ascending order
        Arrays.sort(arr);
        System.out.println("\nSorted array: " + Arrays.toString(arr));

        // Convert array to a string representation
        String arrStr = Arrays.toString(arr);
        System.out.println("Array as string: " + arrStr);

        // Binary search for an element (must be sorted)
        int index = Arrays.binarySearch(arr, 4);
        System.out.println("Index of 4: " + index);
    }
}
