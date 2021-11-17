package codingTest;

import java.util.Scanner;

class Algorithm9 {
    public int solution(String str) {
        str = str.toUpperCase().replaceAll("[A-Z]","");
        int result = Integer.parseInt(str);
        return result;
    }

    public static void main(String[] args) {
        Algorithm9 algorithm = new Algorithm9();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(algorithm.solution(str));
    }
}
