package Zad7;

public class Main {
    /*Stwórz abstrakcyjną klasę Figure z dwoma polami a i b typu double, konstruktorem inicjującym te wartości oraz
     abstrakcyjną metodą do obliczania pola figury getArea(double a, double b). Następnie stwórz podklasy:
       Rectangle(prostokąt), Triangle (trójkąt prostokątny)
       W klasach pochodnych zaimplementuj metodę z klasy bazowej. Następnie stwórz klasę testową, utwórz w niej każdy z
       obiektów i wyświetl ich powierzchnie.*/

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5);
        // lub Figure triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(2,4 );
        // lub Figure rectangle = new Rectangle(4, 5);
        System.out.println(triangle.getArea());
        System.out.println(rectangle.getArea());
    }
}
