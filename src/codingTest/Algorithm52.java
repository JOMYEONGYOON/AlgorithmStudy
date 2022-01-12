package codingTest;

import java.util.Arrays;
import java.util.Scanner;


class Algorithm52 {

    public int solution(int n, int m, int[] arr) {
        int result = 0;
        int lt = 0, rt = n - 1;
        Arrays.sort(arr);
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
                if(arr[mid] == m){
                    result = mid +1;
                    break;
            }
                if(arr[mid] > m) rt = mid-1;
                else lt = mid+1;
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm52 algorithm = new Algorithm52();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.print(algorithm.solution(n, m, arr));
    }
}

