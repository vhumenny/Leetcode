package lengthOfLastWord;

public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        String s1 = s.stripTrailing();
        length = s1.substring(s1.lastIndexOf(' ') + 1).length();
        return length;
    }
}
