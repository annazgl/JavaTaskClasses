package Zad7;

public class Rectangle extends Figure {

    public Rectangle(double a, double b) {

        super(a, b);
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
