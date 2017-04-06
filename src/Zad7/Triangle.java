package Zad7;

public class Triangle extends Figure{

    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return 0.5*(a*b);

    }
}
