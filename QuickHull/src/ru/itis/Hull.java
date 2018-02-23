package ru.itis;

import java.util.ArrayList;
import java.util.Collections;

public class Hull {
    ArrayList<Point> points;
    ArrayList<Point> hull;

    public ArrayList<Point> getHull() {
        return hull;
    }

    public Hull(ArrayList<Point> points) {
        hull = new ArrayList<Point>();
        Collections.sort(points);

        Point left = points.get(0);
        Point right = points.get(points.size() - 1);
        hull.add(left);
        hull.add(right);

        Vector vec1 = new Vector(left, right);
        Vector vec2 = new Vector(right, left);
        find(vec1);
        find(vec2);
    }

    public void find(Vector v1) {
        double maxS = 0.0;
        Point maxPoint = v1.getEnd();

        for (Point p : points) {
            if (p != v1.getStart() && p != v1.getEnd()) {
                double sinus = v1.sin(p);
                if (sinus >= 0) {
                    Vector v2 = new Vector(v1.getStart(), p);
                    double s = 0.5 * v1.getLength() * v2.getLength();
                    if (s > maxS) {
                        maxS = s;
                    }
                }
            }
        }
        if (!maxPoint.equals(v1.getEnd())) {
             hull.add(maxPoint);
             Vector vector1 = new Vector(v1.getStart(), maxPoint);
             Vector vector2 = new Vector(maxPoint, v1.getEnd());
             find(vector1);
             find(vector2);
        }
    }

}
