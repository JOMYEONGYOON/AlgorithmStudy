package programmers;

import java.util.Scanner;

public class Lv1Algorithm04 {

    public int solution(int n) {
        int answer = 0;
        int tmp;
        while(n>0) {
            tmp = n/10;
            answer += n%10;
            n = tmp;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lv1Algorithm04 main = new Lv1Algorithm04();
        int n = in.nextInt();
        System.out.println(main.solution(n));
    }
}
