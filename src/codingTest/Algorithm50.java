package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Algorithm50 {

    public ArrayList<Integer> solution(int size, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int tmp[] = arr.clone();
        Arrays.sort(tmp);
        for(int i=0;i<size;i++){
            if(tmp[i] != arr[i]) {
               result.add(i+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm50 algorithm = new Algorithm50();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int result: algorithm.solution(n,arr)) {
            System.out.print(result + " ");
        }
    }
}

