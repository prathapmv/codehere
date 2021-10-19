package codingcontest;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.push(1);
        input.push(2);
        input.push(3);

        // System.out.println(input.peek() + " -- " + input.pop());
        reverseStack(input);
        System.out.println(input);
    }

    private static void insertAtBottom(Stack<Integer> stack, int ele) {
        if (stack.isEmpty()) {
            stack.push(ele);
            return;
        }

        int top = stack.pop();

        insertAtBottom(stack, ele);

        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        reverseStack(stack);

        insertAtBottom(stack, top);

    }

}
