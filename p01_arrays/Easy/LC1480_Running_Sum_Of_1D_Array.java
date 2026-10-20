/*
 * LC 1480 - Running Sum of 1D Array
 * Link: https://leetcode.com/submissions/detail/2176230857/
 * Difficulty: Easy
 * Date solved: 19 oct 2026 | Attempts: 1 | Needed hint: No
 * Time: O(n) | Space: O(n)
 */

import java.util.Arrays;
import java.util.Scanner;

public class LC1480_Running_Sum_Of_1D_Array {

    static int[] runningSum(int[] nums) {
        int initial = 0;
        int length = nums.length;
        int[] sum = new int[length];

        for (int i = 0; i < length; i++) {
            initial += nums[i];
            sum[i] = initial;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] sum = runningSum(nums);

        System.out.println("Running Sum: " + Arrays.toString(sum));

        sc.close();
    }
}