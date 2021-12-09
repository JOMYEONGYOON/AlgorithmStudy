package codingTest;

import java.util.*;


class Algorithm26 {

    public ArrayList<Integer> solution(int n, int m, int[] arr , int[] arr2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int p1=0, p2=0;
        while(p1<n && p2<m) {
            if(arr[p1] == arr2[p2]){
                arrayList.add(arr[p1++]);
            }
            else if(arr[p1]<arr2[p2]) p1++;
            else p2++;
        }
        return arrayList;
}

    public static void main(String[] args) {
        Algorithm26 algorithm = new Algorithm26();
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
            System.out.print(result + " ");
        }



    }
}
