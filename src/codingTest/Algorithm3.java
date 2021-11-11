package codingTest;

import java.util.Locale;
import java.util.Scanner;

public class Algorithm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split(" ");
        String result = "";
        int min = Integer.MIN_VALUE;
        for (String x: split) {
            int split_len = x.length();
            if(split_len > min ) {
                min = split_len;
                result = x;
            }
        }
        System.out.println(result);
    }
}
