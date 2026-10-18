import java.util.Scanner;

class countOddNumber { 
    static int countOdd(int[] arr, int size) { 
        if (arr.length == 0) { 
            return -1; 
        } 
        
        int count = 0; 
        for (int num : arr) { 
            if (num % 2 != 0) { 
                count += 1; 
            } 
        } 
        return count; 
    } 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of elements: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        } 
        
        int totalOddNumIs = countOdd(arr, size); 
        System.out.println("Total odd numbers: " + totalOddNumIs);

        // Good practice to close the scanner
        sc.close(); 
    } 
}
import java.util.Scanner;

class Solution { 
    static int countOdd(int[] arr, int size) { 
        if (arr.length == 0) { 
            return -1; 
        } 
        
        int count = 0; 
        for (int num : arr) { 
            if (num % 2 != 0) { 
                count += 1; 
            } 
        } 
        return count; 
    } 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of elements: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        } 
        
        int totalOddNumIs = countOdd(arr, size); 
        System.out.println("Total odd numbers: " + totalOddNumIs);

        // Good practice to close the scanner
        sc.close(); 
    } 
}
