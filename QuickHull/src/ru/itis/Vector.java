package ru.itis;

public class Vector {
    private Point start, end;
    private double x, y;
    private double length;

    public Vector(Point start, Point end) {
        this.start = start;
        this.end = end;

        this.x = end.getX() - start.getX();
        this.y = end.getY() - start.getY();

        this.length = Math.sqrt(x*x + y*y);
    }

    public double sin(Point p) {
        Vector a = new Vector(start, end);
        Vector b = new Vector(start, end);

        double sin = (a.x*b.y - a.y*b.x)/(a.length *b.length);

        return sin;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLength() {
        return length;
    }
}
