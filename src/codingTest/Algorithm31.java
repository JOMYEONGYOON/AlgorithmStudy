package codingTest;

import java.util.Scanner;


class Algorithm31 {

    public int solution(int n, int k , int []arr) {
        int result = 0, cnt = 0 , lt=0;
        for(int rt=0;rt<n;rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k) {
                if(arr[lt]==0) cnt--;
                lt++;
            }
            result= Math.max(result,rt-lt+1);
        }

        return result;
}

    public static void main(String[] args) {
        Algorithm31 algorithm = new Algorithm31();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(algorithm.solution(n,k,arr));

    }
}
