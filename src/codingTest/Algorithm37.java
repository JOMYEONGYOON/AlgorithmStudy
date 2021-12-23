package codingTest;

import java.util.Scanner;
import java.util.Stack;


class Algorithm37 {

    public String solution(String str) {
        String result = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == '('){
                stack.push(x);
            }else{
                if(stack.isEmpty())  return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return result;
    }

    public static void main(String[] args) {
        Algorithm37 algorithm = new Algorithm37();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(algorithm.solution(str));
    }
}
