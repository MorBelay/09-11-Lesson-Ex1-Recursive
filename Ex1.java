
// מגישים: בלייב מור וחיים אשרף 50/5

public class Ex1 {

    // Calculate the sum of even numbers in the array
    public static int sumEven(int[] arr, int size) {

        // Check if the array and size are valid
        if (arr == null || size < 0 || size > arr.length) {
            return 0;
        }

        // Stop when there are no more elements
        if (size == 0) {
            return 0;
        }

        // Add the number if it is even
        if (arr[size - 1] % 2 == 0) {
            return arr[size - 1] + sumEven(arr, size - 1);
        }

        return sumEven(arr, size - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 7, 8};

        System.out.println(sumEven(arr, arr.length));
    }
}

// סיבוכיות: O(n)
