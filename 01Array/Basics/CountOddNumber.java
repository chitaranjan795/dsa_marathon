import java.util.Scanner;

public class CountOddNumber {
    static int countOdd(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int totalOddNumIs = countOdd(arr);
        System.out.println("Total odd numbers: " + totalOddNumIs);

        sc.close();
    }
}
