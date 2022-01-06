package backJoon;

import java.util.Scanner;

public class B3046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int s = scanner.nextInt();
        int result = 0;
        result = s*2 -r1;
        System.out.println(result);
    }
}
