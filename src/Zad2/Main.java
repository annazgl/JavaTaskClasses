package Zad2;

public class Main {

    /*Stwórz klasę Samochód posiadającą następujące atrybuty:
-brand,
​-model,
-price.
Stwórz metody dostępowe do atrybutów. Stwórz metodę show wyświetlającą markę oraz cenę w jednej linii.*/

    public static void main(String[] args) {

        Car car1 = new Car("Skoda", "Fabia", 45000);
        Car car2 = new Car("Fiat", "Panda", 15000);

        car1.show();
        car2.show();
    }
}