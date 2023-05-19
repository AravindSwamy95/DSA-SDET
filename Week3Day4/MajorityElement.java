package DSA;
import org.junit.Test;

import java.util.Arrays;

public class MajorityElement {

    // Time complexity: O(n log n)
    // Space complexity: O(1)
    @Test
    public void example1() {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    @Test
    public void example2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}


