package codingTest;

import java.util.Scanner;

class Algorithm12 {
    public String solution(int cnt, String str2) {
        String result = "";
        for(int i=0;i<str2.length();i++){
            String tmp = str2.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            result += (char)num;
            str2 = str2.substring(7);
        }

        return result;
    }

    public static void main(String[] args) {
        Algorithm12 algorithm = new Algorithm12();
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        String str2 = scanner.next();
        System.out.println(algorithm.solution(cnt,str2));

    }
}
