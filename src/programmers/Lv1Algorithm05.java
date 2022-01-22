package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lv1Algorithm05 {

    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        StringBuilder strbuilder = new StringBuilder();
        for (String list: arr) {
            strbuilder.append(list);
        }
        return Long.parseLong(strbuilder.reverse().toString());
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lv1Algorithm05 main = new Lv1Algorithm05();
        int n = in.nextInt();
        System.out.println(main.solution(n));
    }
}
