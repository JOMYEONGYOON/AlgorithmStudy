package codingTest;

import java.util.Locale;
import java.util.Scanner;

public class Algorithm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        int result = 0;
        str = str.toUpperCase(Locale.ROOT);
        str = str.toLowerCase(Locale.ROOT);
        c = Character.toUpperCase(c);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c) {
                result++;
            }
        }
        System.out.println(result);


    }
}
