package backJoon;

import java.util.Scanner;

public class B2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[] n = new int[size];
        int sum = 0;
        for(int i=0;i<size;i++){
            n[i] = scanner.nextInt();
            sum += n[i] * n[i];
        }
        System.out.println(sum%10);
    }
}
