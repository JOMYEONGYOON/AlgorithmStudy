package codingTest;

import java.util.Scanner;


class Algorithm28 {

    public int solution(int n, int m, int[] arr) {
        int result = 0;
        int sum = 0;
        int lt = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(m == sum) result++;
            while(m <= sum) {
                sum -= arr[lt++];
                if(m == sum) result++;
            }
        }
        return result;
}

    public static void main(String[] args) {
        Algorithm28 algorithm = new Algorithm28();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(algorithm.solution(n,m,arr));

    }
}
