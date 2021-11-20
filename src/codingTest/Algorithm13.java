package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

class Algorithm13 {
    public ArrayList<Integer> solution(int cnt[] , int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(cnt[0]);
        for(int i=1;i<n;i++){
          if(cnt[i] > cnt[i-1]) {
              arrayList.add(cnt[i]);
          }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        Algorithm13 algorithm = new Algorithm13();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt[] = new int[n];
        for (int i=0;i<n;i++) {
            cnt[i] = scanner.nextInt();
        }
        for (int result : algorithm.solution(cnt,n)) {
            System.out.print(result);
        }

    }
}
