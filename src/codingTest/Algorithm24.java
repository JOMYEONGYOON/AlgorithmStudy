package codingTest;

import java.util.Scanner;

class Algorithm24 {

    public int solution(int n,int m, int[][] a) {
        int result = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt=0;
                for(int k=0; k<m; k++){
                    int pi=0, pj=0;
                    for(int s=0; s<n; s++){
                        if(a[k][s]==i) pi=s;
                        if(a[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    result++;
                    //System.out.println(i+" "+j);
                }
            }
        }


        return result;
}

    public static void main(String[] args) {
        Algorithm24 algorithm = new Algorithm24();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println(algorithm.solution(n,m, a));


    }
}
