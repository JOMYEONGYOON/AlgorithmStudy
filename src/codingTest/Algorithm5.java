package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

class Algorithm5 {
    public String solution(String str) {
        char[] c = str.toCharArray();
        int left_len = 0;
        int right_len = str.length() - 1;
        while (left_len < right_len) {
            if (!Character.isAlphabetic(c[left_len])) {
                left_len++;
            } else if (!Character.isAlphabetic(c[right_len])) {
                right_len--;
            } else {
                char tmp = c[left_len];
                c[left_len] = c[right_len];
                c[right_len] = tmp;
                left_len++;
                right_len--;

            }
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        Algorithm5 algorithm5 = new Algorithm5();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(algorithm5.solution(str));

    }


}
