package howManyNumbersAreSmallerThanTheCurrent;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) answer[i]++;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
