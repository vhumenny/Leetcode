package validParentheses;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s = "{[]}";

        System.out.println(isValid2(s));
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') stack.push(character);
            else if (character == ')' && !stack.empty() && stack.peek() == '(') stack.pop();
            else if (character == '}' && !stack.empty() && stack.peek() == '{') stack.pop();
            else if (character == ']' && !stack.empty() && stack.peek() == '[') stack.pop();
            else return false;
        }
        return stack.empty();
    }
}
