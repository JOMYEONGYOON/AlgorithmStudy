package codingTest;

import java.util.Scanner;


class Algorithm47 {

    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n ; i++) {
           int tmp = arr[i] ,j;
           for(j=i-1;j>=0; j--){
               if(arr[j] > tmp) arr[j+1] = arr[j];
               else break;
           }
           arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Algorithm47 algorithm = new Algorithm47();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : algorithm.solution(n, arr)
        ) {
            System.out.print(x + " ");
        }
    }
}
