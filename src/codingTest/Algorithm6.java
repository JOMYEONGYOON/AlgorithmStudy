package codingTest;

import java.util.Scanner;

class Algorithm6 {
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
        Algorithm6 Algorithm6 = new Algorithm6();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(Algorithm6.solution(str));

    }


}
