package com.alessandron3;

import java.util.Stack;

public class BalancedBracketsWithStack {

    public static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(stack.isEmpty()) {
                return false;
            } else {
                char poppedChar = stack.pop();
                if (!isBalanced(poppedChar, s.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isBalanced(char o, char c) {
        if((o == '(' && c == ')') ||
           (o == '[' && c == ']') ||
           (o == '{' && c == '}'))
            return true;

        return false;
    }
}
