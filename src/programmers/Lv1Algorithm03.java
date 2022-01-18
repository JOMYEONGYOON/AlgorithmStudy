package programmers;

import java.util.Scanner;

public class Lv1Algorithm03 {

            public String solution(String s) {
                String answer = "";
                String[] str = s.split("");
                int idx = 0;
                for(int i=0;i<s.length();i++){
                    if(str[i].equals(" ")) idx = 0;
                    else if(idx%2 == 0) {
                        str[i] = str[i].toUpperCase();
                        idx++;
                    }
                    else if(idx%2 != 0) {
                        str[i] = str[i].toLowerCase();
                        idx++;
                    }
                    answer+= str[i];
                }

                return answer;
            }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lv1Algorithm03 main = new Lv1Algorithm03();
        String s = in.nextLine();
        System.out.println(main.solution(s));
    }
}
