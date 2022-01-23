package programmers;

import java.util.Scanner;

public class Lv1Algorithm06 {

    public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String[] arr = sb.toString().split("");
        int[] answer = new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lv1Algorithm06 main = new Lv1Algorithm06();
        int n = in.nextInt();
        for (int answer :main.solution(n)) {
            System.out.print(answer + " ");
        }

    }
}
