package codingTest;

import java.util.Scanner;
import java.util.Stack;


class Algorithm38 {

    public String solution(String str) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == ')'){
                while(stack.pop() != '(');
            }else {
                stack.push(x);
            }
        }
        for (Character character : stack) {
            result.append(character);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Algorithm38 algorithm = new Algorithm38();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(algorithm.solution(str));

    }
}
