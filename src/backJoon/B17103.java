package backJoon;

import java.util.Scanner;

public class B17103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] check = new boolean[1000001];
        check[0] = check[1] = true;
        for(int i=0;i<=Math.sqrt(100000);i++){
            if(check[i]) continue;
            for(int j=i*i;j<1000001;j+=i){
                check[j] = true;
            }
        }
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int cnt = 0;
            int tmp = in.nextInt();
            for(int j=2;j<=tmp/2;j++){
                if(!check[j] && !check[tmp-j]) cnt++;
            }
            System.out.println(cnt);
        }



    }
}
