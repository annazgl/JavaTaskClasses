package Zad7;

public abstract class Figure {
    protected double a;
    protected double b;

    public abstract double getArea();

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }


}