package com.array.problem;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.add("A");
        stack.add("B");
        stack.add("D");
        stack.add("E");
        System.out.println(stack);
        System.out.println(stack.peek()); // it check top value in stack but does not remove
        System.out.println(stack);
        stack.push("F");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());



    }
}
