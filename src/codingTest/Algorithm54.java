package codingTest;

class Algorithm54 {
    public int dfs(int n) {
        int answer = 0;
        if (n == 1) return 1;
        else {
         return n*dfs(n-1);
        }

    }


    public static void main(String[] args) {
        Algorithm54 algorithm = new Algorithm54();
        System.out.println(algorithm.dfs(5));
    }
}

