package backJoon;

import java.util.Scanner;
import java.util.Stack;

public class B17413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (char c : str.toCharArray()) {

            if (c == '<') {
                flag = false;
                while (!stack.isEmpty()) {
                    builder.append(stack.pop());
                }
                builder.append("<");
            } else if (c == '>') {
                flag = true;
                builder.append(">");
            } else if (c == ' ') {
                flag = false;
                while (!stack.isEmpty()) {
                    builder.append(stack.pop());
                }
                builder.append(" ");
            } else {
                if (flag) {
                    stack.push(c);
                } else {
                    builder.append(c);
                }
            }
        }
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        System.out.print(builder);

    }
}
