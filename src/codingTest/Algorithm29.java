package codingTest;

import java.util.Scanner;


class Algorithm29 {

    public int solution(int n, int m, int[] arr) {
        int result = 0;
        return result;
}

    public static void main(String[] args) {
        Algorithm29 algorithm = new Algorithm29();
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
