package codingTest;

import java.util.Scanner;
import java.util.Stack;


class Algorithm40 {

    public int solution(String postFix) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for(char a : postFix.toCharArray()){
           if(Character.isDigit(a)) stack.push(a-48);
           else{
               int rt = stack.pop();
               int lt = stack.pop();
               if(a == '+') stack.push(lt+rt);
               if(a == '*') stack.push(lt*rt);
               if(a == '/') stack.push(lt/rt);
               if(a == '-') stack.push(lt-rt);
           }
        result = stack.peek();
        }

        return result;
    }

    public static void main(String[] args) {
        Algorithm40 algorithm = new Algorithm40();
        Scanner scanner = new Scanner(System.in);
        String postFix = scanner.next();
        System.out.println(algorithm.solution(postFix));

    }
}
