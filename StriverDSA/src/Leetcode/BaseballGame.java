package Leetcode;
/*
    682
    https://leetcode.com/problems/baseball-game/description/
 */

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] arr = {"5","2","C","D","+"};
        int result = calPoints(arr);
        System.out.println(result);
    }
    static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}
