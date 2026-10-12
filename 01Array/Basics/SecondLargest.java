public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 25, 5, 40, 30, 77, 98, 99, 45, 76 };

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest number does not exist.");
        } else {
            System.out.println("Second largest number: " + secondLargest);
        }
    }
}