package codingTest;

import java.util.Scanner;
import java.util.Stack;


class Algorithm41 {

    public int solution(String str) {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1) == '('){
                    result+= stack.size();
                }else result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm41 algorithm = new Algorithm41();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(algorithm.solution(str));

    }
}
