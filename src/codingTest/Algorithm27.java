package codingTest;

import java.util.Scanner;


class Algorithm27 {

    public int solution(int n, int m, int[] arr) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++){
            int i1 = arr[i] + arr[i + 1] + arr[i + 2];
            if(i1 > max) {
                max = i1;
                result = max;
            }
        }
        return result;
}

    public static void main(String[] args) {
        Algorithm27 algorithm = new Algorithm27();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(algorithm.solution(n,m,arr));

    }
}
