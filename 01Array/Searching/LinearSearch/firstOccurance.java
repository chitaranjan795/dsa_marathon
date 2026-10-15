public class firstOccurance {

    static int firstoccurance(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 9, 71, 5, 9 };
        int target = 9;
        int result = firstoccurance(arr, target);
        System.out.println(result);
    }
}
