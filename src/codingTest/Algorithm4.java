package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

class Algorithm4 {
    public ArrayList<String> solution(int n, String str[]) {
        ArrayList<String> result = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            result.add(tmp);
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm4 algorithm4 = new Algorithm4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        for (String result : algorithm4.solution(n, str)) {
            System.out.println(result);
        }

    }


}
