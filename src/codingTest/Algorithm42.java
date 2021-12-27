package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


class Algorithm42 {

    public int solution(int n,int k) {
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=n;i++) queue.offer(i);
            while(!queue.isEmpty()) {
                for(int j=1; j<k;j++){
                    queue.offer(queue.poll());
                }
                queue.poll();
                if(queue.size() == 1) result = queue.poll();
            }

        return result;
    }

    public static void main(String[] args) {
        Algorithm42 algorithm = new Algorithm42();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(algorithm.solution(n,k));

    }
}
