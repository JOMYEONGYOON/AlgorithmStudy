package codingTest;

import java.util.Scanner;

class Algorithm12 {
    public String solution(String str) {
        String result = "";
        str = str+"";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                result += str.charAt(i);
                if (cnt > 1) {
                    result += String.valueOf(cnt);
                    cnt=1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm12 algorithm = new Algorithm12();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(algorithm.solution(str));

    }
}
