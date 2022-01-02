package codingTest;

import java.util.Scanner;


class Algorithm48 {

    public int[] solution(int size, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) if (x == cache[i]) pos = i;
            if (pos == -1) {
                if (size - 1 >= 0) System.arraycopy(cache, 0, cache, 1, size - 1);
            } else {
                System.arraycopy(cache, 0, cache, 1, pos);
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        Algorithm48 algorithm = new Algorithm48();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : algorithm.solution(s, arr)) System.out.print(x + " ");
    }
}

