package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Algorithm45 {

    public int[] solution(int n,int[] arr){
        for(int i=0;i<n-1;i++){
            int idx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[idx]) idx =j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Algorithm45 algorithm = new Algorithm45();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        for (int x: algorithm.solution(n,arr)
             ) {
            System.out.print(x + " ");
        }
    }
}
