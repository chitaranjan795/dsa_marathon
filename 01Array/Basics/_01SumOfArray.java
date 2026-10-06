/* 
    Given an array and calculate the sum of each elements and print the sum.
*/

public class _01SumOfArray {
    public static void main(String[] args) {
        // int[] arr = { 1, 10, 19, 6, 17, 15 };
        int[] arr = { 1, 10, 19, 6, -17, 15 };

        int sum = 0;

        for (int i : arr) {
            sum += i;
            System.out.println(sum);
        }
        System.err.printf("Sum is: %d", sum);

    }
}

// The TC is O(N) because the array traverse till the N elements.