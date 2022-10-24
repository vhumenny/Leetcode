package minimumSumOfNumberAfterSplitting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num = 9884;

        char[] array = (num + "").toCharArray();
        Arrays.sort(array);
        int a = Integer.parseInt("" + array[0] + array[2]);
        int b = Integer.parseInt("" + array[1] + array[3]);
        System.out.println(a + b);
    }
}
