package codingTest;

import java.util.Scanner;

class Algorithm8 {
    public String solution(String str) {
        String result = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String str2 = new StringBuilder(str).reverse().toString();
        if(str.equals(str2)) result = "YES";
        return result;
    }

    public static void main(String[] args) {
        Algorithm8 algorithm = new Algorithm8();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(algorithm.solution(str));
    }
}
