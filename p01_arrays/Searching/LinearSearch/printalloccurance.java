// ! Print All Occurrences—Print every index where the target appears.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class printalloccurance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter your target element: ");
        int target = sc.nextInt();

        int result[] = occurance(arr, target);
        System.out.println(Arrays.toString(result));

        sc.close();
    }

    static int[] occurance(int arr[], int target) {

        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices.add(i);
            }
        }

        if (indices.isEmpty()) {
            return new int[] { -1 };
        } else {
            System.out.println("your elements are: " + Arrays.toString(arr));
            return indices.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}