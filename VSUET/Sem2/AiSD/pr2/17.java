package Sem2.AiSD.pr2;
import java.util.Scanner;
class main {
    public static boolean checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else if (isCloseBracket(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char prev = stack.pop();
                if (!isMatching(prev, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }
    
    private static boolean isCloseBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}';
    }
    
    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}
