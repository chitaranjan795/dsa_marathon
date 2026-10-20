import java.util.Arrays;

public class LC1929_Concatenation_of_Array_v2 {

    static int[] getConcatenation(int nums[]) {
        int length = nums.length;
        int ans[] = new int[2 * length];

        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];
            ans[length + i] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int concate[] = getConcatenation(arr);
        System.out.println(Arrays.toString(concate));
    }
}