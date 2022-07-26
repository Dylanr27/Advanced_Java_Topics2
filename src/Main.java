import Stacks.StringReverser;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "(1 + 2";
        String str1 = "(1 + 2>";
        String str2 = ")1+2(";
        String str3 = "((1+2)";
        String str4 = "(1+2)";
        String str5 = "((1+2))";
        String str6 = "((1 + 2)[a])";


    }

    public boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        for (char c :
                str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{' || c == '<'){
                stack.push(c);
            }
            if(c == ')' || c == ']' || c == '}' || c == '>'){

            }
        }
    }
}