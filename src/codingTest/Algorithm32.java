package codingTest;

import java.util.HashMap;
import java.util.Scanner;


class Algorithm32 {

    public char solution(int n, String str) {
        char result = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char x : str.toCharArray()) {
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }
        for (char x: hashMap.keySet()) {
            if(hashMap.get(x) > max){
                max = hashMap.get(x);
                result = x;
            }
        }

        return result;
}

    public static void main(String[] args) {
        Algorithm32 algorithm = new Algorithm32();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();

        System.out.println(algorithm.solution(n,str));

    }
}
