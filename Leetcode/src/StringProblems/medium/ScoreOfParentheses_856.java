package StringProblems.medium;

import java.util.Stack;

public class ScoreOfParentheses_856 {
//    public static int scoreOfParentheses(String S) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < S.length(); i++) {
//            if (S.charAt(i) == '(') {
//                stack.push('(');
//            } else {
//                char first = stack.pop();
//                if (first == '(') {
//                    stack.push('1');
//                } else {
//                    char second = stack.pop();
//                    if (second == '(') {
//                        stack.push((char)(2 * (first - 48) + 48));
//                    } else {
//                        stack.push((char)(first + second - 48));
//                    }
//                }
//            }
//        }
//        while(stack.size() > 1) {
//            char first = stack.pop();
//            char second = stack.pop();
//            if (second == '(') {
//                stack.push((char)(2 * (first - 48) + 48));
//            } else {
//                stack.push((char)(first + second - 48));
//            }
//        }
//        return stack.pop() - 48;
//    }

    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack();
        stack.push(0); // The score of the current frame

        for (char c: S.toCharArray()) {
            if (c == '(')
                stack.push(0);
            else {
                int v = stack.pop();
                int w = stack.pop();
                stack.push(w + Math.max(2 * v, 1));
            }
        }
        return stack.pop();
    }
}
