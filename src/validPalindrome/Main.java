package validPalindrome;

public class Main {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(s.trim());
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String s1 = "";
        for (int i = 0; i <s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i))) {
                s1 += s.charAt(i);
            }
        }
//        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        return s2.equals(s1);
    }
}
