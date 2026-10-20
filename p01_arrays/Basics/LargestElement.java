// find the Largest Element from an array

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = { -2, -99, -35, -22, -5, -69 };

        // Use the largest element as the first element of the array
        int largest = arr[0];
        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println(largest);
    }
}