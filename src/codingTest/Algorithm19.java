package codingTest;

import java.util.Scanner;

class Algorithm19 {

    public int solution(int n, int[] a) {
        int result = 0, cnt = 0;
        for (int i = 0; i < n ; i++) {
            if (a[i] == 1) {
                cnt++;
                result += cnt;
            } else {
                cnt = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm19 algorithm = new Algorithm19();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print(algorithm.solution(n, a));

    }
}
