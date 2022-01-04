package backJoon;

import java.util.*;

public class B9012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            System.out.println(solution(scanner.next()));
        }
    }

    public static String solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(c);
            }
            else if(stack.empty()){
                return "NO";
            }
            else{
                stack.pop();
            }
        }
        if(stack.empty()) {
            return "YES";
        }
        else{
            return "NO";
        }

    }

}
