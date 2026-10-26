public class p001_digitCount {
    public static void main(String[] args) {
        int num = 73;
        int noOfdigit = countDigit(num);
        System.out.println("No. of digit in" + num + " is: " + noOfdigit);
    }

    static int countDigit(int num) {
        int count = 0;

        while (num > 0) {
            num /= 10;
            count += 1;
        }
        return count;
    }
}