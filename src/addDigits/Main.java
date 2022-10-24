package addDigits;

public class Main {
    public static void main(String[] args) {
        int num = 234;

        if (num < 10) System.out.println(num);
        while (num > 9) {
            int a = num / 10;
            int b = num % 10;
            num = a + b;
        }
        System.out.println(num);
    }
}
