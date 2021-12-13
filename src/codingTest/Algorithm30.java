package codingTest;

import java.util.Scanner;


class Algorithm30 {

    public int solution(int n,int[] arr) {
        int result = 0;

        return result;
}

    public static void main(String[] args) {
        Algorithm30 algorithm = new Algorithm30();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n/2+1;
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = i+1;
        }
        System.out.println(algorithm.solution(n,arr));

    }
}
