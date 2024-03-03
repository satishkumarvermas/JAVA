import java.util.Arrays;
import java.util.Collections;

public class Descending {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 7};
        System.out.println("Original array: " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
    }
}

