package codingTest;

import java.util.Scanner;

class Algorithm20 {

    public int[] solution(int n, int[] a) {
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int cnt = 1;
                if (a[i] > a[j]) {
                    cnt++;
                }
                a[i] = cnt;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm20 algorithm = new Algorithm20();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int x : algorithm.solution(n, a)
        ) {
            System.out.println(x);
        }

    }
}
