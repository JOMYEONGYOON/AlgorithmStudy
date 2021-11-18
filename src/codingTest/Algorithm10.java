package codingTest;

import java.util.Scanner;

class Algorithm10 {
    public int[] solution(String str, char t) {
        int [] result = new int[str.length()];
        int p = 1000;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == t) {
                p=0;
                result[i] = p;
            }else {
                p++;
                result[i]=p;
            }
        }
        p = 1000;
        for(int i= str.length()-1;i>=0; i--){
            if(str.charAt(i) == t) {
                p=0;
            }else {
                p++;
                result[i]=Math.min(result[i],p);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm10 algorithm = new Algorithm10();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        for (int x : algorithm.solution(str,c) ) {
            System.out.print(x);
        }
    }
}
