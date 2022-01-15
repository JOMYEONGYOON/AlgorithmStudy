package codingTest;


class Algorithm53 {
    public void dfs(int n) {
        if(n==0) return ;
        else {
            dfs(n/2);
            System.out.println(n%2+ " ");
        }
    }


    public static void main(String[] args) {
        Algorithm53 algorithm = new Algorithm53();
        algorithm.dfs(11);
    }
}

