package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Algorithm45 {

    public int solution(int n, int m, int[] arr){
        int result=0;
        Queue<Person> Q=new LinkedList<>();
        for(int i=0; i<n; i++){
            Q.offer(new Person(i, arr[i]));
        }
        while(!Q.isEmpty()){
            Person tmp=Q.poll();
            for(Person x : Q){
                if(x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                result++;
                if(tmp.id==m) return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Algorithm44 algorithm = new Algorithm44();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        System.out.println(algorithm.solution(n, m, arr));
    }
}
