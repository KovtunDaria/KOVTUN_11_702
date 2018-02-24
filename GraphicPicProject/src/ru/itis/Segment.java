package ru.itis;

public class Segment implements Comparable<Segment>{
    double cooX1, cooY1;
    double cooX2, cooY2;
    double length;

    public double getCoordinateX1() {
        return cooX1;
    }

    public double getCoordinateY1() {
        return cooY1;
    }

    public double getCoordinateX2() {
        return cooX2;
    }

    public double getCoordinateY2() {
        return cooY2;
    }

    public Segment(double cooX1, double cooY1, double cooX2, double cooY2) {
        this.cooX1 = cooX1;
        this.cooY1 = cooY1;
        this.cooX2 = cooX2;
        this.cooY2 = cooY2;
        this.length = Math.sqrt((cooX2-cooX1)*(cooX2-cooX1)+(cooY2-cooY1)*(cooY2-cooY1));
    }

    public double getLength() {
        return length;
    }

    @Override
    public int compareTo(Segment o) {
        return Double.compare(this.length, o.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Segment segment = (Segment) o;

        if (Double.compare(segment.cooX1, cooX1) != 0) return false;
        if (Double.compare(segment.cooY1, cooY1) != 0) return false;
        if (Double.compare(segment.cooX2, cooX2) != 0) return false;
        return Double.compare(segment.cooY2, cooY2) == 0;
    }

    @Override
    public String toString() {
        return "(" +
                cooX1 +
                "; " + cooY1 +
                "), (" + cooX2 +
                "; " + cooY2 +
                ")";
    }
}
