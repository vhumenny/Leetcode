package shuffleTheArray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 4, 6};

        int n = 3;
        int[] newNums1 = new int[nums.length];
        int j = n;
        int k = 0;

        for (int i = 0; i < n*2; i++) {
            newNums1[i] = nums[k];
            i++;
            k++;
            newNums1[i] = nums[j];
            j++;
        }
    }
}
