/*
 * LC 7 - Reverse Integer
 * Link: https://leetcode.com/submissions/detail/2183137688/
 * Difficulty: Medium
 * Date solved: 27 Oct 2026 | Attempts: 3 | Needed hint: yes
 * Time: O(n) | Space: O(1)
 *
 * Approach: pop the last digit with % 10, push it onto the reversed number.
 * Before every push, check whether rev * 10 + digit would overflow int.
 *
 * Where I got stuck: I did the overflow check AFTER computing rev * 10 + digit,
 * but Java ints wrap silently, so the check never fired. The check must happen
 * BEFORE the multiplication.
 */

package Maths;

class Solution {
    static int reverse(int x) {
        int reverseNum = 0;

        while (x != 0) {
            int lastDigit = x % 10;

            if (reverseNum > Integer.MAX_VALUE / 10
                    || (reverseNum == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            if (reverseNum < Integer.MIN_VALUE / 10
                    || (reverseNum == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            reverseNum = reverseNum * 10 + lastDigit;
            x /= 10;
        }
        return reverseNum;
    }

    public static void main(String[] args) {
        int num = 998;
        System.out.println(reverse(num));
    }
}