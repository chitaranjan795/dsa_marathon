public class A_LinearSearch {

    // ✅ This function used to find the integer value found or not
    static int searchElement(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;
    }

    // ✅ This function is used to find the element present in the array or not?
    static int search_str_element(String str[], String target) {
        if (str.length == 0) {
            return -1;
        }

        for (String string : str) {
            if (string == target) {
                return 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // ✔ This is for integer datatype
        int arr[] = { 22, 44, 55, 1, 4, 9, 87, 76, 99, 100 };
        int target = 76;
        int result = searchElement(arr, target);
        if (result == 1) {
            System.out.printf("%d found \n", target);
        } else {
            System.out.printf("%d not found \n", target);
        }

        // ✔ This is for string datatype or array of string type
        String str[] = { "Chita", "Bishnu", "Chinmaya", "Sada", "Surya", "Chandan" };
        String strTarget = "Bishnu";
        int strResult = search_str_element(str, strTarget);
        if (strResult == 1) {
            System.out.printf("%s found \n", strTarget);
        } else {
            System.out.printf("%s not found \n", strTarget);
        }

    }

}