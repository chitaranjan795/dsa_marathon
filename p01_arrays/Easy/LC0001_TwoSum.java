/*
 * LC 1 - Two Sum
 * Link: https://leetcode.com/submissions/detail/2172107260/
 * Difficulty: Easy
 * Date solved: 14 oct 2026 | Attempts: 1 | Needed hint: No
 * Time: O(n) | Space: O(n)
 */

import java.util.Arrays;
import java.util.Scanner;

public class LC0001_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];

                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No two elements found.");
        }

        sc.close();
    }
}
