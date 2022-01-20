package backJoon;

import java.util.Scanner;

public class B17087 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = Math.abs(in.nextInt()-s);
        }
        int answer = arr[0];
        for(int i=1;i<n;i++){
          answer = gcd(answer,arr[i]);
        }
        System.out.println(answer);


    }
    static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
}
