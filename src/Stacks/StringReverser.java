package Stacks;

import java.util.Stack;

public class StringReverser {
    public String reverse(String reverseMe){
        if(reverseMe == null){
            throw new IllegalArgumentException();
        }

        //Mosh's Solution
        Stack<Character> stack = new Stack<>();
        for (char ch : reverseMe.toCharArray()){
            stack.push(ch);
        }

        //Much more space efficient
        StringBuffer reversed = new StringBuffer();
        while(!stack.empty()){
            reversed.append(stack.pop());
        }
        //must toString string buffer
        return reversed.toString();

        //Dylan's Solution
//        char[] array = reverseMe.toCharArray();
//        Stack stack = new Stack();
//        for (char c:
//             array) {
//            stack.push(c);
//        }
//        String reversed = "";
//        while(!stack.empty()){
//            reversed+=stack.pop();
//        }
//        return reversed;
    }
}
