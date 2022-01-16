package programmers;

import java.util.Scanner;

public class Lv1Algorithm02 {

            public int solution(int n) {
                int answer = 0;
                for(int i=1;i<=n;i++){
                    if(n%i==0) answer+=i;
                }
                return answer;
            }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lv1Algorithm02 main = new Lv1Algorithm02();
        int n = in.nextInt();
        System.out.println(main.solution(n));
    }
}
