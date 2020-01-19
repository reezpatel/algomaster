import java.util.Stack;

public class Main {
    public static boolean balancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char popped = stack.pop();

                if ((ch == '}' && popped != '{') || (ch == ')' && popped != '(') || (ch == ']' && popped != '[')) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        boolean balanced = balancedBrackets("(([])(){}(())()())");

        assert balanced == true : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}