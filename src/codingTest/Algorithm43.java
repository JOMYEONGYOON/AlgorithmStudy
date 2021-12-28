package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Algorithm43 {

    public String solution(String str1, String str2){
        String result = "YES";
        Queue<Character> que = new LinkedList<>();
        for(char x : str1.toCharArray()) que.offer(x);
        for(char x : str2.toCharArray()) {
            if(que.contains(x)) {
                if(x!= que.poll()) return "NO";
            }
        }
        if(!que.isEmpty()) return "NO";
        return result;
    }

    public static void main(String[] args) {
        Algorithm43 algorithm = new Algorithm43();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String str2 = in.next();
        System.out.println(algorithm.solution(str,str2));

    }
}
