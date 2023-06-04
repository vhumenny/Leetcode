package searchInsertPosition;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 3, 5, 6};
//        int target = 5;

        int[] nums = new int[]{1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));

    }

    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                break;
            } else if (target < nums[i]) {
                result = i;
                break;
            } else if (i == nums.length - 1 && target > nums[i]) result = i + 1;
        }
        return result;
    }
}

