package codingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class Algorithm34 {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
         ArrayList<Integer> result = new ArrayList<>();
        int lt = 0;
        int count =0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
       for(int i=0;i<k-1;i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i],0)+1);
       }
       for (int rt=k-1;rt<n;rt++){
           hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt],0)+1);
           result.add(hashMap.size());
           hashMap.put(arr[lt], hashMap.get(arr[lt])-1);
           if(hashMap.get(arr[lt]) == 0) hashMap.remove(arr[lt]);
           lt++;
       }

        return result;
    }

    public static void main(String[] args) {
        Algorithm34 algorithm = new Algorithm34();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int result: algorithm.solution(n, k,arr)
             ) {
            System.out.print(result + " ");
        }


    }
}
