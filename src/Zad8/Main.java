package Zad8;

public class Main {
    /*Stwórz klasę Point2D, która przechowuje informacje na temat punktu  na przestrzeni dwuwymiarowej
     (współrzędne x oraz y). Klasa powinna zawierać konstruktor przyjmujący dwa argumenty i ustawiający pola obiektu
      zgodnie z podanymi parametrami.Napisz klasę Point3D dziedziczącą po Point2D, reprezentującą punkt w trójwymiarze
    (dodatkowe pole z). Klasa powinna zawierać konstruktor przyjmujący trzy argumenty i ustawiający pola obiektu zgodnie
     z podanymi parametrami.W klasie testowej utwórz obiekty obu klas i wypisz ich współrzędne.*/

    public static void main(String[] args) {
        Point2D p2 = new Point2D(2,4);
        Point3D p3 = new Point3D(2, 4,6);


        System.out.println(p2);
        System.out.println(p3);
    }
}