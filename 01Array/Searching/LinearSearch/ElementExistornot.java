/* Given an array and a target, return the index of the target. Return -1 if it is not found.
Example: arr = [4, 2, 7, 1, 9], target = 7 */

class ElementExistornot {

    static int checkExist(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 1, 9 };
        int target = 7;
        int result = checkExist(arr, target);
        System.out.println(result);
    }

}