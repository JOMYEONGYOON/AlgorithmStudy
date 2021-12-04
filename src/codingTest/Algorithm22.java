package codingTest;

import java.util.Scanner;

class Algorithm22 {

    public int solution(int n, int[][] a) {
        int result = 0,max=0;

        for (int i = 1; i <= n; i++) {
                int cnt = 0;
            for (int j = 1; j <= n; j++) {
                   for(int k=1;k<=5;k++){
                       if(a[i][k] == a[j][k]){
                           cnt++;
                           break;
                       }
                   }
                }
            if(cnt>max) {
                max=cnt;
                result=i;
            }

            }
        }

        return result;
    }

    public static void main(String[] args) {
        Algorithm22 algorithm = new Algorithm22();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println(algorithm.solution(n, a));


    }
}
