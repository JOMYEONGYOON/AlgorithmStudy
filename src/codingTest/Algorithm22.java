package codingTest;

import java.util.Scanner;

class Algorithm22 {
    int[] x = {-1, 0, 1, 0};
    int[] y = {0, 1, 0, -1};

    public int solution(int n, int[][] a) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int x1 = i + x[k]; //
                    int y2 = j + y[k]; //
                    if( x1>=0 && x1<n && y2 >=0 && y2 < n && a[x1][y2] >= a[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Algorithm22 algorithm = new Algorithm22();
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
