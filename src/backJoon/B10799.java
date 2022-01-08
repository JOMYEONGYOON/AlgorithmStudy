package backJoon;

import java.util.*;

public class B10799 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int result = 0;
        Stack<Character> stack = new Stack<>();
        int size = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '(') stack.push(str.charAt(i));
            else{
                stack.pop();
                if(str.charAt(i-1) == '(') result += stack.size();
                else result++;
            }
        }
        System.out.println(result);
    }
}
