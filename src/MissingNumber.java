import java.util.Arrays;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.Example 1:
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        var biggestnum = nums.length;
        for (int i = 0; i <= biggestnum; i++) {
            var found = false;
            for (var a : nums) {
                if (i == a) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        var sol = new MissingNumber();
        var test = new int[]{};

        var a = sol.missingNumber(test);
        System.out.println(a);
    }
}
