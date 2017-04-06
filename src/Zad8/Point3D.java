package Zad8;

public class Point3D extends Point2D {

    private double z;
    private final static String author = "Adam";

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + " ' " + z;
    }

    public static double getDistance(Point3D p1, Point2D p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        double dz = p1.getZ() - p2.getZ();

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}
