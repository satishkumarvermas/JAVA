import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        System.out.println("Original array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
    }
}
