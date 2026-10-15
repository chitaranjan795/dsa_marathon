/*  Find the Last Occurrence — Find the index of the last occurrence of the target.
   Example: arr = [2, 5, 3, 5, 8], target = 5
   Output: 3
 */
public class LastOccurance {

    static int lastoccurance(int[] arr, int target) {
        
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;
            }
        }

        return lastIndex;
        
    }
    
    public static void main(String[] args) {
        int[] arr = { 5, 4, 9, 71, 5, 9 };
        int target = 9;
        int result = lastoccurance(arr, target);
        System.out.println(result);
    }
}
