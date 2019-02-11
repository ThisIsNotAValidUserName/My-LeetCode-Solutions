import java.util.Arrays;

public class Solution88 {

    /**
     * Method 1
     * Concat nums to num1 then sort
     * 4ms, 90.62%
     */
    /*
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        System.arraycopy(nums1, 0, temp, 0, m);
        System.arraycopy(nums2, 0, temp, m, n);
        Arrays.sort(temp);
        for (int i = 0 ; i < temp.length ; i++) {
            nums1[i] = temp[i];
        }
    }
    */

    /**
     * Method 2
     * Fill the array without additional sorting
     * Hint: What if you fill the longer array from the end instead of start ?
     * 3ms, 100%
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        m--; n--;
        while (m >= 0 && n >= 0)
            nums1[index--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];

        while(n >= 0)
            nums1[index--] = nums2[n--];
    }

}
