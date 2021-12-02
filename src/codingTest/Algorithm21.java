package codingTest;

import java.util.Scanner;

class Algorithm21 {

    public int solution(int n, int[][] a) {
        int result = Integer.MIN_VALUE;
        int sum1;
        int sum2;
        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += a[i][j];
                sum2 += a[j][i];
            }
            result = Math.max(result, sum1);
            result = Math.max(result, sum2);
        }

        sum1 = 0;
        sum2 = 0;

        for (int i = 0; i < n; i++) {

            sum1 += a[i][i];
            sum2 += a[i][n - i - 1];
        }
        result = Math.max(result, sum1);
        result = Math.max(result, sum2);

        return result;
    }

    public static void main(String[] args) {
        Algorithm21 algorithm = new Algorithm21();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println(algorithm.solution(n, a));


    }
}
