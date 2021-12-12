package codingTest;

import java.util.Scanner;


class Algorithm29 {

    public int solution(int n,int[] arr) {
        int result = 0;
        int sum = 0;
        int lt = 0;
        for(int i=0;i<n/2+1;i++){
            sum += arr[i];
            if(sum == n)  result++;
            while(sum >= n) {
                sum -= arr[lt++];
                if(sum== n) result++;
            }
        }
        return result;
}

    public static void main(String[] args) {
        Algorithm29 algorithm = new Algorithm29();
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
