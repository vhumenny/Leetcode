package twoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 22;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }
}
