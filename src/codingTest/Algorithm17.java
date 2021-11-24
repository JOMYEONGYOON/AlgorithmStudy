package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

class Algorithm17 {
    public int solution(int n) {
        int[] result = new int[n + 1];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if(result[i] == 0) {
                count++;
                for(int j=i;j <= n ; j=j+i){
                    result[j] = 1;
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        Algorithm17 algorithm = new Algorithm17();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(algorithm.solution(n));

    }
}
