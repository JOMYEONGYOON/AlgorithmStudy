package backJoon;

import java.util.Scanner;
import java.util.Stack;

public class B17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        boolean check = true; // 태그안인지 아닌지 체크
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for(char ch : input.toCharArray()) {
            if(ch == '<') {
                check=false; // 태그 안을 의미
                // 태그 전까지의 문자 뒤집기
                while(!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append("<");
            } else if(ch == '>') {
                check = true; // 태그 탈출
                result.append(">");
            } else if(ch == ' ') {
                // 공백 전까지의 문자 뒤집기.
                while(!stack.isEmpty())
                    result.append(stack.pop());
                result.append(" ");
            } else {
                if(check) // 태그 밖
                    stack.push(ch);
                else // 태그 안.
                    result.append(ch);
            }
        }

        // 스택에 남은 문자 뒤집기.
        while(!stack.isEmpty())
            result.append(stack.pop());

        System.out.println(result);
        sc.close();

    }
}
