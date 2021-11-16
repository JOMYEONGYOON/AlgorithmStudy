package codingTest;

import java.util.Scanner;

class Algorithm8 {
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
        Algorithm8 Algorithm7 = new Algorithm8();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(Algorithm7.solution(str));

    }


}
