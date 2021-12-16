package codingTest;

import java.util.HashMap;
import java.util.Scanner;


class Algorithm33 {

    public String solution(String str1,String str2) {
        String result = "YES";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char x : str1.toCharArray()) {
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }
        for (char b: str2.toCharArray()) {
            if(!hashMap.containsKey(b) || hashMap.get(b) == 0) return "NO";
            hashMap.put(b, hashMap.get(b)-1);
        }

        return result;
}

    public static void main(String[] args) {
        Algorithm33 algorithm = new Algorithm33();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println(algorithm.solution(str1,str2));

    }
}
