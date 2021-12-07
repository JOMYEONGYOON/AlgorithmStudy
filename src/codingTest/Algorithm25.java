package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

class Algorithm25 {

    public ArrayList<Integer> solution(int n, int m, int[] arr , int[] arr2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while(index1 < n && index2 < m) {
            if(arr[index1] < arr2[index2]) arrayList.add(arr[index1++]);
            else arrayList.add(arr2[index2++]);

        }
        while(index1 < n) {
            arrayList.add(arr[index1++]);
        }
        while(index2 < m) {
            arrayList.add(arr2[index2++]);
        }
        return arrayList;
}

    public static void main(String[] args) {
        Algorithm25 algorithm = new Algorithm25();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
             arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
             arr2[i] = scanner.nextInt();
        }
        for (int result: algorithm.solution(n,m,arr,arr2)) {
            System.out.println(result);
        }



    }
}
