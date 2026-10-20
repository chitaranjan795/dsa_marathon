/*
 * LC 1929 - Concatenation_of_Array
 * Link: https://leetcode.com/submissions/detail/2177080865/
 * Difficulty: Easy
 * Date solved: 20 oct 2026 | Attempts: 2 | Needed hint: No
 * Time: O(n) Because iterate 2 times | Space: O(n), Because it creates an output array of size 
 */


import java.util.Arrays;
import java.util.Scanner;

public class LC1929_Concatenation_of_Array {
    static int[] getConcatenation(int[] nums) {

        if (nums.length == 0) {
            return new int[0];
        }
        
        int outputLength = 2 * nums.length;
        int ans[] = new int[outputLength];
        int j = 0;

        for (int i = 0; j < outputLength; i++) {
            if (i == nums.length) {
                i = 0;
            }
            ans[j] = nums[i];
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int numberOfElement = sc.nextInt();

        int nums[] = new int[numberOfElement];

        System.out.printf("Enter %d elements: ", nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int ans[] = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));

        sc.close();

    }

}
