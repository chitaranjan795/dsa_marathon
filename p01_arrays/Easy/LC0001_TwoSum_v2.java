// ! This is for sorted array.

import java.util.Arrays;

public class LC0001_TwoSum_v2 {

    static int[] getIndices(int arr[], int target) {
        int right = arr.length - 1;

        for (int left = 0; left < right;) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int target = 7;
        int Indices[] = getIndices(arr, target);
        System.out.println(Arrays.toString(Indices));
    }
}
