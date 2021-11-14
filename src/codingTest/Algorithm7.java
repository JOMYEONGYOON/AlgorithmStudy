package codingTest;

import java.util.Scanner;

class Algorithm7 {
    public String solution(String str) {
        String result = "";
        for (int i=0;i<str.length();i++){
            if(i == str.indexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm7 Algorithm6 = new Algorithm7();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(Algorithm6.solution(str));

    }


}
