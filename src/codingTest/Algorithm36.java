package codingTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;


class Algorithm36 {

    public int solution(int n , int k , int[] arr) {
        int result = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int m=j+1;m<n;m++){
                    treeSet.add(arr[i]+arr[j]+arr[m]);

                }
            }
        }
        int cnt = 0;
        for(int x : treeSet){
            cnt++;
            if(k== cnt) {
                return x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm36 algorithm = new Algorithm36();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(algorithm.solution(n, k , arr));

    }
}
