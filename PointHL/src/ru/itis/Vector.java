package ru.itis;

public class Vector {
    Point start, end;

    double vX;
    double vY;
    double length;

    public Vector(Point start, Point end) {
        this.start = start;
        this.end = end;

        vX = end.getPointX() - start.getPointX();
        vY = end.getPointY() - start.getPointY();
        this.length = Math.sqrt(Math.pow(vX, 2) + Math.pow(vY, 2));
    }

    public double pseudoScalar(Vector vector) {
        return (vX * vector.vY) - (vY * vector.vX);
    }

    public boolean isLower(Point point) {
        Vector vc = new Vector(start, point);
        if ((pseudoScalar(vc) / (this.length * vc.length)) >= 0) {
            return false;
        } else {
            return true;
        }
    }

}
