package programmers;

import java.util.Scanner;

public class Lv1Algorithm07 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i<arr1.length; i++) {
            for(int j = 0; j<arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(answer[i][j]);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lv1Algorithm07 main = new Lv1Algorithm07();
        int[][] A = { { 1, 2}, { 2, 3 } };
        int[][] B = { { 3, 4 }, { 5, 6 } };
        main.solution(A, B);
    }
}
