package codingTest;

import java.util.Scanner;


class Algorithm30 {

    public int solution(int n) {
        int result = 0, cnt = 1;
        n--;
        while(n>0) {
            cnt++;
            n=n-cnt;
            if(n%cnt==0) result++;

        }
        return result;
}

    public static void main(String[] args) {
        Algorithm30 algorithm = new Algorithm30();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(algorithm.solution(n));

    }
}
