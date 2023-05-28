package longestCommonPrefix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strs = new String[]{"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            String prefix = result.toString() + strs[0].charAt(i);
            boolean isCharCommon = Arrays.stream(strs).allMatch(s -> s.startsWith(prefix));

            if (isCharCommon) result.append(strs[0].charAt(i));
            else break;
        }
        return result.toString();
    }
}
