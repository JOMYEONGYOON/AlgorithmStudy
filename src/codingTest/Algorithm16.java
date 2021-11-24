package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

class Algorithm16 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int a = 1;
        int b = 1;
        arrayList.add(a);
        arrayList.add(b);
        for(int i=2;i<n;i++){
            int result = a+b;
            arrayList.add(result);
            a = b;
            b = result;
        }

        return arrayList;
    }

    public static void main(String[] args) {
        Algorithm16 algorithm = new Algorithm16();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int result:algorithm.solution(n)) {
            System.out.print(result + " ");
        }

    }
}
