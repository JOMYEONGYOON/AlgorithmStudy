package codingTest;

import java.util.Arrays;
import java.util.Scanner;


class Algorithm49 {

    public String solution(int size, int[] arr) {
        String result = "U";
        Arrays.sort(arr);
        for(int i=0;i<size-1;i++){
            if(arr[i] == arr[i+1]) return "D";
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm49 algorithm = new Algorithm49();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(algorithm.solution(n, arr));
    }
}

