package codingTest;

import java.util.HashMap;
import java.util.Scanner;


class Algorithm36 {

    public int solution(String s, String t) {
        int result = 0;
        int leng = t.length() - 1;
        HashMap<Character, Integer> shash = new HashMap<>();
        HashMap<Character, Integer> thash = new HashMap<>();

        for (char a : t.toCharArray()) {
            thash.put(a, thash.getOrDefault(a, 0) + 1);
        }
        for (int i = 0; i < leng; i++) {
            shash.put(s.charAt(i), shash.getOrDefault(s.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = leng; rt < s.length(); rt++) {
            shash.put(s.charAt(rt), shash.getOrDefault(s.charAt(rt), 0) + 1);
            if (shash.equals(thash)) result++;
            shash.put(s.charAt(lt), shash.get(s.charAt(lt)) - 1);
            if (shash.get(s.charAt(lt)) == 0) shash.remove(s.charAt(lt));
            lt++;
        }

        return result;
    }

    public static void main(String[] args) {
        Algorithm36 algorithm = new Algorithm36();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        System.out.println(algorithm.solution(s, t));

    }
}
