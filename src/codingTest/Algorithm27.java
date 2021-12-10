package codingTest;

import java.util.Scanner;


class Algorithm27 {

    public int solution(int n, int m, int[] arr) {
        int result;
        int sum = 0;
        for(int i=0;i<m;i++){
            sum+= arr[i];
        }
        result = sum;
        for(int i=m;i<n;i++){
              sum+= arr[i]-arr[i-m];
              if(result < sum) result = sum;
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
