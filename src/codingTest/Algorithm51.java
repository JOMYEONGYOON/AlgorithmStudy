package codingTest;

import java.util.*;


class Point implements Comparable<Point>{

    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x- o.x;
    }
}


class Algorithm51 {


    public static void main(String[] args) {
        Algorithm51 algorithm = new Algorithm51();
        Scanner in = new Scanner(System.in);
        ArrayList<Point> arr = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for (Point o: arr) {
            System.out.println(o.x + " " + o.y);
        }
    }
}

