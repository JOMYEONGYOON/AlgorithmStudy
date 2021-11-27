package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

class Algorithm18 {
    public boolean isPrime(int num) {
        if(num ==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int n, int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            int tmp = a[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10+t;
                tmp /= 10;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Algorithm18 algorithm = new Algorithm18();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        algorithm.solution(n,a);
        System.out.println();

    }
}
