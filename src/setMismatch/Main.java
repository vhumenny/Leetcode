package setMismatch;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,2};
        int[] bucket = new int[nums.length+1];
        for (int i: nums) bucket[i]++;
        int miss = 0; int error=0;

        for (int i = 1; i < bucket.length; i++) {
            if (bucket[i]==2) error = i;
            if (bucket[i]==0) miss = i;
            if (error!=0 && miss!=0) break;
        }
        System.out.println(error+" "+miss);
    }
}

