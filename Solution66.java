public class Solution66 {

    /**
     * Solution237 to LeetCode 66, 49.61%
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int currentDigit;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1)
                currentDigit = ++digits[i];
            else
                currentDigit = digits[i] + carry;
            if (currentDigit == 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = currentDigit;
                carry = 0;
            }
        }

        int[] result = new int[digits.length];
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = carry;
        }
        System.arraycopy(digits, 0, result, carry, digits.length);
        return result;
    }
}
