package homework01.modelElements;

import homework01.otherClasses.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points = new ArrayList<>();

    public Poligon(List<Point3D> points) {
        this.points = points;
    }
}
