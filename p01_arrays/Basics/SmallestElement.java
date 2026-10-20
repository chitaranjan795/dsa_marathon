
// Find the smallest Element in the array

public class SmallestElement {
    public static void main(String[] args) {
        int smalestArr[] = { 2, 44, -87, 3, -2, -90, 1 };

        int smallest = smalestArr[0];

        for (int i : smalestArr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.printf("Smallest Element is: %d", smallest);

    }
}
