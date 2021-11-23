package codingTest;

import java.util.Scanner;

class Algorithm15 {
    public String solution(int[] a, int[] b, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if ((a[i] == 1 && b[i] == 3) || (a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2)) {
                result.append("A");
            } else if (a[i] == b[i]) {
                result.append("D");
            }else {
                result.append("B");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Algorithm15 algorithm = new Algorithm15();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        for (char result: algorithm.solution(a, b, n).toCharArray()
             ) {
            System.out.println(result);
        }

    }
}
