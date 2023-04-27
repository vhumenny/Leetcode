package isPalindrome;

public class Main {
    public static void main(String[] args) {
        int x = 123454321;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindromeString("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(int x) {

        if (x < 0)
            return false;
        int reverse = 0;
        int y = x;
        while (y > 0) {
            int a = y % 10;
            reverse = reverse * 10 + a;
            y = y / 10;
        }
        if (reverse == x)
            return true;
        else
            return false;
    }

    public static boolean isPalindromeString(String input) {
        String a = input.toLowerCase().trim().replaceAll("[^a-z]", "");
        StringBuilder b = new StringBuilder();
        for (int i = a.length() - 1; i > -1; i--) {
             b.append(a.charAt(i));
        }

        return a.contentEquals(b);
    }
}
