package createTargetArrayInTheGivenOrder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[] index = new int[]{0, 1, 2, 2, 1};
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i > index[i]) {
                int[] temp = Arrays.copyOfRange(answer, index[i], answer.length - 1);
                answer[index[i]] = nums[i];
                for (int j = 0, k = index[i] + 1; j < temp.length; j++) {
                    answer[k] = temp[j];
                    k++;
                }
            } else answer[i] = nums[index[i]];
        }
        System.out.println(Arrays.toString(answer));
    }
}

