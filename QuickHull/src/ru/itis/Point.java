package ru.itis;

public class Point implements Comparable<Point>{
    private double x, y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int compareTo(Point o) {
        return Double.compare(this.x, o.x);
    }

    public void output() {
        System.out.println(x + "; " + y);
    }
}
