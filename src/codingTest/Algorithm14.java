package codingTest;

import java.util.Scanner;

class Algorithm14 {
    public int solution(int[] cnt, int n) {
        int max = cnt[0];
        int result = 1;
        for(int i=1;i<n;i++){
            if(cnt[i] > max) {
                max = cnt[i];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm14 algorithm = new Algorithm14();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cnt = new int[n];
        for (int i=0;i<n;i++) {
            cnt[i] = scanner.nextInt();
        }
        System.out.println(algorithm.solution(cnt,n));
    }
}
