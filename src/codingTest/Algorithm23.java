package codingTest;

import java.util.Scanner;

class Algorithm23 {

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


        return result;
}

    public static void main(String[] args) {
        Algorithm23 algorithm = new Algorithm23();
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
