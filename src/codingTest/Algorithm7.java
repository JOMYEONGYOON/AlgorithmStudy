package codingTest;

import java.util.Scanner;

class Algorithm7 {
    public String solution(String str) {
        String result = "";

        str = str.toUpperCase();

        for (int i=0;i<str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)) {
                result = "YES";
            }else {
                result = "NO";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm7 algorithm = new Algorithm7();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(algorithm.solution(str));

    }


}
