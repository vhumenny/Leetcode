import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int x = 434;

        System.out.println(isPalindrome(x));

        String address = "123.123.123.123";
        char[] ip = address.toCharArray();
        address = "";
        for (int i = 0; i < ip.length; i++) {
            if (Array.getChar(ip, i) == '.') {
                address += "["+Array.getChar(ip, i)+"]";

            }
            else address += Array.getChar(ip, i);

        }

        System.out.println(address);
    }
    public static boolean isPalindrome(int x) {

        String s = ""+x;
        char [] array = s.toCharArray();

        StringBuilder reversed = new StringBuilder();
        for (int i = array.length-1; i>=0; i--) {
            reversed.append(array[i]);
        }

        return Integer.valueOf(reversed.toString()).equals(x);
}
